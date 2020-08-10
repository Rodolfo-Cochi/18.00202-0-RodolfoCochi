package br.maua;

public class Main {

    public static void main(String[] args) {
        Arvore.CriarArvore();

        System.out.println("Pre-ordem");
        Arvore.CriarArvore().imprimirPreOrdem(Arvore.CriarArvore());
        System.out.println("Em Ordem");
        Arvore.CriarArvore().imprimirEmOrdem(Arvore.CriarArvore());
        System.out.println("Pos Ordem");
        Arvore.CriarArvore().imprimirPosOrdem(Arvore.CriarArvore());
        System.out.println("Verificacao");
        Arvore.CriarArvore().Verificacao(Arvore.CriarArvore(), 5);
        System.out.println("Maior Numero");
        Arvore.CriarArvore().MaiorNum(Arvore.CriarArvore());
        System.out.println(Arvore.CriarArvore().getMaiornum());
        System.out.println("Soma");
        Arvore.CriarArvore().Soma(Arvore.CriarArvore());
        System.out.println(Arvore.CriarArvore().getSoma());
        System.out.println("Menor num");
        Arvore.CriarArvore().MenorNum(Arvore.CriarArvore());
        System.out.println(Arvore.CriarArvore().getMenornum());
        System.out.println("contar nos");
        Arvore.CriarArvore().ContarNos(Arvore.CriarArvore());
        System.out.println(Arvore.CriarArvore().getNos());
        System.out.println("Media");
        Arvore.CriarArvore().media(Arvore.CriarArvore());
        System.out.println("folhas");
        Arvore.CriarArvore().ContaFolhas(Arvore.CriarArvore());
        System.out.println(Arvore.CriarArvore().getFolhas());
        System.out.println("Contar Nulls");
        Arvore.CriarArvore().ContarNull(Arvore.CriarArvore());
        System.out.println(Arvore.CriarArvore().getNulos());
        System.out.println("Altura");
        System.out.println(Arvore.CriarArvore().altura(Arvore.CriarArvore()));


    }
}
