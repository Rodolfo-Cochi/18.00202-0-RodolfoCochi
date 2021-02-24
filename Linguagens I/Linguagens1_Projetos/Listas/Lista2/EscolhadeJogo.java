package Linguagens1_Projetos.Listas.Lista2;

import java.util.Scanner;


public class EscolhadeJogo {
    public static void main(String[] args) {
        String game;
        String Spock = "spock";
        String trad = "tradicional";
        try (Scanner scanner = new Scanner(System.in)) {

            // Digitar o Modo de jogo
            System.out.println("Digite se quer jogar Spock ou Tradicional: ");
            game = scanner.nextLine();

            // Formatar a String para leitura
            game = game.toLowerCase();

            if (game.equals(Spock)) {
                JogoSpock jogoSpock = new JogoSpock();
                jogoSpock.spockzao();
            } else if (game.equals(trad)) {
                JogoTradicional jogoTradicional = new JogoTradicional();
                jogoTradicional.tradicionalzao();
            }
        }
    }
}