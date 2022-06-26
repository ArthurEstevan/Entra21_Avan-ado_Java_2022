package br.com.entra21.java.avancado.aula9.enuns;

public enum Idioma {
	
	PORTUGUES("Ola"),
	INGLES("Hello"),
	FRANCES("Salut"),
	ALEMAO("Hi");
	
	private String saudacao;

	private Idioma(String saudacao) {
		this.saudacao = saudacao;
	}

	public String getSaudacao() {
		return saudacao;
	}

}
