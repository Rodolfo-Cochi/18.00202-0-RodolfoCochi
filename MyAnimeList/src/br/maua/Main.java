package br.maua;

import br.maua.testes.AppDAO;
import jdk.nashorn.internal.parser.JSONParser;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static br.maua.API.LeituraAPI.leituraAPI;

public class Main {

    public static void main(String[] args) throws Exception{
        AppDAO app = new AppDAO();
        app.run();
    }

}
