package br.maua.Produtos;

import org.json.JSONObject;

public class ProdutoParser {
    public static JSONObject toJson(Produto produto) {
        JSONObject json = new JSONObject();
        json.put("tipo", produto.getTipo());
        json.put("preco", produto.getPreco());
        json.put("quantidade", produto.getQuantidade());
        return json;
    }


    public static Produto fromJson(JSONObject json){
        Produto produto = new Produto(
                json.getString("tipo"),
                json.getDouble("preco"),
                json.getInt("quantidade")
        );
        return produto;
    }
}

