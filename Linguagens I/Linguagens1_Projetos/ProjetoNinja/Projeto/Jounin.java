package Linguagens1_Projetos.ProjetoNinja.Projeto;
public class Jounin extends Ninjarank {
    public Jounin(String name, String family, String mission) {
        super(name, family, mission);
    }

    @Override
    public void train(){
        System.out.println("Treinando para " + mission);
    }
}