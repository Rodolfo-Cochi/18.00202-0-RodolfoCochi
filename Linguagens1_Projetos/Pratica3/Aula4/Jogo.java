import java.util.Scanner;

public class Jogo{
    private Jogador j1,j2;

    public void jogar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nome Jogador 1: ");
        String nome = scanner.nextLine();
        System.out.println("Jogada 1: ");
        System.out.println("1 - Pedra");
        System.out.println("2 - Tesoura");
        System.out.println("3 - Papel");
        int escolha = Integer.parseInt(scanner.nextLine());

        switch(escolha){
            case 1:
                j1 = new Jogador(nome, Jogada.PEDRA);break;
            case 2:
                j1 = new Jogador(nome, Jogada.TESOURA);break;
            default:
                j1 = new Jogador(nome, Jogada.PAPEL); break;
        }


        System.out.println("nome Jogador 2: ");
        nome = scanner.nextLine();
        System.out.println("Jogada 2: ");
        System.out.println("1 - Pedra");
        System.out.println("2 - Tesoura");
        System.out.println("3 - Papel");
        escolha = Integer.parseInt(scanner.nextLine());

        switch(escolha){
            case 1:
                j2 = new Jogador(nome, Jogada.PEDRA);break;
            case 2:
                j2 = new Jogador(nome, Jogada.TESOURA);break;
            default:
                j2 = new Jogador(nome, Jogada.PAPEL); break;
        }
        }

        }

    
