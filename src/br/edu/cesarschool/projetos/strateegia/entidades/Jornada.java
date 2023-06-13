package br.edu.cesarschool.projetos.strateegia.entidades;

import java.util.Arrays;

import br.edu.cesarschool.projetos.classroom.entidades.SalaDeAula;
import br.edu.cesarschool.projetos.exceptions.ExcecaoNaoEncontrada;
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
	
	private void setPontos(Ponto[] pontos) {
		this.pontos = pontos;
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
	
	public Ponto adicionarPonto(String titulo, String tema, String assunto, TipoPonto tipo) {
		Ponto ponto= new Ponto(titulo, tema, assunto, tipo);
		Ponto[] temp;
		if(pontos == null) {
			temp = new Ponto[1];
		} else {
			temp = Arrays.copyOf(pontos, pontos.length < 1 || pontos == null ? 1 : pontos.length + 1);
		}
		temp[pontos== null || pontos.length < 1 ? 0 : pontos.length - 1] = ponto;
		setPontos(temp);
		return ponto;
	}
	
	public void deletarPonto(Ponto ponto) throws ExcecaoNaoEncontrada {
		Ponto[] temp = new Ponto[pontos.length - 1];
		boolean found = false;
		int k = 0;
		for(int i = 0 ; i < temp.length ; i++) {
			if(pontos[i] != ponto) {
				temp[i] = pontos[k];
				k++;
			} else {
				found = true;
			}
		}
		setPontos(temp);
		if(found == false) {
			throw new ExcecaoNaoEncontrada("Ponto não encontrado");
		}
	}
}
