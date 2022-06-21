package br.com.entra21.java.avancado.aula9;

public enum CriptoMoedas {

	BITCOIN("Satoshi Nakamoto", 103.027), ETHEREUM("Vitalik Buterin", 5.720), LITECOIN("Charlie Lee", 287.28);
	
	private CriptoMoedas(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	private String nome;
	private double preco;

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

}
