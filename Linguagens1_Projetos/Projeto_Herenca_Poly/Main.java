package Linguagens1_Projetos.Projeto_Herenca_Poly;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Lobo lobo = new Lobo();
        Peixe peixe = new Peixe();

        ArrayList<Animal> animals = new ArrayList<>(); //Criando um ArrayList do tipo animal que contem os animais
        animals.add(lobo);
        animals.add(cachorro);
        animals.add(peixe);

        //Metodo foreach acessando todos os animals da lista Animal e chamando o metodo comer
        for (Animal animal: animals){
            animal.comer();
            //checar se o animal eh um canino se for printar "canino"
            if(animal instanceof Canino){
                System.out.println("Canino");
                ComportamentoCanino((Canino)animal); //Uso do cast
            }
            //checar se o animal eh aquatico se for printar "Aquatico"
            if(animal instanceof Peixe){
                System.out.println("Aquatico");
                ComportamentodePeixe((Peixe)animal); //Uso do cast
            }
        }

    }

    public static void ComportamentoCanino(Canino canino){
        canino.cheirar();
        canino.Locomove();
    }

    public static void ComportamentodePeixe(Peixe peixe){
        peixe.Locomove();
    }
    
}