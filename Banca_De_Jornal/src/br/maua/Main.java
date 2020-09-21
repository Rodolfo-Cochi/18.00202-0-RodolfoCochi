package br.maua;

import br.maua.Produtos.ListaDeProdutos;
import br.maua.Produtos.Produto;
import br.maua.Transacoes.Transacoes;
import br.maua.Usuario.User;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {

    public static void main(String[] args) {

        //Criacao do Scanner
        Scanner scanner = new Scanner(System.in);

        //Criacao dos Produtos


        //Declaracao de Variaveis
        JSONArray json;
        Produto revista = null;
        Produto manga = null;
        Produto jornal = null;
        Produto gibi = null;
        ListaDeProdutos lista = new ListaDeProdutos();

//        if (nao existir o arquivo){
            revista = new Produto("Revista", 10.00, 100);
            manga = new Produto("Manga", 12.99, 100);
            jornal = new Produto("Jornal", 2.00, 100);
            gibi = new Produto("Gibi", 4.00, 100);

            //Inicializando Arquivo
            lista.addProduto(revista);
            lista.addProduto(manga);
            lista.addProduto(jornal);
            lista.addProduto(gibi);
            json = ListaDeProdutos.toJson(lista);
            escreverArquivo("estoque.json", json);
//        }

//        }else(existir um arquivo){      //Criar os produtos com o numero do estoque do arquivo
//            //se existir
//            json = lerArquivo("estoque.json");
//            lista = ListaDeProdutos.fromJson(json);
//            JSONObject jason = new JSONObject("estoque.json");
//            System.out.println(jason.getJSONObject("quantidade"));
//            revista = new Produto("Revista", 10.00, );
//            manga = new Produto("Manga", 12.99, );
//            jornal = new Produto("Jornal", 2.00, );
//            gibi = new Produto("Gibi", 4.00, );
//        }


        //Criar Lista de Vendas
        ListaDeProdutos listavenda = new ListaDeProdutos();
        JSONArray jsonlucro = ListaDeProdutos.toJson(listavenda);

        //Criar usuario
        User tiozinho = new User("Jose", "1234");

        //Declaracao
        String nome;
        String senha;

        //Login

        boolean login;

        do {
            System.out.println("Digite o nome:  \n");
            nome = scanner.nextLine();
            System.out.println("Digite a senha: \n");
            senha = scanner.nextLine();
            login = Login(tiozinho, nome, senha);
        } while (login == false);


        int op;
        do {
            Menu();
            System.out.println("Digite sua opcao: ");
            op = Integer.parseInt(scanner.nextLine());

            int item;
            switch (op) {
                case 1:
                    do {
                        MenuItens();
                        System.out.println("Digite sua opcao: ");
                        item = Integer.parseInt(scanner.nextLine());

                        switch (item) {
                            case 1:
                                System.out.println("Digite a quantidade: ");
                                int qnt = Integer.parseInt(scanner.nextLine());
                                Transacoes.Venda(revista, qnt);
                                System.out.println(lista);
                                json = ListaDeProdutos.toJson(lista);
                                escreverArquivo("estoque.json", json);

                                double lucro = Transacoes.Lucro(revista, qnt);
                                Produto lucrorevista = new Produto("Revista", lucro, qnt);
                                listavenda.addProduto(lucrorevista);
                                jsonlucro = ListaDeProdutos.toJson(listavenda);
                                escreverArquivo("vendas.json", jsonlucro);
                                break;

                            case 2:
                                System.out.println("Digite a quantidade: ");
                                qnt = Integer.parseInt(scanner.nextLine());
                                Transacoes.Venda(manga, qnt);
                                System.out.println(lista);
                                json = ListaDeProdutos.toJson(lista);
                                escreverArquivo("estoque.json", json);


                                lucro = Transacoes.Lucro(revista, qnt);
                                Produto lucromanga = new Produto("Manga", lucro, qnt);
                                listavenda.addProduto(lucromanga);
                                jsonlucro = ListaDeProdutos.toJson(listavenda);
                                escreverArquivo("vendas.json", jsonlucro);
                                break;

                            case 3:
                                System.out.println("Digite a quantidade: ");
                                qnt = Integer.parseInt(scanner.nextLine());
                                Transacoes.Venda(gibi, qnt);
                                System.out.println(lista);
                                json = ListaDeProdutos.toJson(lista);
                                escreverArquivo("estoque.json", json);

                                lucro = Transacoes.Lucro(revista, qnt);
                                Produto lucrogibi = new Produto("Manga", lucro, qnt);
                                listavenda.addProduto(lucrogibi);
                                jsonlucro = ListaDeProdutos.toJson(listavenda);
                                escreverArquivo("vendas.json", jsonlucro);
                                break;

                            case 4:
                                System.out.println("Digite a quantidade: ");
                                qnt = Integer.parseInt(scanner.nextLine());
                                Transacoes.Venda(jornal, qnt);
                                System.out.println(lista);
                                json = ListaDeProdutos.toJson(lista);
                                escreverArquivo("estoque.json", json);

                                lucro = Transacoes.Lucro(revista, qnt);
                                Produto lucrojornal = new Produto("Manga", lucro, qnt);
                                listavenda.addProduto(lucrojornal);
                                jsonlucro = ListaDeProdutos.toJson(listavenda);
                                escreverArquivo("vendas.json", jsonlucro);
                                break;

                        }
                    } while (item != 5);

                    break;

                case 2:
                    do {
                        MenuItens();
                        System.out.println("Digite sua opcao: ");
                        item = Integer.parseInt(scanner.nextLine());
                        int qnt;

                        switch (item) {
                            case 1:
                                System.out.println("Digite a quantidade: ");
                                qnt = Integer.parseInt(scanner.nextLine());
                                Transacoes.Estocar(revista, qnt);
                                System.out.println(lista);
                                json = ListaDeProdutos.toJson(lista);
                                escreverArquivo("estoque.json", json);

                                break;

                            case 2:
                                System.out.println("Digite a quantidade: ");
                                qnt = Integer.parseInt(scanner.nextLine());
                                Transacoes.Estocar(manga, qnt);
                                System.out.println(lista);
                                json = ListaDeProdutos.toJson(lista);
                                escreverArquivo("estoque.json", json);

                                break;

                            case 3:
                                System.out.println("Digite a quantidade: ");
                                qnt = Integer.parseInt(scanner.nextLine());
                                Transacoes.Estocar(gibi, qnt);
                                System.out.println(lista);
                                json = ListaDeProdutos.toJson(lista);
                                escreverArquivo("estoque.json", json);

                                break;

                            case 4:
                                System.out.println("Digite a quantidade: ");
                                qnt = Integer.parseInt(scanner.nextLine());
                                Transacoes.Estocar(jornal, qnt);
                                System.out.println(lista);
                                json = ListaDeProdutos.toJson(lista);
                                escreverArquivo("estoque.json", json);

                                break;

                        }
                    } while (item != 5);
                    break;

                case 3:
                    System.out.println(lerArquivo("estoque.json"));
                    break;


            }
        } while (op != 4);


    }


//Criacao do arquivo!

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
        System.out.println("1 - Retirar\n");
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

    public static boolean Login(User user, String nome, String senha) {
        if (nome.equals(user.getNome()) && senha.equals(user.getSenha())) {
            return true;
        } else {
            return false;
        }

    }

    public static List<String> getValuesForGivenKey(String jsonArrayStr, String key) {
        JSONArray jsonArray = new JSONArray(jsonArrayStr);
        return IntStream.range(0, jsonArray.length())
                .mapToObj(index -> ((JSONObject)jsonArray.get(index)).optString(key))
                .collect(Collectors.toList());
    }

}


