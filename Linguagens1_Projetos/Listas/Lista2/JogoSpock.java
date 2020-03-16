import java.util.Scanner;

public class JogoSpock {

    //Declaracao de variaveis
    Jogador J1;
    Jogador J2;
    String Ped = "pedra";
    String Pap = "papel";
    String Tes = "tesoura";
    String Spk = "spock";
    String Lzd = "lizard";
    Scanner scanner = new Scanner(System.in);

    
    //Criacao da funcao jogar 
    void spockzao(){
        
        //Criacao de jogador
        J1 = new Jogador();
        J2 = new Jogador();

        //Nome jogadores
        System.out.println("Digite seu nome J1: ");
        this.J1.nome = scanner.nextLine();
        System.out.println("Digite seu nome J2: ");
        this.J2.nome = scanner.nextLine();
        
        //Jogada 1
        System.out.println("Digite sua jogada jogador 1 (Pedra, Papel, Tesoura, Lizard ou Spock): " );
        this.J1.jogada = scanner.nextLine();

        //Limpar tela
        for (int i = 0; i < 11; ++i)  
        System.out.println(); 
        
        //Jogada 2
        System.out.println("Digite sua jogada jogador 2 (Pedra, Papel, Tesoura, Lizard ou Spock): ");
        this.J2.jogada = scanner.nextLine();

        //Limpar tela
        for (int i = 0; i < 11; ++i)  
        System.out.println(); 
        
        //Deixar a resposta comparavel
        this.J1.jogada = this.J1.jogada.toLowerCase();
        this.J2.jogada = this.J2.jogada.toLowerCase();

        //Vizualizacao
        System.out.println("" + this.J1.jogada);
        System.out.println("" + this.J2.jogada);

        //Comparar as jogadas
        if(this.J1.jogada.equals(this.J2.jogada)){
            System.out.println("O resultado eh um empate");
        }
        else if (this.J1.jogada.equals(Ped) && this.J2.jogada.equals(Tes)){
            System.out.println("Vitoria de " + this.J1.nome);
        }
        
        else if (this.J1.jogada.equals(Pap) && this.J2.jogada.equals(Ped)){
            System.out.println("Vitoria de " + this.J1.nome);
        }

        else if (this.J1.jogada.equals(Tes) && this.J2.jogada.equals(Pap)){
            System.out.println("Vitoria de " + this.J1.nome);
        }

        //Parte do Spock
        else if (this.J1.jogada.equals(Ped) && this.J2.jogada.equals(Lzd)){
            System.out.println("Vitoria de " + this.J1.nome);
        }
        
        else if (this.J1.jogada.equals(Lzd) && this.J2.jogada.equals(Spk)){
            System.out.println("Vitoria de " + this.J1.nome);
        }
        
        else if (this.J1.jogada.equals(Spk) && this.J2.jogada.equals(Tes)){
            System.out.println("Vitoria de " + this.J1.nome);
        }
        
        else if (this.J1.jogada.equals(Tes) && this.J2.jogada.equals(Lzd)){
            System.out.println("Vitoria de " + this.J2.nome);
        }
        
        else if (this.J1.jogada.equals(Lzd) && this.J2.jogada.equals(Pap)){
            System.out.println("Vitoria de " + this.J1.nome);
        }
        
        else if (this.J1.jogada.equals(Pap) && this.J2.jogada.equals(Spk)){
            System.out.println("Vitoria de " + this.J1.nome);
        }
        
        else if (this.J1.jogada.equals(Spk) && this.J2.jogada.equals(Ped)){
            System.out.println("Vitoria de " + this.J1.nome);
        }
        else{
            System.out.println("vitoria de " + this.J2.nome);
        }
    }
}
