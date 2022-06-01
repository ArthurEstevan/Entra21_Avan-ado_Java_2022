package br.com.entra21.java.avancado.aula_01.enums;

public enum PersonagemJogo {
	
	//
	BARBARO(1000, "Full HP"), ANAO(100, "Ferreiro"), DRUIADA(50, "Suport"), SACERDOTE(10, "Saving"), MAGO(50, "Supreme");
	
	private final int LIFE;
	private final String DESCRICAO;
	
	private PersonagemJogo(int life, String descricao) {
	this.LIFE = life;
	this.DESCRICAO = descricao;
	}
	
	public int getLIFE() {
		return LIFE;
	}

	public String getDESCRICAO() {
		return DESCRICAO;
	}
}

