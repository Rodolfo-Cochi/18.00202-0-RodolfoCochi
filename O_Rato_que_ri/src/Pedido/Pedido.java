package Pedido;

import java.util.Random;

public class Pedido {
    String id;

    private String geradorId(){
        Random random = new Random();
        String idGerado = "";
        for(int i = 0; i < 3; i++)
            idGerado += random.nextInt(10);
        return idGerado;
    }
}

