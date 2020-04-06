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

    String gerarQr(Conta conta, double valor){
         String.format("%s;%s;%s;%s", conta.getIdConta(),conta.getUsuario().getNome(),String.valueOf(valor),String.valueOf(getRandomNumberInRange(1000,9999)));
    }


    boolean transferirSaldo(Conta pagante,Conta recebedor, String Qr) {
        String[]dados = Qr.split(";");
        Double.parseDouble(dados[2]);
        if (conta.getIdConta().equals(dados[0])){
            return true;
        }
    }

}
