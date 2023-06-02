package br.edu.cesarschool.projetos.classroom;

import java.io.File;
import java.time.LocalDate;

import br.edu.cesarschool.projetos.strateegia.Criador;

public class Atividade {
	public LocalDate dataDeEntrega;
	private File[] anexos ;
	public Criador autor;
	
	public File[] exportarAnexos() {
		
		return this.anexos;
	}
}
