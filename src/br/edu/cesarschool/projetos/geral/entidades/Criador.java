package br.edu.cesarschool.projetos.geral.entidades;

import br.edu.cesarschool.projetos.classroom.entidades.SalaDeAula;
import br.edu.cesarschool.projetos.strateegia.entidades.Jornada;

public class Criador extends Usuario{
	private Jornada[] jornadas;
	private SalaDeAula[] salasDeAula;
	public Criador(String nome, String email, String CPF) {
		super(nome, email, CPF);
	}
	
	public Jornada[] getJornadas() {
		return null;
	}
	
	public SalaDeAula[] getSalasDeAula() {
		return salasDeAula;
	}

	public SalaDeAula anexarSala(String URL) {
		return null;
	}
	
	public Jornada criarJornada(String titulo, String descricao) {
		return null;
	}
	
	public Jornada criarJornada(String titulo, String descricao, SalaDeAula salaAnexada) {
		return null;
	}
	public void deletarJornada() {
	}
	
	public SalaDeAula criarSalaDeAula(String titulo) {
		return null;
	}
	
	public void deletarSalaDeAula() {}
}
