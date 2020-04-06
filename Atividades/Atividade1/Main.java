
//Rodolfo Cochi 18.00202-0
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nomes
        String nome,nome2,nome3;
        System.out.println("Digite seu nome usuario 1 : ");
        nome = scanner.nextLine();
        System.out.println("Digite seu nome usuario 2 : ");
        nome2 = scanner.nextLine();
        System.out.println("Digite seu nome usuario 3 : ");
        nome3 = scanner.nextLine();

        //Criar Usuarios
        Usuario user = new Usuario(nome);
        Usuario user2 = new Usuario(nome2);
        Usuario user3 = new Usuario(nome3);

        
        //Gerar saldos
        double saldo,saldo2,saldo3;
        saldo = 10;
        saldo2 = 100;
        saldo3 = 1000;
        
    
        //Conta 
        Conta conta = new Conta(user,saldo);
        Conta conta2 = new Conta(user2,saldo2);
        Conta conta3 = new Conta(user3,saldo3);


        //Operacoes
        
        
        
        System.out.println(String.format("Usuario %s;Id %s;saldo %f",nome, conta.getIdConta(), conta.getSaldo()));
        System.out.println(String.format("Usuario %s;Id %s;saldo %f", nome2, conta2.getIdConta(), conta2.getSaldo()));
        System.out.println(String.format("Usuario %s;Id %s;saldo %f", nome3, conta3.getIdConta(), conta3.getSaldo()));

        


        

    }
}