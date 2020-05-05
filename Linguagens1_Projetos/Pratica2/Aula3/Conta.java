package Linguagens1_Projetos.Pratica2.Aula3;
public class Conta{

    //Atributos da Classe
    public int numero;
    public Cliente cliente;
    public double saldo;

    //Metodos da classe

    boolean sacar(double valor) {
        if (this.saldo < valor) {
            return false;
        }
        else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    void depositar(double valor){
        this.saldo += valor;
    }

    void vizualizarSaldo() {
        System.out.println("Saldo:R$ " + this.saldo);
    }

    boolean transferirDinheiro(Conta Destino, double valor){
        if(sacar(valor)){
            Destino.depositar(valor); 
            return true;
        }
        else{
            return false;
        }
    }

}