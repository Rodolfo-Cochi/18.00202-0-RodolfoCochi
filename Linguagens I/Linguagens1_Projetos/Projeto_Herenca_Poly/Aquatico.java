package Linguagens1_Projetos.Projeto_Herenca_Poly;
public abstract class Aquatico extends Animal implements Locomover {

    @Override
    public void Locomove() {
        System.out.println("nadando");
    }

}