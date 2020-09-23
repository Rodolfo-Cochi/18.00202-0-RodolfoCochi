package br.maua.PARSER;

import br.maua.model.Anime;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Classe criada para geração de um Anime a partir de um arquivo ".json" recebido da API.
 */
public class AnimeParser {

    /**
     * Método criado para extração de informações do arquivo ".json" e criação do Anime com estas mesmas.
     *
     * @param json
     * @return anime
     */
    public static Anime fromJson(JSONObject json) {
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
