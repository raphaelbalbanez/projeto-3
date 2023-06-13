package br.edu.cesarschool.projetos.geral.entidades;

import java.util.Arrays;

import br.edu.cesarschool.projetos.classroom.entidades.SalaDeAula;
import br.edu.cesarschool.projetos.exceptions.ExcecaoQuantidadeInsuficiente;
import br.edu.cesarschool.projetos.exceptions.ExcecaoNaoEncontrada;
import br.edu.cesarschool.projetos.strateegia.entidades.Jornada;

public class Criador extends Usuario{
	private Jornada[] jornadas;
	private SalaDeAula[] salasDeAula;
	public Criador(String nome, String email, String CPF) {
		super(nome, email, CPF);
	}
	
	private void setSalasDeAula(SalaDeAula[] salasDeAula) {
		this.salasDeAula = salasDeAula;
	}
	
	private void setJornadas(Jornada[] jornadas) {
		this.jornadas = jornadas;
	}
	public Jornada[] getJornadas() {
		return jornadas;
	}
	
	public SalaDeAula[] getSalasDeAula() {
		return salasDeAula;
	}

	public SalaDeAula anexarSala(String URL) {
		// find corresponding classroom from URL
		// update salasDeAula array with attached classroom
		return null;
	}
	
	public Jornada criarJornada(String titulo, String descricao) {
		return criarJornada(titulo, descricao, null);
	}
	
	public Jornada criarJornada(String titulo, String descricao, SalaDeAula salaAnexada) {
		Jornada jornada = new Jornada(titulo, descricao, this, salaAnexada);
		Jornada[] temp;
		if(jornadas == null) {
			temp = new Jornada[1];
		}else{
			temp = Arrays.copyOf(jornadas, jornadas.length < 1 ? 1 : jornadas.length + 1);
		}
		temp[jornadas.length < 1 || jornadas == null ? 0 : jornadas.length - 1] = jornada;
		setJornadas(temp);
		return jornada;
	}
	public void deletarJornada(Jornada jornada) throws ExcecaoNaoEncontrada, ExcecaoQuantidadeInsuficiente{
		if(jornadas.length < 1) {
			throw new ExcecaoQuantidadeInsuficiente("Não há Jornadas criadas.");
		}
		Jornada[] temp = new Jornada[jornadas.length - 1];
		boolean found = false;
		int k = 0;
		for(int i = 0 ; i < temp.length ; i++) {
			if(jornadas[i] != jornada) {
				temp[i] = jornadas[k];
				k++;
			} else {
				found = true;
			}
		}
		setJornadas(temp);
		if(found == false) {
			throw new ExcecaoNaoEncontrada("Jornada não encontrada");
		}
	}
	// refatorar para criar e deletar serem responsabilidades de SalaDeAula e de Jornada
	// por meio de uma interface Plataforma que define criar() e deletar()
		// tentei, mas não fez sentido
		// tentativa: métodos estático em SalaDeAula e em Jornada e construtor private
		// não faz sentido método estático e abstrato, revisitar...
	public SalaDeAula criarSalaDeAula(String titulo) {
		SalaDeAula sala = new SalaDeAula(titulo);
		SalaDeAula[] temp;
		if(salasDeAula == null) {
			temp = new SalaDeAula[1];
		}else{
			temp = Arrays.copyOf(salasDeAula, salasDeAula.length < 1 || salasDeAula == null ? 1 : salasDeAula.length + 1);
		}
		temp[salasDeAula.length < 1 || salasDeAula == null ? 0 : salasDeAula.length - 1] = sala;
		setSalasDeAula(temp);
		return sala;
	}
	
	public void deletarSalaDeAula(SalaDeAula sala) throws ExcecaoNaoEncontrada, ExcecaoQuantidadeInsuficiente{
		if(salasDeAula.length < 1) {
			throw new ExcecaoQuantidadeInsuficiente("Não há Salas de Aula criadas.");
		}
		SalaDeAula[] temp = new SalaDeAula[salasDeAula.length - 1];
		boolean found = false;
		int k = 0;
		for(int i = 0 ; i < temp.length ; i++) {
			if(salasDeAula[i] != sala) {
				temp[i] = salasDeAula[k];
				k++;
			} else {
				found = true;
			}
		}
		setSalasDeAula(temp);
		if(found == false) {
			throw new ExcecaoNaoEncontrada("Sala de Aula não encontrada");
		}
	}
}
