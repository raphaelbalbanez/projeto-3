package br.edu.cesarschool.projetos;

public class Jornada {
    private Usuario usuario;
    private Usuario pessoa;
    private SalaDeAula salaDeAula;
    private Ponto pontos;
    
    public void Jornada(Usuario usuario) {
        this.usuario = usuario;
        pessoa = usuario;
    }
    
    public void salaDeAula(SalaDeAula sala) {
        salaDeAula = sala;
    }
    
    public void pontos(Ponto ponto) {
        pontos = ponto;
    }
    
}
