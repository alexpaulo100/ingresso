package br.com.ingresso;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngressoTest {

    @Test
    void testMeiaEntrada() {
        MeiaEntrada meia = new MeiaEntrada(20.0, "Matrix", TipoExibicao.DUBLADO);
        assertEquals(10.0, meia.getValorReal());
    }

    @Test
    void testIngressoFamiliaDesconto() {
        IngressoFamilia familia = new IngressoFamilia(20.0, "Matrix", TipoExibicao.LEGENDADO, 4);
        assertEquals(20.0 * 4 * 0.95, familia.getValorReal());
    }

    @Test
    void testIngressoFamiliaSemDesconto() {
        IngressoFamilia familia = new IngressoFamilia(20.0, "Matrix", TipoExibicao.LEGENDADO, 3);
        assertEquals(20.0 * 3, familia.getValorReal());
    }

    @Test
    void testIngressoNormal() {
        Ingresso ingresso = new Ingresso(20.0, "Matrix", TipoExibicao.DUBLADO);
        assertEquals(20.0, ingresso.getValorReal());
        assertEquals("Matrix", ingresso.getNomeFilme());
        assertEquals(TipoExibicao.DUBLADO, ingresso.getTipoExibicao());
    }

    @Test
    void testIngressoFamiliaNumeroPessoasInvalido() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new IngressoFamilia(20.0, "Matrix", TipoExibicao.LEGENDADO, 0);
        });
        assertEquals("Número de pessoas deve ser maior que zero.", exception.getMessage());
    }


}
