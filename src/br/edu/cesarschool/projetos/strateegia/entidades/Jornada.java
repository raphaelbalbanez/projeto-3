package br.edu.cesarschool.projetos.strateegia.entidades;

import br.edu.cesarschool.projetos.classroom.entidades.SalaDeAula;
import br.edu.cesarschool.projetos.geral.entidades.Criador;
import br.edu.cesarschool.projetos.geral.entidades.Usuario;
import br.edu.cesarschool.projetos.strateegia.util.TipoPonto;

public class Jornada /* implements Plataforma */ {
	private String titulo;
	private String descricao;
	private Criador criador;
	private Usuario[] usuarios;
	private SalaDeAula salaAnexada;
	private Ponto[] pontos;
	
	public Jornada(String titulo, String descricao, Criador criador) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.criador = criador;
	}
	
	public Jornada(String titulo, String descricao, Criador criador, SalaDeAula salaAnexada) {
		this(titulo, descricao, criador);
		this.salaAnexada = salaAnexada;
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

	public Criador getCriador() {
		return criador;
	}

	public Usuario[] getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}

	public SalaDeAula getSalaAnexada() {
		return salaAnexada;
	}

	public void setSalaAnexada(SalaDeAula salaAnexada) {
		this.salaAnexada = salaAnexada;
	}

	public Ponto[] getPontos() {
		return pontos;
	}
	
	public void adicionarPonto(String tema, String assunto, TipoPonto tipo) {
	}
	
	public void deletarPonto() {
	}
}
