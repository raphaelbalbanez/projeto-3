package br.edu.cesarschool.projetos;

import java.time.LocalDate;
import java.util.Date;

public class Conteudo {
    private String titulo;
    private String descricao;
    private Date dataDePostagem;
    
    public void dataDePostagem(Date data) {
        dataDePostagem = data;
    }
    
    public class Main {
        public static void main(String[] args) {
            LocalDate dataAtual = LocalDate.now();
            System.out.println(dataAtual);
        }
    }

}
