package br.com.entra21.java.advanced.class_01.enum_;

//declaração do meu "Enum"
public enum gameCharacter {
	
	//criação da minhas constantes
	BARBARO(1000, "Full HP"), ANAO(100, "Ferreiro"), DRUIADA(50, "Suport"), SACERDOTE(10, "Saving"), MAGO(50, "Supreme");
	
	//criando os váriaveis para minhas constantes
	private final int LIFE;
	private final String DESCRICAO;
	
	//construtor
	private gameCharacter(int life, String descricao) {
	this.LIFE = life;
	this.DESCRICAO = descricao;
	}
	
	//gets
	//(não pode se usar sets porque são constantes)
	public int getLIFE() {
		return LIFE;
	}

	public String getDESCRICAO() {
		return DESCRICAO;
	}
}

