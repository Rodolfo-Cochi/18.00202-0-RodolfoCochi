//Classe filho uso do "extend"
public class AcademicStudent extends Ninja{

    //construtor
    public AcademicStudent (String name, String family){
        super(name, family);
    }

    public void play(){
        System.out.println("Pintar estatua\n");
    }
}