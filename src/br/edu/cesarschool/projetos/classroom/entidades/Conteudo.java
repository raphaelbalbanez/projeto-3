package br.edu.cesarschool.projetos.classroom.entidades;

import java.time.LocalDateTime;

import br.edu.cesarschool.projetos.geral.entidades.Criador;

public class Conteudo {
	private String titulo;
	private String descricao;
	private LocalDateTime dataPostagem;
	private Criador autor;
	private SalaDeAula salaDeAula;
	
	public Conteudo(String descricao, SalaDeAula salaDeAula) {
		this.descricao = descricao;
		this.salaDeAula = salaDeAula;
	}
	
	public Conteudo(String titulo, String descricao, SalaDeAula salaDeAula) {
		this(descricao, salaDeAula);
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataPostagem() {
		return dataPostagem;
	}

	public Criador getAutor() {
		return autor;
	}
	
	public SalaDeAula getSalaDeAula() {
		return salaDeAula;
	}
	
}
