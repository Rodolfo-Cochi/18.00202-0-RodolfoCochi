package br.maua.model;

/**
 * Classe criada para geraçãp do objeto manga.
 */
public class Manga {
    private String titulo;
    private String url;
    private String sinopse;
    private int capitulos;
    private int volumes;
    private String tipo;
    private float nota;

    /**
     * Construtor do objeto manga.
     *
     * @param titulo
     * @param url
     * @param sinopse
     * @param capitulos
     * @param volumes
     * @param tipo
     * @param nota
     */
    public Manga(String titulo, String url, String sinopse, int capitulos, int volumes, String tipo, float nota) {
        this.titulo = titulo;
        this.url = url;
        this.sinopse = sinopse;
        this.capitulos = capitulos;
        this.volumes = volumes;
        this.tipo = tipo;
        this.nota = nota;
    }

    /**
     * Método que transforma o Manga em uma String.
     *
     * @return String - manga
     */
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

    /**
     * Método que retorna o titulo do manga.
     *
     * @return String - titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Método que retorna a url do pôster do manga.
     *
     * @return String - url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Método que retorna a sinopse do manga.
     *
     * @return String - sinopse
     */
    public String getSinopse() {
        return sinopse;
    }

    /**
     * Método que retorna a quantidade de capítulos.
     *
     * @return int - Capitulos
     */
    public int getCapitulos() {
        return capitulos;
    }

    /**
     * Método que retorna a quantidade de volumes.
     *
     * @return int - volumes
     */

    public int getVolumes() {
        return volumes;
    }

    /**
     * Método que retorna o tipo do manga.
     *
     * @return String - tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Método que retorna a nota dada para o manga.
     *
     * @return float - nota
     */

    public float getNota() {
        return nota;
    }
}
