package org.example;


public class OperacaoConsorcio implements IOperacaoBancaria {

    public String executar() {
        return "Consorcio contratado, suas parcelas serão debitadas automaticamente";
    }


    public String cancelar() {
        return "Contratação de consórcio cancelada";
    }
}
