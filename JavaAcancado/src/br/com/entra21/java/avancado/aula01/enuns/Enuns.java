package br.com.entra21.java.avancado.aula01.enuns;

import java.util.Scanner;

public class Enuns {

	static Scanner entrada = new Scanner(System.in);

	public enum EstacoesSimples {
		PRIMAVERA, VERAO, OUTONO, INVERNO,
	}

	static public enum Personagens {
		BARBARO("Muita resist�ncia fisica"), GUERREIRO("Muito dano fisico"), ARQUEIRO("Dano fisico a distancia"),
		MAGO("Ataque m�gico supremo a distancia");

		private final String valor;

		private Personagens(String valor) {
			this.valor = valor;
		}
		
		public String getValor() {
			return this.valor;
		}
	}

	static public enum VideoGames {
		XBOX_S("Irm�o menor do XBOX-S", 2800.50), XBOX_X("Console mais recente do XBOX", 4200.5),
		PS4("Vers�o boa para comprar agora", 3000.5), PS5("Mais caro console no momento", 6000.5);

		private final String nome;
		private final double preco;

		private VideoGames(String nome, double preco) {
			this.nome = nome;
			this.preco = preco;
		}
		
		public String getNome() {
			return nome;
		}
		
		public double getPreco() {
			return preco;
		}
	}

	public static void aprender() {

		System.out.println("\nCom enum podemos agrupar constantes");

		byte opcao;
		do {
			System.out.println("\nMenu - ENUM:\n");
			System.out.println("0 - Voltar");
			System.out.println("1 - Enum escrito local");
			System.out.println("2 - Enum escrito separado");
			System.out.println("3 - Percorrer ENUM");
			opcao = entrada.nextByte();

			switch (opcao) {
			case 0:
			System.out.println("Até a proxima!");
			break;
			
			case 1:
			aprenderDentroClasse();
			break;
			
			case 2:
			aprenderEnumIndividual();
			break;
			
			case 3:
			percorrerEnum();
			break;
			
			default:
			System.out.println("Escolha uma opção válida para aprender sobre ENUM");
			break;
			}

		} while (opcao != 0);
		  System.out.println("Obrigado, volse sempre que quiser aprender mais sobre ENUM");

	}

	private static void aprenderDentroClasse() {

		System.out.println("\n-----------------------------");
		System.out.println("ENUNS escritos nessa classe");
		System.out.println("-----------------------------");

		System.out.println("Estação PRIMAVERA=" + EstacoesSimples.PRIMAVERA);
		System.out.println("Estação VERAO=" + EstacoesSimples.VERAO);
		System.out.println("Estação OUTONO=" + EstacoesSimples.OUTONO);
		System.out.println("Estação INVERNO=" + EstacoesSimples.INVERNO);
		
		System.out.println("-----------------------------");
		System.out.println("Para ENUM simples o proprio valor será retornado");
		System.out.println("-----------------------------\n");

		System.out.println("-----------------------------");
		System.out.println("Para ENUM complexos os valores podem ser obtidos da seguinte forma");
		System.out.println("-----------------------------");

		System.out.println("Personagem BARBARO = " + Personagens.BARBARO + " retorna o titulo do ENUM");
		System.out.println("Personagem BARBARO = " + Personagens.BARBARO.name() + " retorna o titulo do ENUM");
		System.out.println("Personagem BARBARO = " + Personagens.BARBARO.ordinal() + " retorna a posição no ENUM");
		System.out.println("Personagem BARBARO = " + Personagens.BARBARO.getValor() + " retorna o atributo do ENUM");
		System.out.println("-------------------------");
		System.out.println("VideoGames XBOX_X = " + VideoGames.XBOX_X + " retorna o titulo do ENUM");
		System.out.println("VideoGames XBOX_X = " + VideoGames.XBOX_X.name() + " retorna o titulo do ENUM");
		System.out.println("VideoGames XBOX_X = " + VideoGames.XBOX_X.ordinal() + " retorna a posição no ENUM");
		System.out.println("VideoGames XBOX_X = " + VideoGames.XBOX_X.getNome() + " retorna o atributo nome do ENUM");
		System.out.println("VideoGames XBOX_X = " + VideoGames.XBOX_X.getPreco() + " retorna o atributo preco do ENUM");
		System.out.println("-----------------------------");

	}

	private static void aprenderEnumIndividual() {

		System.out.println("\n-------------------------");
		System.out.println("ENUNS escritos em um arquivo separado");
		System.out.println("-------------------------");

		System.out.println("Idiomas BRASIL=" + Idiomas.BRASIL);
		System.out.println("Idiomas EUA=" + Idiomas.EUA);
		System.out.println("Idiomas ALEMANHA=" + Idiomas.ALEMANHA);
		System.out.println("Idiomas ARGENTINA=" + Idiomas.ARGENTINA);
		
		System.out.println("-----------------------------");
		System.out.println("Para ENUM simples o proprio valor será retornado");
		System.out.println("-----------------------------\n");

		System.out.println("-----------------------------");
		System.out.println("Para ENUM complexos os valores podem ser obtidos da seguinte forma");
		System.out.println("-----------------------------");

		System.out.println("Esportes FUTEBOL = " + Esportes.BASQUETE + " retorna o titulo do ENUM");
		System.out.println("Esportes FUTEBOL = " + Esportes.FUTEBOL.name() + " retorna o titulo do ENUM");
		System.out.println("Esportes FUTEBOL = " + Esportes.FUTEBOL.ordinal() + " retorna a posição no ENUM");
		System.out.println("Esportes FUTEBOL = " + Esportes.FUTEBOL.getValor() + " retorna o atributo do ENUM");

		System.out.println("-----------------------------");

	}

	private static void percorrerEnum() {

		System.out.println("\n-------------------------");
		System.out.println("ENUNS percorrer como um vetor");
		System.out.println("-------------------------");

		for (int videoGame = 0; videoGame < VideoGames.values().length; videoGame++) {
			System.out.println("TITULO = " + videoGame + " - getName()= " + VideoGames.values()[videoGame].name() + " - atributo getNome()= " + VideoGames.values()[videoGame].getNome() + " - atributo getPreco()= " + VideoGames.values()[videoGame].getPreco());
		}
		System.out.println("-------------------------");

	}

}
