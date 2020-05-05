package Linguagens1_Projetos.Projeto_Plataforma_Jogos;
public class Usuario {
    private String nickname, password, email;

    public Usuario(String nickname, String password, String email) {
        this.nickname = nickname;
        this.password = password;
        this.email = email;
    }
    
    public boolean validarSenha(String senha) {
        return senha.equals(password);
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}