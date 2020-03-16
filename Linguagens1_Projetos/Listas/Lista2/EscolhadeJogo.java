import java.util.Scanner;

import org.omg.SendingContext.RunTime;

public class EscolhadeJogo{
    public static void main(String[] args) {
        String game;
        String Spock = "spock";
        String trad = "tradicional";
        Scanner scanner = new Scanner(System.in);
        

        //Digitar o Modo de jogo
        System.out.println("Digite se quer jogar Spock ou Tradicional: ");
        game = scanner.nextLine();

        //Formatar a String para leitura
        game = game.toLowerCase();
        
        if (game.equals(Spock)){
            JogoSpock jogoSpock = new JogoSpock();
            jogoSpock.spockzao();
        }
        else if (game.equals(trad)){
            JogoTradicional jogoTradicional = new JogoTradicional();
            jogoTradicional.tradicionalzao();
        }
    }
}