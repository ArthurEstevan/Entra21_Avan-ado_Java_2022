package br.com.entra21.java.avancado.aula9;

import java.util.Scanner;

import br.com.entra21.java.avancado.aula9.annotation.Informacao;
import br.com.entra21.java.avancado.aula9.enuns.Idioma;

@Informacao (informacoes = Informacao.Informacoes.DONE, value = "Conclusão do Uso de Enum")
public class Enum {

	public enum DiasDaSemana {
		SEGUNDA, 
		TERCA, 
		QUARTA, 
		QUINTA, 
		SEXTA, 
		SABADO, 
		DOMINGO,
	}
	
	static public enum CriptoMoedas {
		
		BITCOIN("Satoshi Nakamoto", 103.027), 
		ETHEREUM("Vitalik Buterin", 5.720), 
		LITECOIN("Charlie Lee", 287.28);
		
		private CriptoMoedas(String criador, double preco) {
			this.criador = criador;
			this.preco = preco;
		}

		private String criador;
		private double preco;

		public String getNome() {
			return criador;
		}

		public double getPreco() {
			return preco;
		}
	}
	
	public static void practicingEnum() {
		
		Scanner input = new Scanner(System.in);
		byte opcao;
		
		System.out.println("\n\t_____| Welcome to Studies |_____");
		
		do {
			
			System.out.println("\nPraticando Enum\n");
			System.out.println("0) Voltar");
			System.out.println("1) Enum Dentro da Classe");
			System.out.println("2) Enum Fora da Classe");
			System.out.println("3) Percorrendo Enum");
			System.out.println("--------------------------------------------------------");
			System.out.print(  "Escola uma opção válida:");
			opcao = input.nextByte();
			
			switch (opcao) {
			
			case 1:
			enumDentroDaClase();
			break;
			
			case 2:
			enumForaDaClasse();
			break;

		    case 3:
			percorrerEnum();
			break;


			default:
			System.out.println("-Escolha um opção correta-");
			break;
			
			}
		}while(opcao != 0);
		
	}
	
	public static void enumDentroDaClase() {
		
		System.out.println("\n============= Exercitando Enum =============\n");
		
		System.out.println("---------- Enum Dentro da Classe ----------\n");
		
		System.out.println("Primeiro dia da semana é " + DiasDaSemana.DOMINGO + " (mostra o título)");
		System.out.println("Segundo dia da semana é " + DiasDaSemana.SEGUNDA);
		System.out.println("Terceiro dia da semana é " + DiasDaSemana.TERCA);
		System.out.println("Quarto dia da semana é " + DiasDaSemana.QUARTA);
		System.out.println("Quinto dia da semana é " + DiasDaSemana.QUINTA);
		System.out.println("Sexto dia da semana é " + DiasDaSemana.SEXTA);
		System.out.println("Setimo dia da semana é " + DiasDaSemana.SABADO);
		
		System.out.println("\n---------- Enum Dentro da Classe ----------\n");

		System.out.println("BitCoin (mostrar o título) = " + CriptoMoedas.BITCOIN);
		System.out.println("BitCoin (mostrar o nome) = " + CriptoMoedas.BITCOIN.name());
		System.out.println("BitCoin (mostrar a posição) = " + CriptoMoedas.BITCOIN.ordinal());
		System.out.println("BitCoin (mostrar atributo defenido) = " + CriptoMoedas.BITCOIN.getNome());
		System.out.println("BitCoin (mostrar atributo defenido) = " + CriptoMoedas.BITCOIN.getPreco());
	
		System.out.println("\n============= Exercitando Enum =============");
	}
	
	private static void enumForaDaClasse() {
		
		System.out.println("\n============= Exercitando Enum =============\n");
		
		System.out.println("---------- Enum Fora da Classe ----------\n");
		
		System.out.println("_____| Aprendendo Saudações em Vários Idiomas |_____\n");
		System.out.println("Brasil: "  + Idioma.PORTUGUES.getSaudacao());
		System.out.println("Inglês: "  + Idioma.INGLES.getSaudacao());
		System.out.println("Francês: " + Idioma.FRANCES.getSaudacao());
		System.out.println("Alemão: "  + Idioma.ALEMAO.getSaudacao());
		
		System.out.println("\n---------- Enum Fora da Classe ----------\n");
		
		System.out.println("Portugês (mostrar o título) = " + Idioma.PORTUGUES);
		System.out.println("Portugês (mostrar o nome) = " + Idioma.PORTUGUES.name());
		System.out.println("Portugês (mostrar o posição) = " + Idioma.PORTUGUES.ordinal());
		System.out.println("Portugês (mostrar atributo defenido) = " + Idioma.PORTUGUES.getSaudacao());
		
		
		System.out.println("\n============= Exercitando Enum =============");
		
	}
	
	private static void percorrerEnum() {
		
		System.out.println("\n============= Exercitando Enum =============\n");
		
		System.out.println("---------- Percorrendo Enum ----------\n");

		for (int i = 0; i < CriptoMoedas.values().length; i++) {
			
			System.out.println("Criptomoeda = "      + CriptoMoedas.values()[i].name()     + "\n" +
							   "Posição = "          + CriptoMoedas.values()[i].ordinal()  + "\n" +
							   "Criador = "          + CriptoMoedas.values()[i].getNome()  + "\n" +
							   "Preço de Mercadp = " + CriptoMoedas.values()[i].getPreco() + "\n" +
							   "-----------------------------------------------------");
		}
		
		System.out.println("\n============= Exercitando Enum =============");
	}
}
