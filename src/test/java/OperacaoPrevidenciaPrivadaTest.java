package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacaoPrevidenciaPrivadaTest {

    @Test
    void deveExecutarPrevidenciaPrivada() {
        IOperacaoBancaria operacao = OperacaoFactory.obterOperacao("PrevidenciaPrivada");
        assertEquals("Previdencia privada contratada, acompanhe os rendimentos pelo app.", operacao.executar());
    }

    @Test
    void deveCancelarPrevidenciaPrivada() {
        IOperacaoBancaria operacao = OperacaoFactory.obterOperacao("PrevidenciaPrivada");
        assertEquals("Previdencia foi cancelada", operacao.cancelar());
    }
}