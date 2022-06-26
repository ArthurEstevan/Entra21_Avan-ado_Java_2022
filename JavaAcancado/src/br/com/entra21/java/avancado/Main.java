package br.com.entra21.java.avancado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import br.com.entra21.java.avancado.aula01.Aula01;
import br.com.entra21.java.avancado.aula02.Aula02;
import br.com.entra21.java.avancado.aula03.Aula03;
import br.com.entra21.java.avancado.aula04.Aula04;
import br.com.entra21.java.avancado.aula05.Aula05;
import br.com.entra21.java.avancado.aula06.Aula06;
import br.com.entra21.java.avancado.aula07.Aula07;
import br.com.entra21.java.avancado.aula08.Aula08;
import br.com.entra21.java.avancado.aula9.Aula09;

public class Main {

	static Scanner entrada = new Scanner(System.in);
	final static int ZERO = 0;

	public static void main(String[] args) {

		byte opcao;
		do {
			System.out.println(montarMenu());
			System.out.print("Escolha uma opção para aprender: ");
			opcao = entrada.nextByte();

			switch (opcao) {

			case ZERO:
			System.out.println("Até a proxima!");
			break;

			case 1:
			Aula01.aprender();
			break;

			case 2:
			Aula02.aprender();
			break;

			case 3:
			Aula03.aprender();
			break;

			case 4:
			new Aula04("Aula04 - Collections - SET - HashSet", new ArrayList<>(Arrays.asList("Definir","CRUD"))).aprender();
			break;

			case 5:
			new Aula05("Aula05 - Collections - MAP - HashMap",new ArrayList<>(Arrays.asList("Definir", "Create", "Read", "Update", "Delete", "Exemplo prático"))).aprender();
			break;

			case 6:
			new Aula06("Aula06 - Generics - HashMap(exercicio)",new ArrayList<>(Arrays.asList("Criar Interface", "Interface"))).aprender();
			break;

			case 7:
			new Aula07("Aula07 - Exceções e tratamento de erros",new ArrayList<>(Arrays.asList("Tratamento de erros", "Obter informações do erro","Criar e utilizar nossas exceções", "finally é importante?", "Exemplo prático	"))).aprender();
			break;

			case 8:
			new Aula08("Aula08 - Lambda",new ArrayList<>(Arrays.asList("Listar", "Filtrar", "Estatisticas", "Ordenação"))).aprender();
			break;

			case 9:
			new Aula09("Aula09 - Practice Each Subject", new ArrayList<String>(Arrays.asList("Wrapper", "ENUM", "Collections"))).aprender();
			break;

			default:
			System.out.println("Escolha uma opção válida para aprender um assunto avançado sobre JAVA");
			break;
			}

		} while (opcao != ZERO);
		System.out.println("Obrigado, volse sempre que quiser aprender mais sobre JAVA AVANÇADO");

	}

	private static String montarMenu() {
		String menu = "\nAula sobre JAVA AVANÇADO:";
		menu += "\n  0 - Sair";
		menu += "\n  1 - Aula 01 - ENUM e Classes Wrapper";
		menu += "\n  2 - Aula 02 - Collections - LIST";
		menu += "\n  3 - Aula 03 - Annotations e Datas";
		menu += "\n  4 - Aula 04 - Collections - SET";
		menu += "\n  5 - Aula 05 - Collections - MAP";
		menu += "\n  6 - Aula 06 - Generics";
		menu += "\n  7 - Aula 07 - Exceções e tratamento de erros";
		menu += "\n  8 - Aula 08 - Funçoes Lambda";
		menu += "\n  9 - Aula 09 - Exercitando os Conteúdos";
		menu += "\n--------------------------------------------------------";
		return menu;
	}
}
