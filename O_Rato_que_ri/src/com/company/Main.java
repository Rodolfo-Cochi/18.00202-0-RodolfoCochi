package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int op;
        Scanner scanner = new Scanner(System.in);
        do {
            Menu();
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

    public static void Menu(){
        System.out.println("Bem vindo a Rato que Ri");
        System.out.println("1 - Nova Venda");
        System.out.println("2 - Verificar pedidos");
        System.out.println("3 - Alterar pedidos");
        System.out.println("0 - Sair");
        System.out.println("Digite sua opcao: ");
    }
}