package org.example;

public class OperacaoFactory {

    public static IOperacaoBancaria obterOperacao(String operacao) {
        Class<?> classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.Operacao" + operacao);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Operação bancária inexistente");
        }
        if (!(objeto instanceof IOperacaoBancaria)) {
            throw new IllegalArgumentException("Operação bancária inválida");
        }
        return (IOperacaoBancaria) objeto;
    }
}
