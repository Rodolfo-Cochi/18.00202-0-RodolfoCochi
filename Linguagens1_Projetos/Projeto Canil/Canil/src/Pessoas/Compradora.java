package Pessoas;

import java.util.HashMap;

import models.Pessoa;

public class Compradora extends Pessoa {

    public Compradora(String nome) {
        super(nome);
    }


    @Override
    public void falar(){
        System.out.println("quero um bichinho!");
    }
    

    
}