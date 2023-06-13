package br.edu.cesarschool.projetos.mediators;

import br.edu.cesarschool.projetos.classroom.entidades.SalaDeAula;
import br.edu.cesarschool.projetos.geral.entidades.Criador;
import br.edu.cesarschool.projetos.strateegia.entidades.Jornada;

public class CriadorMediator {

	private static CriadorMediator instance;
	Criador criador;
	private CriadorMediator() {
		
	}
	
	public static CriadorMediator getInstance() {
		if(instance == null) {
			instance = new CriadorMediator();
		}
		return instance;
	}
	
	public Jornada criarJornada(String titulo, String descricao) {
		return criarJornada(titulo, descricao, null);
	}
	
	public Jornada criarJornada(String titulo, String descricao, SalaDeAula salaAnexada) {
		return criador.criarJornada(titulo, descricao, salaAnexada);
	}
}
