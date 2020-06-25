package Funcionario;

/**
 * Classe que representa o comparador de senhas para autenticar o usuario
 */
public interface Autenticador {
    /**
     * Metodo para ser implementado na classe Usuario para comparar a senha do mesmo com a pre-definida
     * @param chaveseg (Senha digitada pelo usuario)
     * @return (true caso seja a mesma e false caso seja diferente da pre-definida)
     */
    boolean comparador(String chaveseg);
}
