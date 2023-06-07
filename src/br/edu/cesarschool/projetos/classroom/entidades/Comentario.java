package br.edu.cesarschool.projetos.classroom.entidades;

import java.time.LocalDateTime;

import br.edu.cesarschool.projetos.geral.entidades.Usuario;

public class Comentario {
	private Usuario autor;
	private String texto;
	private LocalDateTime dataPublicacao;
	private boolean editado;
	
	public Comentario(String texto) {
		this.texto = texto;
	}

	public Usuario getAutor() {
		return autor;
	}

	public String getTexto() {
		return texto;
	}
	
	public boolean isEditado() {
		return editado;
	}
	public LocalDateTime getDataPublicacao() {
		return dataPublicacao;
	}
	
	public String editarComentario(String textoEditado) {
		this.texto = textoEditado;
		return textoEditado;
	}
	
	public void deletarComentario() {
	}
	
	public String adicionarComentario(String texto) {
		this.texto = texto;
		return texto;
	}
}
