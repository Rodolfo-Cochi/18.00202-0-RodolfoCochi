package com.company;

import Pedido.Pedido;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pedido>pedidos = new ArrayList<Pedido>();
        int op;
        Scanner scanner = new Scanner(System.in);
        String desc, pag;
        do {
            Menu();
            op = Integer.parseInt(scanner.nextLine());
            switch (op) {
                case 1:
                    System.out.println("Faca seu pedido?");
                    desc = scanner.nextLine();
                    System.out.println("Pagamento?");
                    pag = scanner.nextLine();
                    Pedido p1 = new Pedido(desc, pag);
                    pedidos.add(p1);
                    System.out.println("Id: " + p1.getId());
                    System.out.println("Estado do pedido: " + p1.getState());
                    System.out.println("Descricao do pedido: " + desc);
                    System.out.println("Forma de Pagamento: " + pag);

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
        }while(op != 0);
    }

    public static void Menu(){
        System.out.println("Bem vindo a Rato que Ri");
        System.out.println("1 - Nova Venda");
        System.out.println("2 - Verificar pedidos");
        System.out.println("3 - Alterar pedidos");
        System.out.println("0 - Sair");
        System.out.println("Digite sua opcao: ");
    }
}