package br.edu.cesarschool.projetos.strateegia.util;

import br.edu.cesarschool.projetos.classroom.entidades.SalaDeAula;
import br.edu.cesarschool.projetos.geral.entidades.Criador;
import br.edu.cesarschool.projetos.strateegia.entidades.Jornada;

public class Initializer {
	public static SalaDeAula sala = new SalaDeAula("Projetos 3");
	public static Criador criador = new Criador("Henrique Cordeiro", "hcp@cesar.school", "12345678910");
	public static Jornada jornada = new Jornada("Projetos 3", "Status Report 2", criador);
}
