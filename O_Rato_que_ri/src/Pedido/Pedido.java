package Pedido;

import Pedido.Enum.Estado;
import Pedido.Enum.FormaPagamento;

import java.util.Random;

public class Pedido {
    Enum State;
    String Id;

    public Enum getState() {
        return State;
    }

    public String getId() {
        return Id;
    }

    public Pedido(String descricao, String formadepagamento, String valor) {
        State = Estado.REALIZADO;
        Id = geradorId();
    }



    private String geradorId() {
        Random random = new Random();
        String idGerado = "";
        for (int i = 0; i < 3; i++)
            idGerado += random.nextInt(10);
        return idGerado;
    }
}

