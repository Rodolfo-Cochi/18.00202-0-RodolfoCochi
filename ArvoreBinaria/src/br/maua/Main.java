package br.maua;

import br.maua.Arvore.NoDaArvore;

public class Main {

    public static void main(String[] args) {
        //Criacao da Arvore ex 12
//        NoDaArvore no6 = new NoDaArvore(6,null,null);
//        NoDaArvore no5 = new NoDaArvore(5,null,null);
//        NoDaArvore no3 = new NoDaArvore(3,no5,no6);
//        NoDaArvore no4 = new NoDaArvore(4,null, null);
//        NoDaArvore no2 = new NoDaArvore(2,no3, no4);
//        NoDaArvore no1 = new NoDaArvore(1,null, null);
//        NoDaArvore raiz = new NoDaArvore(0,no1, no2);

          //Adcionando novo no na arvore
          NoDaArvore no13 = new NoDaArvore(13, null, null);

          //Criacao da arvore original exercicio 14
          NoDaArvore no5 = new NoDaArvore(5, null, null);
          NoDaArvore no10 = new NoDaArvore(10, null, no13);
          NoDaArvore no9 = new NoDaArvore(9, null, no10);
          NoDaArvore no8 = new NoDaArvore(8, null, no9);
          NoDaArvore no7 = new NoDaArvore(7, no5, no8);
          NoDaArvore raiz = new NoDaArvore(3, null, no7);




        //Prints
        System.out.println("Pre-ordem");
        raiz.imprimirPreOrdem(raiz);
        System.out.println("Em Ordem");
        raiz.imprimirEmOrdem(raiz);
        System.out.println("Pos Ordem");
        raiz.imprimirPosOrdem(raiz);
        System.out.println("Verificacao");
        raiz.Verificacao(raiz, 5);
        System.out.println("Maior Numero");
        raiz.MaiorNum(raiz);
        System.out.println(raiz.getMaiornum());
        System.out.println("Soma");
        raiz.Soma(raiz);
        System.out.println(raiz.getSoma());
        System.out.println("Menor num");
        raiz.MenorNum(raiz);
        System.out.println(raiz.getMenornum());
        System.out.println("contar nos");
        raiz.ContarNos(raiz);
        System.out.println(raiz.getNos());
        System.out.println("Media");
        raiz.Media(raiz);
        System.out.println("folhas");
        raiz.ContaFolhas(raiz);
        System.out.println(raiz.getFolhas());
        System.out.println("Contar Nulls");
        raiz.ContarNull(raiz);
        System.out.println(raiz.getNulos());
        System.out.println("Altura");
        System.out.println(raiz.altura(raiz));


    }
}


