package ListadeOferta;

import java.util.ArrayList;
import java.util.HashMap;
import ListadeAnimais.ListaCachorro;

public class ListadeCompra {

    public void MostrarInteresses() {

        // criando lista que linka a pessoa com o animal de interesse
        HashMap<String, String> inter = new HashMap<>();

        // adcionando interesse de compradores
        inter.put("Regina", "Golden Retriever");
        inter.put("Daniel", "Corgi");

        // print final
        //System.out.println(inter);

        ArrayList<String> racainter = new ArrayList<>();

        racainter.addAll(inter.values());
        for (int i = 0; i < inter.size(); i++) {
            System.out.println(racainter.get(i));

            if (racainter.get(i).equals("Golden Retriever")) {
                System.out.println("Possivel adocao de " + racainter.get(i));
            } else {
                System.out.println("Ninguem quer!");
            }

        }

    }
}