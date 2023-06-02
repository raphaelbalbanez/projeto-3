package br.edu.cesarschool.projetos.strateegia;

import br.edu.cesarschool.projetos.classroom.SalaDeAula;
import br.edu.cesarschool.projetos.classroom.Usuario;

public class Jornada {
    private Usuario usuario;
    private Usuario pessoa;
    private SalaDeAula salaDeAula;
    private Ponto pontos;
    
    public Jornada(Usuario usuario) {
        this.usuario = usuario;
        pessoa = usuario;
    }
    
    public void setSalaDeAula(SalaDeAula sala) {
        salaDeAula = sala;
    }
    
    public void setPontos(Ponto ponto) {
        pontos = ponto;
    }
    
}
