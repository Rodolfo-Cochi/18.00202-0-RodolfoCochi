package br.maua.Produtos;

import java.util.ArrayList;
import java.util.List;

public class ListaDeProdutos {
    public List<Produto> lista = new ArrayList<>();


    public void addProd(Produto p){
        lista.add(p);
    }
}
