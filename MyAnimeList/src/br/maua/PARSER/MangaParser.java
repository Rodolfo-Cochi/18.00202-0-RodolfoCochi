package br.maua.PARSER;

import br.maua.model.Manga;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Classe criada para geração de um Manga a partir de um arquivo ".json" recebido da API.
 */
public class MangaParser {

    /**
     * Método criado para extração de informações do arquivo ".json" e criação do Manga com estas mesmas.
     *
     * @param json
     * @return manga
     */
    public static Manga fromJson(JSONObject json) {
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
