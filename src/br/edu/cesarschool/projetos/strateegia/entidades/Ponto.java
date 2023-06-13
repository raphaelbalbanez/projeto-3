package br.edu.cesarschool.projetos.strateegia.entidades;

import java.time.LocalDateTime;

import br.edu.cesarschool.projetos.classroom.entidades.Atividade;
import br.edu.cesarschool.projetos.strateegia.util.TipoPonto;

public class Ponto {
	private String titulo;
	private String tema;
	private String assunto;
	private LocalDateTime dataCriacao;
	private Atividade atividade;
	private TipoPonto tipo;
	public Ponto(String titulo, String tema, String assunto, TipoPonto tipo) {
		this.tema = tema;
		this.assunto = assunto;
		this.dataCriacao = LocalDateTime.now();
		this.tipo = tipo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public Atividade getAtividade() {
		return atividade;
	}
	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}
	public TipoPonto getTipo() {
		return tipo;
	}
	public void setTipo(TipoPonto tipo) {
		this.tipo = tipo;
	}
	
	
}
