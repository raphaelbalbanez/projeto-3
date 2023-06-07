package br.edu.cesarschool.projetos.geral.entidades;

public class Usuario {
	private String nome;
	private String email;
	private String CPF;
	public Usuario(String nome, String email, String CPF) {
		this.nome = nome;
		this.email = email;
		this.CPF = CPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	protected String getCPF() {
		return CPF;
	}
}
