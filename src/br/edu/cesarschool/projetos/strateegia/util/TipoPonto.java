package br.edu.cesarschool.projetos.strateegia.util;

public enum TipoPonto {
	PARTIDA(1, "Ponto de Partida", "Crie um kit em segundos com Inteligência Artificial"),
	DIVERGENCIA(2, "Ponto de Divergência", "Adicione um kit para criar debates"),
	CONVERGENCIA(3, "Ponto de Convergência", "Faça escolhas de maneira colaborativa"),
	CONVERSACAO(4, "Ponto de Conversação", "Agende uma reunião para discussão"),
	AVISO(5, "Ponto de Aviso", "Envie uma mensagem para todos");
	
	private int codigo;
	private String nome;
	private String descricao;
	
	private TipoPonto(int codigo, String nome, String descricao) {
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
	}
		
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;	
	}
	
	public static TipoPonto getByCode(int codigo){
		TipoPonto[] opcoes = TipoPonto.values();
		for(TipoPonto tipo : opcoes) {
			if(tipo.getCodigo() == codigo) {
				return tipo;
			}
		}
		return null;
	}
}
