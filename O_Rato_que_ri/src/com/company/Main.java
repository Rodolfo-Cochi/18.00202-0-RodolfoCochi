package com.company;

import Funcionario.Usuario;
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

                        System.out.println("Qual a forma de pagamento? \n 1 - Credito \n 2 - Debito \n 3 - Vale alimentacao \n 4 - Vale refeicao");
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
                    for (Pedido ped: pedidos) {
                        System.out.println("Id:"+ ped.getId() + "\tPreco:R$" + ped.getValor() + "\tForma de pagamento:" + ped.getFpag() + "\tEstado atual:" + ped.getState() + "\tDescricao:" + ped.getDescricao());
                    }
                    break;

                case 3:
                    if (user.comparador(senha)) {
                        System.out.println("O que deseja alterar no Pedido: ");
                        System.out.println("1 - Mudar Estado\n 2 - Mudar Descricao\n 3 - Mudar Forma de pagamento \n 4 - Mudar preco");
                    } else {
                        System.out.println("Infelizmente voce nao tem acesso.");
                    }
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