package br.com.patrick.strategya.tipoRelatorio;

import br.com.patrick.strategya.relatorio.Informacoes;

public class RelatorioPdf implements TipoRelatorio{

    @Override
    public void gerarRelatorio(Informacoes informacoes) {
        System.out.println("**************************************************");
        System.out.println("Relatório gerado em pdf");
        System.out.println("**************************************************");

        System.out.println(informacoes.getIdade());
        System.out.println(informacoes.getNome());
    }
}
