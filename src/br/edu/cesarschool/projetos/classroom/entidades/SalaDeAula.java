package br.edu.cesarschool.projetos.classroom.entidades;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Arrays;

import br.edu.cesarschool.projetos.exceptions.ExcecaoNaoEncontrada;
import br.edu.cesarschool.projetos.geral.entidades.Plataforma;
import br.edu.cesarschool.projetos.strateegia.entidades.Jornada;

public class SalaDeAula /* implements Plataforma*/ {
	private String titulo;
	private String codigo;
	private String classroomURL;
	private Atividade[] atividades;
	
	public SalaDeAula(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getClassroomURL() {
		return classroomURL;
	}
	
	public void setClassroomURL(String classroomURL) {
		this.classroomURL = classroomURL;
	}
	public Atividade[] getAtividades() {
		return atividades;
	}
	
	private void setAtividades(Atividade[] atividades) {
		this.atividades = atividades;
	}
//	public SalaDeAula criar() {return null;}
//	
//	private void deletar(Plataforma plat) throws ExcecaoSalaNaoEncontrada{
//		SalaDeAula sala = (SalaDeAula) plat;
//	}
	
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
		Atividade atividade = new Atividade(titulo, dataEntrega, conteudo, anexos, this );
		Atividade[] temp;
		if(atividades == null) {
			temp = new Atividade[1];
		}else {
			temp = Arrays.copyOf(atividades, atividades.length < 1 || atividades == null ? 1 : atividades.length + 1);
		}
		temp[atividades == null || atividades.length < 1 ? 0 : atividades.length - 1] = atividade;
		setAtividades(temp);
		return atividade;
	}
	
	public void deletarAtividade(Atividade atividade) throws ExcecaoNaoEncontrada{
		Atividade[] temp = new Atividade[atividades.length - 1];
		boolean found = false;
		int k = 0;
		for(int i = 0 ; i < temp.length ; i++) {
			if(atividades[i] != atividade) {
				temp[i] = atividades[k];
				k++;
			} else {
				found = true;
			}
		}
		setAtividades(temp);
		if(found == false) {
			throw new ExcecaoNaoEncontrada("Sala de Aula não encontrada");
		}
	}
}






















