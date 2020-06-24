package com.company;

import Funcionario.Usuario;
import Pedido.Enum.FormaPagamento;
import Pedido.Pedido;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
        int op;
        Scanner scanner = new Scanner(System.in);
        String desc, valor, nome, email, senha;
        int pag;

        //Pre cadastrado
        nome = "Rodolfo";
        email = "rodolfocochi@maua.br";

        //Check de senha
        System.out.println("\nUsuario: " + nome);
        System.out.println("Digite sua senha: ");
        senha = scanner.nextLine();

        //Criar usuario
        Usuario user = new Usuario(nome, email, senha);

        do {
            //saber quem esta logado
            System.out.println("\nUsuario: " + nome);

            //print do menu
            Menu();
            op = Integer.parseInt(scanner.nextLine());
            switch (op) {
                case 1:
                    if (user.comparador(senha)) {
                        System.out.println("Faca seu pedido");
                        desc = scanner.nextLine();

                        System.out.println("Valor a ser pago: ");
                        valor = scanner.nextLine();

                        System.out.println("Qual a forma de pagamento? \n 1 - Credito \n 2 - Debito \n 3 - Vale alimentacao \n 4 - Vale refeicao");

                        pag = Integer.parseInt(scanner.nextLine());
                        String fpag;

                        switch (pag) {
                            case 1:
                                fpag = "Credito";
                                Pedido p1 = new Pedido(desc, fpag, valor);
                                pedidos.add(p1);

                                System.out.println("Id: " + p1.getId());
                                System.out.println("Estado do pedido: " + p1.getState());
                                System.out.println("Descricao do pedido: " + desc);
                                System.out.println("Forma de Pagamento: " + fpag);
                                System.out.println("Valor: R$ " + valor);

                                break;
                            case 2:
                                fpag = "Debito";
                                Pedido p2 = new Pedido(desc, fpag, valor);
                                pedidos.add(p2);

                                System.out.println("Id: " + p2.getId());
                                System.out.println("Estado do pedido: " + p2.getState());
                                System.out.println("Descricao do pedido: " + desc);
                                System.out.println("Forma de Pagamento: " + fpag);
                                System.out.println("Valor: R$ " + valor);
                                break;
                            case 3:
                                fpag = "Vale alimentacao";
                                Pedido p3 = new Pedido(desc, fpag, valor);
                                pedidos.add(p3);

                                System.out.println("Id: " + p3.getId());
                                System.out.println("Estado do pedido: " + p3.getState());
                                System.out.println("Descricao do pedido: " + desc);
                                System.out.println("Forma de Pagamento: " + fpag);
                                System.out.println("Valor: R$ " + valor);
                                break;
                            case 4:
                                fpag = "Vale refeicao";
                                Pedido p4 = new Pedido(desc, fpag, valor);
                                pedidos.add(p4);

                                System.out.println("Id: " + p4.getId());
                                System.out.println("Estado do pedido: " + p4.getState());
                                System.out.println("Descricao do pedido: " + desc);
                                System.out.println("Forma de Pagamento: " + fpag);
                                System.out.println("Valor: R$ " + valor);
                                break;
                        }
                    }else{
                        System.out.println("Infelizmente voce nao tem acesso");
                    }


                    break;

                case 2:
                    System.out.println("Deu bom 2");
                    break;

                case 3:
                    System.out.println("Deu bom 3");
                    break;
                case 0:
                    System.out.println("Tchau!");
                    break;
            }
        } while (op != 0);
    }

    public static void Menu() {
        System.out.println("\nLogado em Rato que Ri");
        System.out.println("1 - Nova Venda");
        System.out.println("2 - Verificar pedidos");
        System.out.println("3 - Alterar pedidos");
        System.out.println("0 - Sair");
        System.out.println("Digite sua opcao: ");
    }

}