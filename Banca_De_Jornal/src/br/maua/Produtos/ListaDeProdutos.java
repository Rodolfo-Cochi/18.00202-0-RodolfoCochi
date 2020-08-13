package br.maua.Produtos;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ListaDeProdutos {

    private List<Produto> minhaListaDeProdutos;

    public ListaDeProdutos() {
        this.minhaListaDeProdutos = new ArrayList<>();
    }


    public void addProduto(Produto produto) {
        this.minhaListaDeProdutos.add(produto);
    }

    @Override
    public String toString() {
        return "ListaDeProdutos{" + "minhaListaDeProdutos=" + minhaListaDeProdutos + '}';
    }

    public final List<Produto> getProdutos() {
        return this.minhaListaDeProdutos;
    }


    public static JSONArray toJson(ListaDeProdutos lista) {
        JSONArray json = new JSONArray();
        lista.getProdutos().forEach(produto -> {
            json.put(ProdutoParser.toJson(produto));
        });
        return json;
    }

    public static ListaDeProdutos fromJson(JSONArray json){
        ListaDeProdutos lista = new ListaDeProdutos();
        json.forEach( item ->{
            lista.addProduto(ProdutoParser.fromJson((JSONObject) item));
        });
        return lista;
    }


}
