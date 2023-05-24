package br.edu.cesarschool.projetos;

import java.time.LocalDateTime;
import java.util.Date;

public class TestaComet {
	public static void main (String[] args) {
		Comentario primeiroComentario = new Comentario();
		Usuario primeiroAutor = new Usuario();
		primeiroAutor.setNome("kikao");
		primeiroComentario.autor = primeiroAutor;
		primeiroComentario.dataDePublicacao = new Date(2023,4,17);
		primeiroComentario.texto = "esse é nosso primeiro comentario";
		System.out.println(primeiroComentario.autor.getNome());
		System.out.println(primeiroComentario.dataDePublicacao);
		System.out.println(primeiroComentario.texto);
		
		String comentarioEditado = "primeiro comentario";
		primeiroComentario.editarComentario(comentarioEditado, primeiroAutor, new Date(2023,4,30));
		System.out.println(primeiroComentario.texto);
		System.out.println(primeiroComentario.dataDePublicacao);
	}

}
