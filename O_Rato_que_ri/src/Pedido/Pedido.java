package Pedido;

import Pedido.Enum.Estado;
import Pedido.Enum.FormaPagamento;

import java.util.Random;

public class Pedido {
    Enum State, fpag;
    String Id, descricao, valor;

    public Enum getState() {
        return State;
    }

    public String getId() {
        return Id;
    }

    public Enum getFpag() {
        return fpag;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setState(Enum state) {
        State = state;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setFpag(Enum fpag) {
        this.fpag = fpag;
    }

    public String getValor() {
        return valor;
    }

    /**
     * Construtor do pedido.
     * @param descricao (O pedido feito pelo usuario)
     * @param formadepagamento (Opcao que o usario escolheu para pagar pelo produto)
     * @param valor (valor final apos o pedido)
     */
    public Pedido(String descricao, int formadepagamento, String valor) {
        switch (formadepagamento) {
            case 1:
                fpag = FormaPagamento.CREDITO;
                break;
            case 2:
                fpag = FormaPagamento.DEBITO;
                break;
            case 3:
                fpag = FormaPagamento.DINHEIRO;
                break;
            case 4:
                fpag = FormaPagamento.VALE_ALIMENTACAO;
                break;
            case 5:
                fpag = FormaPagamento.VALE_REFEICAO;
                break;
        }
        this.State = Estado.REALIZADO;
        this.Id = geradorId();
        this.descricao = descricao;
        this.valor = valor;
    }

    /**
     * Gerador de um numero aleatorio para servir como ID do pedido.
     * @return (o numero gerado)
     */
    private String geradorId() {
        Random random = new Random();
        String idGerado = "";
        for (int i = 0; i < 3; i++)
            idGerado += random.nextInt(10);
        return idGerado;
    }
}

