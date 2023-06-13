package br.edu.cesarschool.projetos.mediators;

import java.io.File;
import java.time.LocalDateTime;

import br.edu.cesarschool.projetos.classroom.entidades.Atividade;
import br.edu.cesarschool.projetos.classroom.entidades.Conteudo;
import br.edu.cesarschool.projetos.classroom.entidades.SalaDeAula;
import br.edu.cesarschool.projetos.strateegia.util.Initializer;

public class ClassroomMediator {
	private static ClassroomMediator instance;
	private SalaDeAula sala = Initializer.sala;
	private ClassroomMediator() {
	}
	
	public static ClassroomMediator getInstance() {
		if(instance == null) {
			instance = new ClassroomMediator();
		}
		return instance;
	}
	
	public SalaDeAula getSalaDeAula() {
		return sala;
	}
	public void setClassroomURL(String classroomURL) {
		sala.setClassroomURL(classroomURL);
	}
	public Atividade adicionarAtividade(String titulo, LocalDateTime dataEntrega) {
		return adicionarAtividade(titulo, dataEntrega, null, null);
	}
	
	public Atividade adicionarAtividade(String titulo, LocalDateTime dataEntrega, Conteudo conteudo) {
		return adicionarAtividade(titulo, dataEntrega, null, conteudo);
	}
	
	public Atividade adicionarAtividade(String titulo, LocalDateTime dataEntrega, File[] anexos) {
		return adicionarAtividade(titulo, dataEntrega, anexos, null);
	}
	
	public Atividade adicionarAtividade(String titulo, LocalDateTime dataEntrega, File[] anexos, Conteudo conteudo) {
		return sala.adicionarAtividade(titulo, dataEntrega, anexos, conteudo);
	}
	
	public void deletarAtividade(Atividade atividade) {
		try {			
			sala.deletarAtividade(atividade);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
