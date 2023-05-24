package br.edu.cesarschool.projetos;

import java.util.Date;

public class Comentario {
    public Usuario autor;
    public String texto;
    public Date dataDePublicacao;
    
    public void editarComentario(String texto,Usuario autor,Date dataDePublicacao) {
        this.texto = texto;
        this.autor= autor;
        this.dataDePublicacao = dataDePublicacao;
    }
}
