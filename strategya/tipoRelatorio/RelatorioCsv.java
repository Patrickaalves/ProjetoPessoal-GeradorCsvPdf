package br.com.patrick.strategya.tipoRelatorio;

import br.com.patrick.strategya.relatorio.Informacoes;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RelatorioCsv implements TipoRelatorio{

    Date dataAtual = new Date();
    String dataFormatada = String.valueOf(dataAtual);
    String url = "C:/Users/patri/Documentos/Desenvolvimento/Aprendizado/Alura/DesignPatternsUm/Strategy/src/br/com/patrick/strategya/files/csv/"+ dataFormatada.replace(" ","").replace(":","-")+"-relatorio.csv";

    @Override
    public void gerarRelatorio(Informacoes informacoes) {
        criarArquivo(this.url);

        try {
            List<String> existentes = LinhasExistentes(this.url);
            String linha = informacoes.getNome()+";"+ informacoes.getIdade()+";";
            existentes.add(linha);

            // Adicionar o csv
            String todasLinhas = UnicaLinha(existentes);

            FileWriter arquivo = new FileWriter(url);
            arquivo.write(todasLinhas);
            arquivo.close();

        }catch (Exception e) {
            System.out.println("Erro ao gerar o arquivo" + this.url);
        }
    }

    public String UnicaLinha(List<String> existentes){
        String unicaLinha = "";
        for(String linha: existentes){
            unicaLinha += linha + "\n";
        }
        return unicaLinha;
    }

    public void criarArquivo(String url){
        try {
            File arquivo = new File(url);
            arquivo.createNewFile();
        }catch (Exception e) {
            System.out.println("Erro ao criar o arquivo.");
            System.out.println("Descrição:" + e);
        }
    }

    public List<String> LinhasExistentes(String url){

        List<String> result = new ArrayList<>();

        try {
            Path path = Paths.get(url);
            result = Files.readAllLines(path);
        }catch (Exception e) {
            System.out.println("Descrição:" + e);
        }
        return result;
    }

}
