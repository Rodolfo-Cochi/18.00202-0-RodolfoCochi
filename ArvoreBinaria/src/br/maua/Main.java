package br.maua;

public class Main {

    public static void main(String[] args) {
	    NoArvore no = new NoArvore(0,new NoArvore(1, null, null),new NoArvore(2, new NoArvore(3, new NoArvore(5, null,null), new NoArvore(6, null, null)),new NoArvore(4, null, null)));
        System.out.println("Pre-order");
        no.imprimirPreOrdem(no);
        System.out.println("Em Ordem");
        no.imprimirEmOrdem(no);
        System.out.println("Pos Ordem");
        no.imprimirPosOrdem(no);
        System.out.println("Verificacao");
        no.Verificacao(no, 5);
        System.out.println("Maior Numero");
        no.MaiorNum(no);
        System.out.println(no.getMaiornum());
        System.out.println("Soma");
        no.Soma(no);
        System.out.println(no.getSoma());
        System.out.println("Menor num");
        no.MenorNum(no);
        System.out.println(no.getMenornum());
        System.out.println("contar nos");
        no.ContarNos(no);
        System.out.println(no.getNos());
        System.out.println("Media");
        no.media(no);
        System.out.println("folhas");
        no.ContaFolhas(no);
        System.out.println(no.getFolhas());



    }
}
