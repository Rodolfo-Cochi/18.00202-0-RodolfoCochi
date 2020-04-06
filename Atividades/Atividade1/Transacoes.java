import java.util.Random;

//Rodolfo Cochi 18.00202-0

public class Transacoes {
    int idConta;
    double saldo;

    // Metodos da classe
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static String gerarQr(Conta conta, double valor) {
        String Qr = String.format("%s;%s;%s;%s", conta.getIdConta(), conta.getUsuario().getNome(),
                String.valueOf(valor), String.valueOf(getRandomNumberInRange(1000, 9999)));
        return Qr;
    }

    // de, para, Qr
    public static void transferirSaldo(Conta conta, Conta conta2, String Qr) {
        String dados[] = Qr.split(";");
        if (conta.getIdConta().equals(dados[0])) {
            if ((conta.getSaldo()) >= (Double.parseDouble(dados[2]))) {
                conta.depositar(Double.parseDouble(dados[2]));
                conta2.sacar(Double.parseDouble(dados[2]));
            } else {
                System.out.println("Saldo de " + conta2.getUsuario().getNome() + " nao deu.");
            }
        } else {
            System.out.println("Nao bateu.");
        }

    }
}
