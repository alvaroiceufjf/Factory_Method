package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacaoConsorcioTest {

    @Test
    void deveExecutarConsorcio() {
        IOperacaoBancaria operacao = OperacaoFactory.obterOperacao("Consorcio");
        assertEquals("Consorcio contratado, suas parcelas serão debitadas automaticamente", operacao.executar());
    }

    @Test
    void deveCancelarConsorcio() {
        IOperacaoBancaria operacao = OperacaoFactory.obterOperacao("Consorcio");
        assertEquals("Contratação de consórcio cancelada", operacao.cancelar());
    }
}