package com.company;

import Funcionario.Usuario;
import Pedido.Enum.Estado;
import Pedido.Enum.FormaPagamento;
import Pedido.Pedido;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList(); //Criacao do ArrayList
        int op;
        Scanner scanner = new Scanner(System.in);
        String desc, valor, nome, email, senha;
        int pag;


        nome = "Rodolfo"; //Nome do Funcionario pre-cadastrado
        email = "rodolfocochi@maua.br"; //Email pre-cadastrado


        System.out.println("\nUsuario: " + nome); //Print do nome do funcionario
        System.out.println("Digite sua senha: ");
        senha = scanner.nextLine(); //Senha digitada pelo usuario

        Usuario user = new Usuario(nome, email, senha); //Criar usuario

        do {
            System.out.println("\nUsuario: " + nome);  //Vizualizacao de quem esta logado
            Menu();  //Print do menu
            op = Integer.parseInt(scanner.nextLine()); //Opcao escolhida pelo usuario
            switch (op) {
                case 1: //Gerar um novo pedido
                    if (user.comparador(senha)) { //comparar a senha do usuario logado com a senha pre-definida, para dar ou nao acesso a esta funcao
                        System.out.println("Faca seu pedido");
                        desc = scanner.nextLine();

                        System.out.println("Valor a ser pago: ");
                        valor = scanner.nextLine();

                        System.out.println("Qual a forma de pagamento? \n 1 - Credito \n 2 - Debito \n 3 - Dinheiro \n 4 - Vale alimentacao \n 5 - Vale refeicao");
                        pag = Integer.parseInt(scanner.nextLine());

                        Pedido p = new Pedido(desc, pag, valor);
                        pedidos.add(p); //Adcionar o pedido feito na Lista de pedidos
                        System.out.println("\nPedido numero: " + p.getId());
                        System.out.println("Estado do pedido: " + p.getState());
                        System.out.println("Descricao do pedido: " + desc);
                        System.out.println("Forma de Pagamento: " + p.getFpag());
                        System.out.println("Valor: R$ " + valor);
                    } else {
                        System.out.println("Infelizmente voce nao tem acesso.");
                    }

                    break;

                case 2: //Printar os pedidos ja realizados
                    for (Pedido ped : pedidos) { //Loop para percorrer a lista de pedidos
                        System.out.println("Id:" + ped.getId() + "\tPreco:R$" + ped.getValor() + "\tForma de pagamento:" + ped.getFpag() + "\tEstado atual:" + ped.getState() + "\tDescricao:" + ped.getDescricao());
                    }
                    break;

                case 3: //Modificar apenas o estado do pedido
                    if (user.comparador(senha)) { //Validacao da senha
                        System.out.println("Id do pedido que deseja alterar: ");
                        String id = scanner.nextLine();
                        boolean aux = false; //Variavel auxiliar para caso nao seja encontrado o ID digitado
                        for (Pedido ped : pedidos) { //Loop para percorrer a lista de pedidos
                            if (id.equals(ped.getId())) { //Comparacao dos IDs
                                System.out.println("1 - Realizado\n 2 - Preparacao\n 3 - Saiu para entrega\n 4 - Entregue\n 5 - Devolvido");
                                int att = Integer.parseInt(scanner.nextLine());
                                switch (att) {
                                    case 1:
                                        ped.setState(Estado.REALIZADO);
                                        break;
                                    case 2:
                                        ped.setState(Estado.PREPARACAO);
                                        break;
                                    case 3:
                                        ped.setState(Estado.SAIU_PARA_ENTREGA);
                                        break;
                                    case 4:
                                        ped.setState(Estado.ENTREGUE);
                                        break;
                                    case 5:
                                        ped.setState(Estado.DEVOLVIDO);
                                        break;

                                }
                                aux = true; //Variavel recebe true apenas se o ID for encontrado
                            }

                        }
                        if (!aux) { //Caso o ID nao seja encontrado rodar o "if", printando a menasagem de nao encontrado
                            System.out.println("Id nao encontrado!");
                        }

                    } else { //Caso a senha nao seja a definida para tal funcao
                        System.out.println("Infelizmente voce nao tem acesso.");
                    }
                    break;
                case 0: //Sair do sistema
                    System.out.println("Logging Off...");
                    break;
            }
        }
        while (op != 0); //manter o sistema funcionando ate q seja requisistado o log off
    }

    public static void Menu() { //print do menu
        System.out.println("\nLogado em Rato que Ri");
        System.out.println("1 - Nova Venda");
        System.out.println("2 - Verificar pedidos");
        System.out.println("3 - Alterar pedidos");
        System.out.println("0 - Sair");
        System.out.println("Digite sua opcao: ");
    }

}