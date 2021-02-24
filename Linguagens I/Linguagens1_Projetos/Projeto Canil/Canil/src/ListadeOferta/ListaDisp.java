package ListadeOferta;

import java.util.ArrayList;
import java.util.HashMap;
import ListadeAnimais.ListaCachorro;

public class ListaDisp {
    public void MostrarDisp() {

        // criando lista que linka a pessoa com o animal de interesse
        ArrayList<String> disp = new ArrayList();

        // adcionando interesse de compradores
        disp.add(ListaCachorro.Thor.getRaca());
        disp.add(ListaCachorro.Leko.getRaca());
        
        //print final 
        System.out.println(disp);
    }
}