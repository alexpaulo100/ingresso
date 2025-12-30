package br.com.ingresso;

public class Main {
    public static void main(String[] args) {
        // Ingresso normal
        Ingresso ingressoNormal = new Ingresso(20.0, "Matrix", TipoExibicao.LEGENDADO);
        System.out.println("Ingresso Normal:");
        System.out.println("Filme: " + ingressoNormal.getNomeFilme());
        System.out.println("Tipo: " + ingressoNormal.getTipoExibicao());
        System.out.println("Valor: R$ " + ingressoNormal.getValorReal());
        System.out.println();

        // Meia entrada
        MeiaEntrada meiaEntrada = new MeiaEntrada(20.0, "Matrix", TipoExibicao.DUBLADO);
        System.out.println("Meia Entrada:");
        System.out.println("Filme: " + meiaEntrada.getNomeFilme());
        System.out.println("Tipo: " + meiaEntrada.getTipoExibicao());
        System.out.println("Valor: R$ " + meiaEntrada.getValorReal());
        System.out.println();

        // Ingresso família com 4 pessoas com desconto
        IngressoFamilia ingressoFamilia = new IngressoFamilia(20.0, "Matrix", TipoExibicao.LEGENDADO, 4);
        System.out.println("Ingresso Família (4 pessoas):");
        System.out.println("Filme: " + ingressoFamilia.getNomeFilme());
        System.out.println("Tipo: " + ingressoFamilia.getTipoExibicao());
        System.out.println("Número de pessoas: " + ingressoFamilia.getNumeroPessoas());
        System.out.println("Valor total com desconto: R$ " + ingressoFamilia.getValorReal());
        System.out.println();

        // Ingresso família com 3 pessoas sem desconto
        IngressoFamilia ingressoFamilia3 = new IngressoFamilia(20.0, "Matrix", TipoExibicao.DUBLADO, 3);
        System.out.println("Ingresso Família (3 pessoas):");
        System.out.println("Filme: " + ingressoFamilia3.getNomeFilme());
        System.out.println("Tipo: " + ingressoFamilia3.getTipoExibicao());
        System.out.println("Número de pessoas: " + ingressoFamilia3.getNumeroPessoas());
        System.out.println("Valor total sem desconto: R$ " + ingressoFamilia3.getValorReal());
    }
}
