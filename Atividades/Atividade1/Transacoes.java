import java.util.Random;

//Rodolfo Cochi 18.00202-0

public class Transacoes {
    int idConta;
    String recebedor;
    double saldo;

    // Metodos da classe
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    String gerarQr(Conta conta, double valor) {
        String.format("%s;%s;%s;%s", conta.getIdConta(), conta.getUsuario().getNome(), String.valueOf(valor),
                String.valueOf(getRandomNumberInRange(1000, 9999)));
    }

    boolean transferirSaldo(Conta conta1, Conta conta2, String Qr) {
        String[] dados = Qr.split(";");
        Double.parseDouble(dados[2]);
        if (conta1.getIdConta().equals(dados[0])) {
            if (((conta2.getIdConta()).equals(dados[0]))) {
                if ((conta1.getSaldo()) >= (Double.parseDouble(dados[2]))) {
                    conta1.sacar(Double.parseDouble(dados[2]));
                    conta2.depositar(Double.parseDouble(dados[2]));
                } else {
                    System.out.println("Saldo de " + conta1.getUsuario().getNome() + " nao deu.");
                }
            } else {
                System.out.println("Nao bateu.");
            }

        }
    }

}
