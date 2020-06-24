package Funcionario;

public class Usuario implements Autenticador {
    String senha, email, nome;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = "123456";
    }

    @Override
    public boolean comparador(String chaveseg) {
        if (this.senha.equals(chaveseg)) {
            return true;
        } else {
            return false;
        }
    }

}
