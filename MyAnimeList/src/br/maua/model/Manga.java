package br.maua.model;

public class Manga {
    private String titulo;
    private String url;
    private String sinopse;
    private int capitulos;
    private int volumes;
    private String tipo;
    private float nota;

    public Manga(String titulo, String url, String sinopse, int capitulos, int volumes, String tipo, float nota) {
        this.titulo = titulo;
        this.url = url;
        this.sinopse = sinopse;
        this.capitulos = capitulos;
        this.volumes = volumes;
        this.tipo = tipo;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "titulo='" + titulo + '\'' +
                ", url='" + url + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", capitulos=" + capitulos +
                ", volumes=" + volumes +
                ", tipo='" + tipo + '\'' +
                ", nota=" + nota +
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

    public int getCapitulos() {
        return capitulos;
    }

    public int getVolumes() {
        return volumes;
    }

    public String getTipo() {
        return tipo;
    }

    public float getNota() {
        return nota;
    }
}
