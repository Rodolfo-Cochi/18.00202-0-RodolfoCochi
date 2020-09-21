package br.maua.API;

import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class LeituraAPI {
    public static JSONObject leituraAPI(String tipo, String titulo) throws Exception {
        URL url = new URL("https://api.jikan.moe/v3/search/" + tipo + "?q=" + titulo);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int status = connection.getResponseCode();
        System.out.println("Status Code: " + status);

        BufferedReader input = new BufferedReader(
                new InputStreamReader(
                        connection.getInputStream()
                )
        );

        String result;
        StringBuffer content = new StringBuffer();

        while (((result = input.readLine()) != null)) {
            content.append(result);
        }

        input.close();
        System.out.println("Recebidos: ");


        JSONObject jsonObj = new JSONObject(content.toString());

//        JSONArray ja = new JSONArray(content.toString());
//        for (int i = 0; i < ja.length(); i++) {
//            JSONObject jsonObj = ja.getJSONObject(i);
//            System.out.println(jsonObj);
//
//        }
        JSONArray jsonArray = jsonObj.getJSONArray("results");
        return jsonArray.optJSONObject(0);
    }
}
