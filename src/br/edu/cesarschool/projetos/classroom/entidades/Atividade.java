package br.edu.cesarschool.projetos.classroom.entidades;

import java.io.File;
import java.time.LocalDateTime;

import br.edu.cesarschool.projetos.geral.entidades.Criador;

public class Atividade {
	private LocalDateTime dataEntrega;
	private File[] anexos;
	private Criador autor;
	private Conteudo conteudo;
	
	public Atividade(LocalDateTime dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	
	public Atividade(LocalDateTime dataEntrega, Conteudo conteudo) {
		this(dataEntrega);
		this.conteudo = conteudo;
	}
	
	public Atividade(LocalDateTime dataEntrega, File[] anexos) {
		this(dataEntrega);
		this.anexos = anexos;
	}
	
	public Atividade(LocalDateTime dataEntrega, Conteudo conteudo, File[] anexos) {
		this(dataEntrega, conteudo);
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
	
	public File adicionarAnexo(File anexo) {
		return null;
	}
	public File[] exportarAnexos() {
		return null;
		}
}
