package ListadeAnimais;

public enum ListaGatos {

    //Lista de gatos
    Mika("Fofa", "Siames");

    

    private final String desc;
    private final String raca;

    private ListaGatos(String desc, String raca) {
        this.desc = desc;
        this.raca = raca;
    }

    public String getDesc() {
        return desc;
    }

    public String getRaca() {
        return raca;
    }

}