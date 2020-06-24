package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;


        do {
            System.out.println("Bem vindo a Rato que Ri");
            System.out.println("1 - Nova Venda");
            System.out.println("2 - Verificar pedidos");
            System.out.println("3 - Alterar pedidos");
            System.out.println("0 - Sair");
            System.out.println("Digite sua opcao: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Deu bom!");
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
}