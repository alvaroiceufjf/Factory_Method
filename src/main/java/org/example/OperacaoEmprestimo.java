package org.example;


public class OperacaoEmprestimo implements IOperacaoBancaria {

    public String executar() {
        return "Empréstimo contratado e creditado na conta.";
    }


    public String cancelar() {
        return "Contratação de empréstimo cancelada.";
    }
}
