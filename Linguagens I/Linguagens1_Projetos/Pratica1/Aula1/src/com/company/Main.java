package Linguagens1_Projetos.Pratica1.Aula1.src.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double n1, n2;
        System.out.println("Informe dois valores: ");
        try (Scanner scanner = new Scanner(System.in)) {
            n1 = scanner.nextDouble();
            n2 = scanner.nextDouble();
            if (n1 > n2) {
                System.out.println("n1 maior");
            } else {
                System.out.println("n2 maior");
            }
        }
    }
}
