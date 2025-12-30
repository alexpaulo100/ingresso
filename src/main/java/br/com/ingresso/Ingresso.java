package br.com.ingresso;

public class Ingresso {
    protected double valor;
    protected String nomeFilme;
    protected TipoExibicao tipoExibicao;

    public Ingresso(double valor, String nomeFilme, TipoExibicao tipoExibicao) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.tipoExibicao = tipoExibicao;
    }

    public double getValorReal() {
        return valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public TipoExibicao getTipoExibicao() {
        return tipoExibicao;
    }
}
