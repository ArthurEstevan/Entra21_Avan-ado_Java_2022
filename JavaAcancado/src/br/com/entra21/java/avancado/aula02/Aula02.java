package br.com.entra21.java.avancado.aula02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import br.com.entra21.java.avancado.aula03.anotacoes.Lembrete;

public class Aula02 {

	static Scanner entrada = new Scanner(System.in);

	@Lembrete(value = "Chamando de forma estatica esse meu SUBMENU")
	public static void aprender() {
		
		System.out.println("\nCom collections podemos agrupar dados sem limite definido");

		System.out.println("\n\tAssuntos da aula 02\n");
		
		byte opcao;
		
		do {
			System.out.println("Menu - AULA 02:\n");
			System.out.println("0 - Voltar");
			System.out.println("1 - ArrayList");
			System.out.println("2 - LinkedList");
			System.out.println("--------------------------------------------------------");
			System.out.print("Escolha uma opção para aprender: ");
			opcao = entrada.nextByte();

			switch (opcao) {
			
			case 0:
				System.out.println("Voltando...");
			break;

			case 1:
			aprenderArrayList();
			break;

			case 2:
			aprenderLinkedList();
			break;

			default:
			System.out.println("Escolha uma opção válida para aprender sobre Collections - LIST");
			break;
			}
		} while (opcao != 0);
		System.out.println("Obrigado, volte sempre que quiser aprender mais sobre Collections - LIST");
	}

	private static void aprenderArrayList() {

		
		System.out.println("\n---------------Criando ARRAYS ------------------");
		
		ArrayList<String> cidades = new ArrayList<>(Arrays.asList("João Pessoa", "Blumenau", "Florianopolis"));
		System.out.println("\nQuantas cidades ? " + cidades.size());

		ArrayList<String> cores = new ArrayList<>() {{add("Azul");add("Verde");}};
		System.out.println("Quantas cores ? " + cores.size());

		System.out.println("\n---------------Inserindo itens no ARRAY ------------------");

		ArrayList<String> cargos = new ArrayList<>();
		cargos.add("Programador Jr");
		cargos.add("Programador Pl");
		cargos.add("Programador Sr");
		System.out.println("\nQuantos cargos ? " + cargos.size());

		cores.add(0, "Branco"); // inserindo na primeira posição

		System.out.println("\n---------------Acessando itens no ARRAY ------------------");
		
		System.out.println("\nQual foi o meu primeiro cargo? " + cargos.get(0));
		System.out.println("Qual foi o meu ultimo cargo? " + cargos.get(cargos.size() - 1));

		System.out.println("\n---------------Percorrendo itens no ARRAY com iteração em array------------------");
		System.out.println("\nHistoricos de cargo");
		
		for (String cargo : cargos) {
			System.out.println("Cargo = " + cargo);
		}

		System.out.println("\n---------------Percorrendo itens no ARRAY com index em array------------------");
		
		System.out.println("\nDe forma inversa");
		for (int cargo = cargos.size() - 1; cargo >= 0; cargo--) {

			System.out.println("(" + cargo + ") cargo = " + cargos.get(cargo));
		}
		
		System.out.println("\n---------------Removendo itens no ARRAY ------------------");
		
		System.out.println("\nRemovendo quem estava no indice 0 ou seja " + cargos.get(0));
		cargos.remove(0);// removi o item no indice 0

		System.out.println("Removendo quem tem o cargo \"Programador sr\" pelo valor, sem saber que esta no indice " + cargos.indexOf("Programador sr"));
		cargos.remove("Programador sr");// remove o elemento que tiver esse valor, o indice será procurado

		System.out.println("\n---------------Percorrendo itens no ARRAY com forEach------------------\n");
		
		cargos.forEach(cargo -> {
			System.out.println("Cargo " + cargo);
		});

		System.out.println("\n---------------Exercise------------------\n");
		
		ArrayList<String> interesses = new ArrayList<>();
		interesses.add("dinheiro");
		interesses.add("dinheiro inicio do mes");
		interesses.add("dinheiro meio do mes");
		interesses.add("dinheiro finalzinho do mes");
		interesses.add("dinheiro 2x no final do mes");

		System.out.println("Tenho " + interesses.size() + " interesses e eles são:");
		
		for (String interesse : interesses) {
			System.out.println(interesse);
		}

		System.out.println("\nO primeiro interesse favorito é " + interesses.get(4));
		System.out.println("O segundo interesse favorito é " + interesses.get(3));

		System.out.println("\nposso abrir mao de " + interesses.get(1));
		interesses.remove(1);
		
		System.out.println("tambem posso abrir mao de " + interesses.get(1));
		interesses.remove(interesses.indexOf("dinheiro meio do mes"));

		System.out.println("\nMe resta então");
		
		for (String interesse : interesses) {
			System.out.println(interesse);
		}
	}

	private static void aprenderLinkedList() {
		
		System.out.println("\n---------------Inserindo itens no LINKED ------------------\n");
		
		LinkedList<String> nomes = new LinkedList<>();
		
		nomes.add("Rubem");
		nomes.add("Fulano");
		nomes.addFirst("Primeiro");
		nomes.addLast("Ultimo");
		nomes.add(2, "Inserido");

		System.out.println("Quantos nomes? " + nomes.size());

		System.out.println("\n---------------Acessando itens no LINKED ------------------\n");
		
		System.out.println("Quem é o primeiro? " + nomes.getFirst());
		System.out.println("Quem é o segundo? " + nomes.get(1));
		System.out.println("Quem é o ultimo? " + nomes.getLast());

		System.out.println("\n---------------Percorrendo itens no LINKED com iteração em array------------------\n");
		
		System.out.println("Ordem de inserção");
		
		for (String nome : nomes) {
			System.out.println("nome = " + nome);
		}

		System.out.println("\n---------------Percorrendo itens no LINKED com index em array------------------\n");
		
		System.out.println("De forma inversa");
		for (int nome = nomes.size() - 1; nome >= 0; nome--) {

			System.out.println("(" + nome + ") cargo = " + nomes.get(nome));

		}

		System.out.println("\n---------------Removendo itens no LINKED ------------------\n");
		
		System.out.println("Removendo quem estava no indice 0 ou seja " + nomes.getFirst());
		nomes.removeFirst();// removi o item no indice 0

		System.out.println("Removendo quem tem o nome \"Fulano\" pelo valor, sem saber que esta no indice " + nomes.indexOf("Fulano"));
		nomes.remove("Fulano");// remove o elemento que tiver esse valor, o indice será procurado

		System.out.println("\n---------------Percorrendo itens no LINKED com forEach------------------");
		
		nomes.forEach(nome -> {
			System.out.println("nome " + nome);
		});

	}

}
