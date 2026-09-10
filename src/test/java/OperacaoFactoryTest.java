package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacaoFactoryTest {

    @Test
    void deveRetornarExcecaoParaOperacaoInexistente() {
        try {
            IOperacaoBancaria operacao = OperacaoFactory.obterOperacao("Investimento");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Operação bancária inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaOperacaoInvalida() {
        try {

            IOperacaoBancaria operacao = OperacaoFactory.obterOperacao("Invalida");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Operação bancária inválida", e.getMessage());
        }
    }
}