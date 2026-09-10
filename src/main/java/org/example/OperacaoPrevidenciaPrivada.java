package org.example;

public class OperacaoPrevidenciaPrivada implements IOperacaoBancaria {

    public String executar() {
        return "Previdencia privada contratada, acompanhe os rendimentos pelo app.";
    }


    public String cancelar() {
        return "Previdencia foi cancelada";
    }
}
