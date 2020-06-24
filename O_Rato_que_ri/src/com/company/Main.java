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
        ArrayList<Pedido> pedidos = new ArrayList();
        int op;
        Scanner scanner = new Scanner(System.in);
        String desc, valor, nome, email, senha;
        int pag;

        /**
         * Criacao 
         */
        nome = "Rodolfo";
        email = "rodolfocochi@maua.br";

        //Check de senha
        System.out.println("\nUsuario: " + nome);
        System.out.println("Digite sua senha: ");
        senha = scanner.nextLine();

        //Criar usuario
        Usuario user = new Usuario(nome, email, senha);

        do {
            System.out.println("\nUsuario: " + nome);  //saber quem esta logado
            Menu();  //print do menu
            op = Integer.parseInt(scanner.nextLine());
            switch (op) {
                case 1:
                    if (user.comparador(senha)) {
                        System.out.println("Faca seu pedido");
                        desc = scanner.nextLine();

                        System.out.println("Valor a ser pago: ");
                        valor = scanner.nextLine();

                        System.out.println("Qual a forma de pagamento? \n 1 - Credito \n 2 - Debito \n 3 - Dinheiro \n 4 - Vale alimentacao \n 5 - Vale refeicao");
                        pag = Integer.parseInt(scanner.nextLine());

                        Pedido p = new Pedido(desc, pag, valor);
                        pedidos.add(p);
                        System.out.println("\nPedido numero: " + p.getId());
                        System.out.println("Estado do pedido: " + p.getState());
                        System.out.println("Descricao do pedido: " + desc);
                        System.out.println("Forma de Pagamento: " + p.getFpag());
                        System.out.println("Valor: R$ " + valor);
                    } else {
                        System.out.println("Infelizmente voce nao tem acesso.");
                    }

                    break;

                case 2:
                    for (Pedido ped : pedidos) {
                        System.out.println("Id:" + ped.getId() + "\tPreco:R$" + ped.getValor() + "\tForma de pagamento:" + ped.getFpag() + "\tEstado atual:" + ped.getState() + "\tDescricao:" + ped.getDescricao());
                    }
                    break;

                case 3:
                    if (user.comparador(senha)) {
                        System.out.println("Id do pedido que deseja alterar: ");
                        String id = scanner.nextLine();
                        boolean aux = false;
                        for (Pedido ped : pedidos) {
                            if (id.equals(ped.getId())) {
                                System.out.println("1 - Mudar Estado\n 2 - Mudar Descricao\n 3 - Mudar Forma de pagamento \n 4 - Mudar preco");
                                int att = Integer.parseInt(scanner.nextLine());
                                switch (att) {
                                    case 1:
                                        System.out.println("1 - Realizado\n 2 - Preparacao\n 3 - Saiu para entrega\n 4 - Entregue\n 5 - Devolvido");
                                        int atts = Integer.parseInt(scanner.nextLine());
                                        switch (atts) {
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
                                        break;
                                    case 2:
                                        System.out.println("Digite a nova descricao:");
                                        String novadesc = scanner.nextLine();
                                        ped.setDescricao(novadesc);
                                        break;
                                    case 3:
                                        System.out.println("1 - Credito\n 2 - Debito\n 3 - Dinheiro\n 4 - Vale alimentacao\n 5 - Vale refeicao");
                                        int novopag = Integer.parseInt(scanner.nextLine());
                                        switch (novopag) {
                                            case 1:
                                                ped.setFpag(FormaPagamento.CREDITO);
                                                break;
                                            case 2:
                                                ped.setFpag(FormaPagamento.DEBITO);
                                                break;
                                            case 3:
                                                ped.setFpag(FormaPagamento.DINHEIRO);
                                                break;
                                            case 4:
                                                ped.setFpag(FormaPagamento.VALE_ALIMENTACAO);
                                                break;
                                            case 5:
                                                ped.setFpag(FormaPagamento.VALE_REFEICAO);
                                                break;
                                        }
                                        break;
                                    case 4:
                                        System.out.println("Qual o novo preco");
                                        String novopreco = scanner.nextLine();
                                        ped.setValor(novopreco);
                                        break;
                                }
                                aux = true;
                                break;
                            }
                        }
                        if(aux == false){
                            System.out.println("Id nao encontrado!");
                        }
                    } else {
                        System.out.println("Infelizmente voce nao tem acesso.");
                    }
                    break;
                case 0:
                    System.out.println("Logging Off...");
                    break;
            }
        }
        while (op != 0);
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