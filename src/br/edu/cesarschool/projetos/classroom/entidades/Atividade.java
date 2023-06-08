package br.edu.cesarschool.projetos.classroom.entidades;

import java.io.File;
import java.time.LocalDateTime;

import br.edu.cesarschool.projetos.geral.entidades.Criador;

public class Atividade {
	private LocalDateTime dataEntrega;
	private File[] anexos;
	private Criador autor;
	private Conteudo conteudo;
	private SalaDeAula salaDeAula;
	
	public Atividade(LocalDateTime dataEntrega, SalaDeAula salaDeAula) {
		this.dataEntrega = dataEntrega;
		this.salaDeAula = salaDeAula;
	}
	
	public Atividade(LocalDateTime dataEntrega, Conteudo conteudo, SalaDeAula salaDeAula) {
		this(dataEntrega, salaDeAula);
		this.conteudo = conteudo;
	}
	
	public Atividade(LocalDateTime dataEntrega, File[] anexos, SalaDeAula salaDeAula) {
		this(dataEntrega, salaDeAula);
		this.anexos = anexos;
	}
	
	public Atividade(LocalDateTime dataEntrega, Conteudo conteudo, File[] anexos, SalaDeAula salaDeAula) {
		this(dataEntrega, conteudo, salaDeAula);
		this.anexos = anexos;
	}

	public LocalDateTime getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(LocalDateTime dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public Conteudo getConteudo() {
		return conteudo;
	}

	public void setConteudo(Conteudo conteudo) {
		this.conteudo = conteudo;
	}

	public File[] getAnexos() {
		return anexos;
	}

	public Criador getAutor() {
		return autor;
	}
	public SalaDeAula getSalaDeAula() {
		return salaDeAula;
	}
	
	public File adicionarAnexo(File anexo) {
		return null;
	}
	public File[] exportarAnexos() {
		return null;
		}
}
