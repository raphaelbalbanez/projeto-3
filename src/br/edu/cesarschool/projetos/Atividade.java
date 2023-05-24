package br.edu.cesarschool.projetos;

import java.io.File;
import java.time.LocalDate;
import java.util.Date;

public class Atividade {
	public Date dataDeEntrega;
	private File[] anexos ;
	public Criador autor;
	
	public File[] exportarAnexos() {
		
		return this.anexos;
	}
}
