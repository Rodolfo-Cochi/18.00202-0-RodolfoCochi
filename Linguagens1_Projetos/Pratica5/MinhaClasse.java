package Linguagens1_Projetos.Pratica5;
public class MinhaClasse{
    private static int contaObjetos = 0;
    public String nome;

    public MinhaClasse(){
        MinhaClasse.contaObjetos = MinhaClasse.contaObjetos +1;
    }

    public static int getContaObjetos(){
        return MinhaClasse.contaObjetos;
    }


}