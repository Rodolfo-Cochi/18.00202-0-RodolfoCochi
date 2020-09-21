package br.maua.model;

public class Anime {
    private String titulo;
    private String url;
    private String sinopse;
    private int epsodios;
    private float nota;
    private String tipo;

    public Anime(String titulo, String url, String sinopse, int epsodios, float nota, String tipo) {
        this.titulo = titulo;
        this.url = url;
        this.sinopse = sinopse;
        this.epsodios = epsodios;
        this.nota = nota;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "titulo='" + titulo + '\'' +
                ", url='" + url + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", epsodios=" + epsodios +
                ", nota=" + nota +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public String getUrl() {
        return url;
    }

    public String getSinopse() {
        return sinopse;
    }

    public int getEpsodios() {
        return epsodios;
    }

    public float getNota() {
        return nota;
    }

    public String getTipo() {
        return tipo;
    }
}
