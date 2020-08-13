package br.maua.Produtos;

public class Produto {
    private final String tipo;
    private final double preco;
    public int quantidade;

    public Produto(String tipo, double preco, int quantidade) {
       this.quantidade = quantidade;
       this.tipo = tipo;
       this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString(){
        return "Produto{" + "tipo='" + tipo + '\'' +
                ", preco='" +preco + '\'' +
                ", quantidade='" +quantidade + '\'' +
                '}';
    }
}
