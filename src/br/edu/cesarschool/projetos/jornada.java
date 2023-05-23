package br.edu.cesarschool.projetos;

public class jornada {
    private Usuario usuario;
    private Usuario pessoa;
    private salaDeAula salaDeAula;
    private Ponto pontos;
    
    public void Jornada(Usuario usuario) {
        this.usuario = usuario;
        pessoa = usuario;
    }
    
    public void salaDeAula(salaDeAula sala) {
        salaDeAula = sala;
    }
    
    public void pontos(Ponto ponto) {
        pontos = ponto;
    }
    
}
