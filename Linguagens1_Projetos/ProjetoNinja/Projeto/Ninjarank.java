public class Ninjarank extends Ninja {
    protected String mission; // Toda heranca pode mudar, diferente de private onde apenas determinada classe
                              // pode mexer

    // Construtor
    public Ninjarank(String name, String family, String mission) {
        super(name, family); // reaproveita construtor
        this.mission = mission;
    }

    public void goToMission() {
        System.out.println("Dale na missao!\n");
    }
}