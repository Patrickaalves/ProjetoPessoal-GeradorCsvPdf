package br.com.patrick.strategya.tipoRelatorio;

import br.com.patrick.strategya.relatorio.Informacoes;

public class GeradorDeRelatorios {

    public void gerarRelatorio(Informacoes info, TipoRelatorio tipo){
        tipo.gerarRelatorio(info);
    }
}
