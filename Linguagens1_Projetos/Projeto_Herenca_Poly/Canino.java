package Linguagens1_Projetos.Projeto_Herenca_Poly;
public abstract class Canino extends Animal implements Locomover {
    public abstract void cheirar();

    @Override
    public void Locomove() {
      System.out.println("andando");
    }
}