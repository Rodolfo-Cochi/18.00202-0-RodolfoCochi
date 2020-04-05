import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Espacamento
        System.out.println("---------------------------\n");

        // Criar Usuario(a)
        String email, password, nickname;
        System.out.println("Criacao de conta ->\n");
        System.out.println("Digite seu email:");
        email = scanner.nextLine();
        System.out.println("Digite sua senha:");
        password = scanner.nextLine();
        System.out.println("Escolha seu nick:");
        nickname = scanner.nextLine();
        Usuario user = new Usuario(nickname, password, email);

        // Criar a Conta com o usario
        double credito = 0;
        Conta conta = new Conta(user);
        // Espacamento
        System.out.println("---------------------------");

        // login
        System.out.println("Faca seu login\n");
        String emaillog, senhalog;
        do {
            System.out.println("Digite seu email: ");
            emaillog = scanner.nextLine();
            System.out.println("Digite sua senha: ");
            senhalog = scanner.nextLine();
        } while (!((emaillog.equals(email)) && (senhalog.equals(password))));

        // Apos logar com sucesso!
        String comando = "inicio";
        while (comando.equals("inicio")) {
            // Espacamento
            System.out.println("---------------------------\n");
            // Menu Usuario
            System.out.println("Menu de comandos->\n");
            System.out.println("Para trocar usuario(existente): changeuser");
            System.out.println("Para adicionar um jogo: addgame");
            System.out.println("Para adicionar cash: addcash");
            System.out.println("Para informacoes da conta: infoaccount");
            System.out.println("Para criar nova conta: createaccount");
            System.out.println("Para Logout: bye");
            comando = scanner.nextLine();

            // Comandos
            // trocar usuario
            if (comando.equals("changeuser")) {
                System.out.println("Digite seu email:");
                email = scanner.nextLine();
                System.out.println("Digite sua senha:");
                password = scanner.nextLine();
                System.out.println("Escolha seu nick:");
                nickname = scanner.nextLine();
                user = new Usuario(nickname, password, email);
                conta = new Conta(user);
                comando = "inicio";
                // Adicionar jogo
            } else if (comando.equals("addgame")) {
                String aux = "s";
                while (aux.equals("s")) {
                    String nome, genero, descricao;
                    Jogo jogo;
                    System.out.println("Nome, Genero, Descricao");
                    nome = scanner.nextLine();
                    genero = scanner.nextLine();
                    descricao = scanner.nextLine();
                    jogo = new Jogo(nome, genero, descricao);
                    conta.addJogo(jogo);
                    comando = "inicio";
                    System.out.println("Deseja continuar adicionando games? s/n");
                    aux = scanner.nextLine();
                }
                // Adicionar grana
            } else if (comando.equals("addcash")) {
                double valor;
                System.out.println("Digite a quantidade de cash: ");
                valor = scanner.nextDouble();
                conta.addCreditos(valor);
                comando = "inicio";
                // Info da conta
            } else if (comando.equals("infoaccount")) {
                System.out.println(conta.getInfo());
                comando = "inicio";
                // Sair
            } else if (comando.equals("bye")) {
                System.exit(0);
                //nova conta
            } else if (comando.equals("createaccount")) {
                // Criar Usuario(a)
                System.out.println("Criacao de conta ->\n");
                System.out.println("Digite seu email:");
                email = scanner.nextLine();
                System.out.println("Digite sua senha:");
                password = scanner.nextLine();
                System.out.println("Escolha seu nick:");
                nickname = scanner.nextLine();
                user = new Usuario(nickname, password, email);

                // Criar a Conta com o usario
                credito = 0;
                conta = new Conta(user);
                // Espacamento
                System.out.println("---------------------------");

                // login
                System.out.println("Faca seu login\n");
                do {
                    System.out.println("Digite seu email: ");
                    emaillog = scanner.nextLine();
                    System.out.println("Digite sua senha: ");
                    senhalog = scanner.nextLine();
                } while (!((emaillog.equals(email)) && (senhalog.equals(password))));
                comando = "inicio";

            } else {
                // Espacamento
                System.out.println("---------------------------");

                System.out.println("Comando invalido digite novamente\n");
                comando = "inicio";
            }
        }
    }

}