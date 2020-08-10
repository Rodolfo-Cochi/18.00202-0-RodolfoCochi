package br.maua;

public class Arvore {

    public static NoDaArvore CriarArvore(){
        NoDaArvore no6 = new NoDaArvore(6,null,null);
        NoDaArvore no5 = new NoDaArvore(5,null,null);
        NoDaArvore no3 = new NoDaArvore(3,no5,no6);
        NoDaArvore no4 = new NoDaArvore(4,null, null);
        NoDaArvore no2 = new NoDaArvore(2,no3, no4);
        NoDaArvore no1 = new NoDaArvore(1,null, null);
        NoDaArvore raiz = new NoDaArvore(0,no1, no2);
        return raiz;
    }

}
