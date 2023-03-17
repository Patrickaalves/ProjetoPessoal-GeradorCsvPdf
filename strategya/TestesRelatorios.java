package br.com.patrick.strategya;

import br.com.patrick.strategya.relatorio.Informacoes;
import br.com.patrick.strategya.tipoRelatorio.GeradorDeRelatorios;
import br.com.patrick.strategya.tipoRelatorio.RelatorioCsv;
import br.com.patrick.strategya.tipoRelatorio.RelatorioPdf;

import java.util.Date;

public class TestesRelatorios {
    public static void main(String[] args) {

        Informacoes patrick = new Informacoes("Patrick",10);

        GeradorDeRelatorios relatorios = new GeradorDeRelatorios();

        relatorios.gerarRelatorio(patrick,new RelatorioCsv());
        relatorios.gerarRelatorio(patrick,new RelatorioPdf());

    }
}
