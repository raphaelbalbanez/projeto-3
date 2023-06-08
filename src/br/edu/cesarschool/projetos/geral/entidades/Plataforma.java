package br.edu.cesarschool.projetos.geral.entidades;

import br.edu.cesarschool.projetos.exceptions.ExcecaoPlataformaNaoEncontrada;

public interface Plataforma {
	Plataforma criar();
	void deletar(Plataforma plat) throws ExcecaoPlataformaNaoEncontrada;
}
