package br.maua.PARSER;
import br.maua.model.Anime;
import org.json.JSONException;
import org.json.JSONObject;

public class AnimeParser {

    public static Anime fromJson(JSONObject json){
        Anime anime = null;
        try {
            anime = new Anime(
                    json.getString("title"),
                    json.getString("image_url"),
                    json.getString("synopsis"),
                    json.getInt("episodes"),
                    (float) json.getDouble("score"),
                    json.getString("type")
            );
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return anime;
    }

}
