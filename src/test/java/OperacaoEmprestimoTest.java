/**
*
*/
package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacaoEmprestimoTest {

    @Test
    void deveExecutarEmprestimo() {
        IOperacaoBancaria operacao = OperacaoFactory.obterOperacao("Emprestimo");
        assertEquals("Empréstimo contratado e creditado na conta.", operacao.executar());
    }

    @Test
    void deveCancelarEmprestimo() {
        IOperacaoBancaria operacao = OperacaoFactory.obterOperacao("Emprestimo");
        assertEquals("Contratação de empréstimo cancelada.", operacao.cancelar());
    }

}