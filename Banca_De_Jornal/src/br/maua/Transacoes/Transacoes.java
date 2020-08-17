package br.maua.Transacoes;

import br.maua.Produtos.ListaDeProdutos;
import br.maua.Produtos.Produto;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.json.JSONArray;

public class Transacoes {

    public static void Venda(Produto produto, int quantidade) {
        int novaqnt;
        novaqnt = produto.getQuantidade() - quantidade;
        produto.setQuantidade(novaqnt);
    }



    public static void Estocar(Produto produto, int quantidade) {
        int novaqnt;
        novaqnt = produto.getQuantidade() + quantidade;
        produto.setQuantidade(novaqnt);
    }

    public static double Lucro(Produto produto, int quantidade){
        double lucro = produto.getPreco()*quantidade;
        return lucro;
    }

}
