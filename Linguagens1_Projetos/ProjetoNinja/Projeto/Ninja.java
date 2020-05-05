package Linguagens1_Projetos.ProjetoNinja.Projeto;
public class Ninja {
    //Super Classe
    public String name;
    public String family;
    public String[] jutsus;

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