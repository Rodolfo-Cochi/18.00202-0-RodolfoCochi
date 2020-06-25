package Funcionario;


public class Usuario implements Autenticador {
    String senha, email, nome;

    /**
     * Classe que representa o Usuario
     * @param nome (Pre cadastrado sistema)
     * @param email (Pre cadastrado no sistema)
     * @param senha (Pre definida para o usuario)
     */
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = "123456";
    }

    /**
     * Atualizacao do Metodo de comparacao de senha para usuario
     * @param chaveseg (senha digitada pelo usuario, usada para comparacao)
     * @return (true caso a senha seja a mesma pre-definida ou false caso a senha nao seja a mesma que a pre-definida)
     */
    @Override
    public boolean comparador(String chaveseg) {
        if (this.senha.equals(chaveseg)) {
            return true;
        } else {
            return false;
        }
    }

}
