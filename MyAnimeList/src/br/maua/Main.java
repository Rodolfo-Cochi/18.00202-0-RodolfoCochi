package br.maua;

import br.maua.testes.AppDAO;
import jdk.nashorn.internal.parser.JSONParser;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static br.maua.API.LeituraAPI.leituraAPI;

/**
 * Classe criada para executar o programa.
 */
public class Main {

    public static void main(String[] args) throws Exception{
        //Criacao do app que sera executado
        AppDAO app = new AppDAO();

        //Execução do app
        app.run();
    }

}
