package br.com.ingresso;

public class IngressoFamilia extends Ingresso {

    private int numeroPessoas;

    public IngressoFamilia(double valor, String nomeFilme, TipoExibicao tipoExibicao, int numeroPessoas) {
        super(valor, nomeFilme, tipoExibicao);
        if (numeroPessoas <= 0) {
            throw new IllegalArgumentException("Número de pessoas deve ser maior que zero.");
        }
        this.numeroPessoas = numeroPessoas;
    }

    @Override
    public double getValorReal() {
        double total = valor * numeroPessoas;
        if (numeroPessoas > 3) {
            total = total * 0.95; // 5% de desconto
        }
        return total;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }
}
