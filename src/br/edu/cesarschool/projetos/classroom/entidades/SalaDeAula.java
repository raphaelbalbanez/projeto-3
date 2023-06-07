package br.edu.cesarschool.projetos.classroom.entidades;

import java.io.File;
import java.time.LocalDateTime;

public class SalaDeAula {
	private String titulo;
	private String codigo;
	private String classroomURL;
	
	public SalaDeAula(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getClassroomURL() {
		return classroomURL;
	}
	
	public Atividade adicionarAtividade(LocalDateTime dataEntrega) {
		return null;
	}
	
	public Atividade adicionarAtividade(LocalDateTime dataEntrega, Conteudo conteudo) {
		return null;
	}
	
	public Atividade adicionarAtividade(LocalDateTime dataEntrega, File[] anexos) {
		return null;
	}
	
	public Atividade adicionarAtividade(LocalDateTime dataEntrega, File[] anexos, Conteudo conteudo) {
		return null;
	}
	
	public void deletarAtividade(){}
}
