package br.edu.cesarschool.projetos.classroom;

import java.time.LocalDate;

public class Comentario {
    public Usuario autor;
    public String texto;
    public LocalDate dataDePublicacao;
    
    public void editarComentario(String texto, Usuario autor, LocalDate dataDePublicacao) {
        this.texto = texto;
        this.autor= autor;
        this.dataDePublicacao = dataDePublicacao;
    }
}
