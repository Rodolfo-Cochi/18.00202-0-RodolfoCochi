package br.maua.PARSER;

import br.maua.model.Manga;
import org.json.JSONException;
import org.json.JSONObject;

public class MangaParser {

    public static Manga fromJson(JSONObject json){
        Manga manga = null;
        try {
            manga = new Manga(
                    json.getString("title"),
                    json.getString("image_url"),
                    json.getString("synopsis"),
                    json.getInt("chapters"),
                    json.getInt("volumes"),
                    json.getString("type"),
                    (float) json.getDouble("score")
            );
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return manga;
    }
}
