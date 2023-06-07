package br.edu.cesarschool.projetos.classroom.entidades;

import java.time.LocalDateTime;

import br.edu.cesarschool.projetos.geral.entidades.Criador;

public class Conteudo {
	private String titulo;
	private String descricao;
	private LocalDateTime dataPostagem;
	private Criador autor;
	
	public Conteudo(String descricao) {
		this.descricao = descricao;
	}
	
	public Conteudo(String titulo, String descricao) {
		this(descricao);
		this.titulo = titulo;
	}
}
