package Linguagens1_Projetos.Pratica2.Aula3;
public class ContaTestDrive{
    public static void main(String[] args) {
        //Declarar variaveis
        Conta c1;
        Conta c2;

        //Instancia Conta - coloca a referencia de um objeto
        c1 = new Conta();
        c2 = new Conta();

        //Info c1
        c1.cliente = new Cliente();
        c1.cliente.nome = "Kirishima";
        c1.saldo = 2000;

        //Info c2
        c2.cliente = new Cliente();
        c2.cliente.nome = "Yoh";
        c2.saldo = 500;

        //Operacoes c1
        System.out.println("" + c1.cliente.nome);
        c1.vizualizarSaldo();
        c1.sacar(500);
        c1.transferirDinheiro(c2, 500);
        c1.vizualizarSaldo();

        //Operacoes c2
        System.out.println("" + c2.cliente.nome);
        c2.vizualizarSaldo();

        

    }
}