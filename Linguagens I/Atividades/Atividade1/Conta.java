package Atividades.Atividade1;
//Rodolfo Cochi 18.00202-0
public class Conta {
    private Usuario usuario;
    private double saldo;
    private String idConta;

    private static int contador = 0;

    public Conta(Usuario usuario, double saldo) {
        contador++;
        this.idConta = String.valueOf(contador);
        this.usuario = usuario;
        this.saldo = saldo;
    }

    public String getIdConta() {
        return idConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    //------------------
    // Metodos da classe
    //------------------
    boolean sacar(double valor) {
        if (this.saldo < valor) {
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }

    }

    void depositar(double valor) {
        this.saldo += valor;
    }

}