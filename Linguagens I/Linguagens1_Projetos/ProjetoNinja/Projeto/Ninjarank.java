package Linguagens1_Projetos.ProjetoNinja.Projeto;
public class Ninjarank extends Ninja {
    protected String mission; // Toda heranca pode mudar, diferente de private onde apenas determinada classe
                              // pode mexer

    // Construtor
    public Ninjarank(String name, String family, String mission) {
        super(name, family); // reaproveita construtor
        this.mission = mission;
    }

    @Override
    public void train() {
        System.out.println("Treino pesado!\n");
    }

    public void goToMission() {
        System.out.println("Dale na missao!\n");
    }
}