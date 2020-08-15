package br.maua.Usuario;

public class User {

    String nome;
    String senha;

    public User(String nome,  String senha){
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }
}
