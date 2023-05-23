package br.edu.cesarschool.projetos;

import java.util.Date;

public class Comentario {
    private Usuario autor;
    private String texto;
    private Date dataDePostagem;
    
    public void autor(Usuario usuario) {
        autor = usuario;
    }
    
    public void dataDePostagem(Date data) {
        dataDePostagem = data;
    }
    
    public String getTexto() {
        return texto;
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }
}
