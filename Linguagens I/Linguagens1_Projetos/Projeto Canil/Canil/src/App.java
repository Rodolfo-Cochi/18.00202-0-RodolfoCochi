import java.util.HashMap;
import java.util.Scanner;

import ListadeAnimais.ListaCachorro;
import ListadeAnimais.ListaGatos;
import ListadeOferta.ListaDisp;
import ListadeOferta.ListadeCompra;
import Pessoas.Compradora;
import Pessoas.Vendedor;

public class App {
    public static void main(String[] args) throws Exception {
        //  for(ListaCachorro cachorro : ListaCachorro.values()){
        //  System.out.printf("%s \t %s \t %s \n", cachorro, cachorro.getDesc(),cachorro.getRaca());

        //  }

        // for(ListaGatos gato : ListaGatos.values()){
        // System.out.printf("%s \t %s \t %s \n", gato, gato.getDesc(), gato.getRaca());
        // }

        // Vendedor vd1 = new Vendedor("Marcia");
        // Compradora cp1 = new Compradora("Regina");

        // ListadeCompra inter = new ListadeCompra();
        // inter.MostrarInteresses();

        // ListaDisp disp = new ListaDisp();
        // disp.MostrarDisp();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = scanner.nextLine();
        System.out.println("Digite seu RA: ");
        String RA = scanner.nextLine();

        System.out.println(name);
       

        

    }
}
