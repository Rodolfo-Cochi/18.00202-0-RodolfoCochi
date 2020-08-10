package br.maua.Arvore;

public class NoDaArvore {

    //Estrutura da arvore
    public int valor;
    public NoDaArvore esquerda;
    public NoDaArvore direita;

    //Construtor do no da Arvore
    public NoDaArvore(int valor, NoDaArvore esquerda, NoDaArvore direita) {
        this.valor = valor;
        this.esquerda = esquerda;
        this.direita = direita;
    }


    //Variaveis auxiliares
    int maiornum = 0;
    int menornum = 0;
    int soma = 0;
    int nos = 0;
    int folhas = 0;
    int nulos = 0;


    //Funcoes


    //Funcao para imprimir a arvore
    public void imprimirPreOrdem(NoDaArvore n) {
        System.out.println(n.valor);
        //Printar caso tenha alguem a esquerda
        if (n.esquerda != null) {
            imprimirPreOrdem(n.esquerda);
        }
        //Printar caso tenha alguem a direita
        if (n.direita != null) {
            imprimirPreOrdem(n.direita);
        }
    }

    public void imprimirEmOrdem(NoDaArvore n) {
        //Printar caso tenha alguem a esquerda
        if (n.esquerda != null) {
            imprimirEmOrdem(n.esquerda);
        }
        System.out.println(n.valor);

        //Printar caso tenha alguem a direita
        if (n.direita != null) {
            imprimirEmOrdem(n.direita);
        }
    }

    public void imprimirPosOrdem(NoDaArvore n) {
        //Printar caso tenha alguem a esquerda
        if (n.esquerda != null) {
            imprimirPosOrdem(n.esquerda);
        }
        //Printar caso tenha alguem a direita
        if (n.direita != null) {
            imprimirPosOrdem(n.direita);
        }
        System.out.println(n.valor);
    }

    public void Verificacao(NoDaArvore n, int numero) {
        if (numero == n.valor) {
            System.out.println("Achei!");
        }
        if ((n.esquerda != null) && (numero != n.valor)) {
            Verificacao(n.esquerda, numero);
        }
        if ((n.direita != null) && (numero != n.valor)) {
            Verificacao(n.direita, numero);
        }

    }


    public void MaiorNum(NoDaArvore n) {

        if (n.esquerda != null) {
            MaiorNum(n.esquerda);
        }
        if (n.direita != null) {
            MaiorNum(n.direita);
        }
        if (n.valor > maiornum) {
            maiornum = n.valor;
        }
    }


    public void MenorNum(NoDaArvore n) {
        if (n.esquerda != null) {
            MenorNum(n.esquerda);
        }
        if (n.direita != null) {
            MenorNum(n.direita);
        }
        if (n.valor < menornum) {
            menornum = n.valor;
        }
    }


    public void Soma(NoDaArvore n) {

        if (n.esquerda != null) {
            Soma(n.esquerda);
        }
        if (n.direita != null) {
            Soma(n.direita);
        }
        soma += n.valor;
    }


    public void ContarNos(NoDaArvore n) {

        if ((n.esquerda != null)) {
            ContarNos(n.esquerda);
        }
        if ((n.direita != null)) {
            ContarNos(n.direita);
        }
        nos += 1;

    }

    public void Media(NoDaArvore n) {
        n.Soma(n);
        n.ContarNos(n);
        int med = n.getSoma() / n.getNos();
        System.out.println(med);
    }


    public void ContaFolhas(NoDaArvore n) {
        if (n.esquerda != null) {
            ContaFolhas(n.esquerda);
        }
        if ((n.direita != null)) {
            ContaFolhas(n.direita);
        }
        if ((n.esquerda == null) && (n.direita == null)) {
            folhas += 1;
        }
    }


    public void ContarNull(NoDaArvore n) {
        if (n.esquerda != null) {
            ContarNull(n.esquerda);
        }
        if ((n.direita != null)) {
            ContarNull(n.direita);
        }
        if (n.esquerda == null) {
            nulos += 1;
        }
        if (n.direita == null) {
            nulos += 1;
        }
    }


    public int altura(NoDaArvore n) {
        if (n != null) {
            int he, hd;

            he = altura(n.esquerda);
            hd = altura(n.direita);

            if (he > hd) {
                return he + 1;
            } else {
                return hd + 1;
            }
        }
        return 0;
    }


    //GETTERS

    public int getMaiornum() {
        return maiornum;
    }

    public int getMenornum() {
        return menornum;
    }

    public int getSoma() {
        return soma;
    }

    public int getNos() {
        return nos;
    }

    public int getFolhas() {
        return folhas;
    }

    public int getNulos() {
        return nulos;
    }
}





