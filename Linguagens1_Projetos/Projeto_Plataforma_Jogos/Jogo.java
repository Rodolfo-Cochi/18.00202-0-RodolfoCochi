public class Jogo{
    String nome;
    String genero;
    String descricao;
    Boolean online;
    Boolean multiplayer;

    public Jogo(String nome, String genero, String descricao){
        this.nome = nome;
        this.genero = genero;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public Boolean getMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(Boolean multiplayer) {
        this.multiplayer = multiplayer;
    }

    public String getInfo(){
        return String.format("(nome:%s), genero:%s, descricao:%s", this.nome, this.genero, this.descricao);
    }


}