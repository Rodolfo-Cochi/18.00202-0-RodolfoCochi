package br.maua.model;

/**
 * Classe criada para a geração do objeto anime.
 */
public class Anime {
    private String titulo;
    private String url;
    private String sinopse;
    private int epsodios;
    private float nota;
    private String tipo;

    /**
     * Construtor do objeto anime.
     *
     * @param titulo
     * @param url
     * @param sinopse
     * @param epsodios
     * @param nota
     * @param tipo
     */
    public Anime(String titulo, String url, String sinopse, int epsodios, float nota, String tipo) {
        this.titulo = titulo;
        this.url = url;
        this.sinopse = sinopse;
        this.epsodios = epsodios;
        this.nota = nota;
        this.tipo = tipo;
    }

    /**
     * Método que transforma o anime em uma String.
     *
     * @return String - anime
     */
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

    /**
     * Método que retorna o titulo do anime.
     *
     * @return String - titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Método que retorna a url do pôster do anime.
     *
     * @return String - url
     */

    public String getUrl() {
        return url;
    }

    /**
     * Método que retorna a sinopse do anime.
     *
     * @return String - sinopse
     */
    public String getSinopse() {
        return sinopse;
    }

    /**
     * Método que retorna a quantidade de episodios.
     *
     * @return int - episodios
     */
    public int getEpsodios() {
        return epsodios;
    }

    /**
     * Método que retorna a nota dada para o anime.
     *
     * @return float - nota
     */
    public float getNota() {
        return nota;
    }

    /**
     * Método que retorna o tipo do manga.
     *
     * @return String - tipo
     */
    public String getTipo() {
        return tipo;
    }
}
