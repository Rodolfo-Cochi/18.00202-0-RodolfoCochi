package br.maua.Transacoes;

import br.maua.Produtos.Produto;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Transacoes {

    public static double Comprar(Produto produto, int quantidade){
        double pagar = 0;
        int novaqnt;

        if (quantidade < produto.getQuantidade()){
            novaqnt = produto.getQuantidade() - quantidade;
            pagar = quantidade*produto.getPreco();
            produto.setQuantidade(novaqnt);
            return pagar;
        }else{
            System.out.println("Em estoque atual: " + produto.getQuantidade());
        }
        return 0;
    }
}
