package br.com.ingresso;

public class MeiaEntrada extends Ingresso {

    public MeiaEntrada(double valor, String nomeFilme, TipoExibicao tipoExibicao) {
        super(valor, nomeFilme, tipoExibicao);
    }

    @Override
    public double getValorReal() {
        return valor / 2.0;
    }
}
