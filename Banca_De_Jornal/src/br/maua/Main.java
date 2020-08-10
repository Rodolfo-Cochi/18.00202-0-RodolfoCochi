package br.maua;

import br.maua.Json.JSONArray;
import br.maua.Produtos.ListaDeProdutos;
import br.maua.Produtos.Produto;

import java.io.*;


public class Main {

    public static void main(String[] args) {
        ListaDeProdutos lista = new ListaDeProdutos();
        lista.addProd(new Produto("Revista", 10));
        lista.addProd(new Produto("Livro", 164.50));
        lista.addProd(new Produto("Manga", 12.99));
        lista.addProd(new Produto("Gibi", 5.50));
        lista.addProd(new Produto("Playboy", 27.90));

    }
        private static JSONArray lerArquivo (String nomeArquivo){
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

        private static void escreverArquivo (String nomeArquivo, JSONArray json){
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
    }

