package Pessoas;

import models.Pessoa;

public class Vendedor extends Pessoa{

    public Vendedor(String nome) {
        super(nome);
    }
    

    @Override
    public void falar(){
        System.out.println("Posso te ajudar?");
    }
}