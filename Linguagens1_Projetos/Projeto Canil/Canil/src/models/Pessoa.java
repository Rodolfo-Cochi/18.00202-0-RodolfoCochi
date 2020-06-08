package models;

public abstract class Pessoa {
    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void falar(){
        System.out.println("nada!");
    }
}