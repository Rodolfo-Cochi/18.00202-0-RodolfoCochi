package Linguagens1_Projetos.Pratica5;
public class Personagem {
    public static final String URL_PERSONAGEM = "pokeapi.com/api/v1";
    private String nomePersonagem;

    public Personagem(String url_personagem){
        this.nomePersonagem = url_personagem;
    }

    public String getUrl(){
        return URL_PERSONAGEM + this.nomePersonagem;
    }
}