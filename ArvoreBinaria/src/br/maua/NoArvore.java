package br.maua;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class NoArvore {

    //Estrutura da arvore
    public int valor;
    public NoArvore esquerda;
    public NoArvore direita;

    //Construtor da Arvore
    NoArvore(int valor, NoArvore esquerda, NoArvore direita) {
        this.valor = valor;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    //Funcao para imprimir a arvore
    public void imprimirPreOrdem(NoArvore n){
        System.out.println(n.valor);
        //Printar caso tenha alguem a esquerda
        if(n.esquerda != null) {
            imprimirPreOrdem(n.esquerda);
        }
        //Printar caso tenha alguem a direita
        if(n.direita != null) {
            imprimirPreOrdem(n.direita);
        }
    }
    public void imprimirEmOrdem(NoArvore n){
        //Printar caso tenha alguem a esquerda
        if(n.esquerda != null) {
            imprimirEmOrdem(n.esquerda);
        }
        System.out.println(n.valor);

        //Printar caso tenha alguem a direita
        if(n.direita != null) {
            imprimirEmOrdem(n.direita);
        }
    }
    public void imprimirPosOrdem(NoArvore n){
        //Printar caso tenha alguem a esquerda
        if(n.esquerda != null) {
            imprimirPosOrdem(n.esquerda);
        }
        //Printar caso tenha alguem a direita
        if(n.direita != null) {
            imprimirPosOrdem(n.direita);
        }
        System.out.println(n.valor);
    }

    public void Verificacao(NoArvore n, int numero){
        if (numero == n.valor){
            System.out.println("Achei!");
        }
        if((n.esquerda != null) && (numero != n.valor)){
            Verificacao(n.esquerda, numero);
        }
        if((n.direita != null) && (numero != n.valor)){
            Verificacao(n.direita, numero);
            }

        }

    //Inicializacao da variavel auxiliar
    int maiornum = 0;
    public void MaiorNum(NoArvore n) {

            if(n.esquerda != null){
                MaiorNum(n.esquerda);
            }
            if(n.direita != null){
                MaiorNum(n.direita);
            }
            if (n.valor > maiornum) {
                maiornum = n.valor;
            }
        }

    public int getMaiornum() {
        return maiornum;
    }

    //Inicializacao da variavel
    int menornum = 0;

    public int getMenornum() {
        return menornum;
    }

    public void MenorNum(NoArvore n){
        if(n.esquerda != null){
            MenorNum(n.esquerda);
        }
        if(n.direita != null){
            MenorNum(n.direita);
        }
        if (n.valor < menornum) {
            menornum = n.valor;
        }
    }


        //Auxiliar
        int soma = 0;


    public int getSoma() {
        return soma;
    }

    public void Soma(NoArvore n){

                if(n.esquerda != null){
                Soma(n.esquerda);
            }
                if(n.direita != null){
                    Soma(n.direita);
                }
                soma += n.valor;
            }
    //Iniciar contador
    int nos = 0;

    public int getNos() {
        return nos;
    }

    public void ContarNos(NoArvore n){

        if((n.esquerda != null)){
            ContarNos(n.esquerda);
        }
        if((n.direita != null)){
            ContarNos(n.direita);
        }
        nos += 1;

    }

    public void media(NoArvore n){
        n.Soma(n);
        n.ContarNos(n);
        int med = n.getSoma()/n.getNos();
        System.out.println(med);
    }

    int folhas = 0;

    public int getFolhas() {
        return folhas;
    }

    public void ContaFolhas(NoArvore n){
        if(n.esquerda != null){
            ContaFolhas(n.esquerda);
        }
        if((n.direita != null)){
            ContaFolhas(n.direita);
        }
        if((n.esquerda == null) && (n.direita == null)){
            folhas+=1;
        }
    }

}




