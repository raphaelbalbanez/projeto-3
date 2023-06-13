package br.edu.cesarschool.projetos.mediators;

import br.edu.cesarschool.projetos.strateegia.entidades.Jornada;
import br.edu.cesarschool.projetos.strateegia.entidades.Ponto;
import br.edu.cesarschool.projetos.strateegia.util.Initializer;
import br.edu.cesarschool.projetos.strateegia.util.TipoPonto;

public class StrateegiaMediator {
	private static StrateegiaMediator instance;
	private Jornada jornada = Initializer.jornada;
	private StrateegiaMediator() {
	}
	public static StrateegiaMediator getInstance() {
		if(instance == null) {
			instance = new StrateegiaMediator();
		}
		return instance;
	}
	public Ponto adicionarPonto(String titulo, String tema, String assunto, TipoPonto tipo) {
		return jornada.adicionarPonto(titulo, tema, assunto, tipo);
	}
	
	public void deletarPonto(Ponto ponto) {
		try {
			jornada.deletarPonto(ponto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
