public class Ninja {
    // Super Classe
    private String name;
    private String family;
    private String[] jutsus;

    // Construtores
    public Ninja(String name, String family) {
        this.name = name;
        this.family = family;
        jutsus = new String[5];
    }

    public void train() {
        System.out.println("Datebayo!\n");
    }

}