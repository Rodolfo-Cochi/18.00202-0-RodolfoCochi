package br.maua;

import br.maua.Produtos.ListaDeProdutos;
import br.maua.Produtos.Produto;
import br.maua.Transacoes.Transacoes;
import org.json.JSONArray;

import java.io.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //Criacao do Scanner
        Scanner scanner = new Scanner(System.in);

        //Criacao dos Produtos
        Produto revista = new Produto("Revista", 10.00, 100);
        Produto manga = new Produto("Manga", 12.99, 100);
        Produto jornal = new Produto("Jornal", 2.00, 100);
        Produto gibi = new Produto("Gibi", 4.00, 100);

        //Inicializando Arquivo
        ListaDeProdutos lista = new ListaDeProdutos();
        lista.addProduto(revista);
        lista.addProduto(manga);
        lista.addProduto(jornal);
        lista.addProduto(gibi);
        JSONArray json = ListaDeProdutos.toJson(lista);
        escreverArquivo("estoque.json", json);


        Menu();
        System.out.println("Digite sua opcao: ");
        int op = Integer.parseInt(scanner.nextLine());

        switch (op) {
            case 1:
                MenuItens();
                System.out.println("Digite sua opcao: ");
                int item = Integer.parseInt(scanner.nextLine());
                switch (item) {
                    case 1:
                        System.out.println("Digite a quantidade: ");
                        int qnt = Integer.parseInt(scanner.nextLine());
                        Transacoes.Comprar(revista, qnt);
                        System.out.println(lista);
                        json = ListaDeProdutos.toJson(lista);
                        escreverArquivo("estoque.json", json);
                }
        }


    }


//MERDA!!!!!!!!

    private static JSONArray lerArquivo(String nomeArquivo) {
        JSONArray json = null;
        File file = new File(nomeArquivo);
        try {
            //Cria o fluxo de leitura
            FileReader fileReader = new FileReader(file);
            //Buffer de leitura
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            json = new JSONArray(bufferedReader.readLine());

            //Feche tudo ao terminar
            bufferedReader.close();
            fileReader.close();

        } catch (Exception exception) {
            System.out.println("Algo deu errado!");
            exception.printStackTrace();
        }
        return json;
    }

    private static void escreverArquivo(String nomeArquivo, JSONArray json) {
        //Cria um arquivo
        File file = new File(nomeArquivo);
        try {

            //Cria uma conexão apra escrever no arquivo
            FileWriter fileWriter = new FileWriter(file);
            //Cria um buffer de writting
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            //Escrever algo no arquivo
            bufferedWriter.write("" + json);

            //Fecha o buffer e escreve no arquivo
            bufferedWriter.close();
            //fecha os demais fluxos
            fileWriter.close();

        } catch (Exception exception) {
            System.out.println("Algo deu errado!");
            exception.printStackTrace();
        }
    }

    public static void Menu() {
        System.out.println("Bem Vindo: \n");
        System.out.println("1 - Comprar\n");
        System.out.println("2 - Estocar\n");
        System.out.println("3 - Checar o Estoque\n");
        System.out.println("4 - Sair\n");
    }

    public static void MenuItens() {
        System.out.println("1 - Revista");
        System.out.println("2 - Manga");
        System.out.println("3 - Gibi");
        System.out.println("4 - Jornal");
        System.out.println("5 - Sair");
    }

}


