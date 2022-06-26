package br.com.entra21.java.avancado.aula9.collections;

import java.util.Scanner;

public class LinkedList {
	
	public static java.util.LinkedList<String> carrosDeLuxo = new java.util.LinkedList<String>();
	static Scanner input = new Scanner(System.in);
	
	public static void praticingLinkedList() {
		
		byte opcao;
			
			if(carrosDeLuxo.isEmpty()) {
			carrosDeLuxo.add("Porsche Panamera");
			carrosDeLuxo.add("Lamborghini Aventador");
			carrosDeLuxo.add("Porsche 911");
			carrosDeLuxo.add("Audi R8");
			carrosDeLuxo.add("Bugatti Veyron Grand Sport");
			}

		do {
			
			System.out.println("\nMenu ArrayList\n");
			System.out.println("0) Voltar");
			System.out.println("1) Listar");
			System.out.println("2) Update");
			System.out.println("3) Delete");
			System.out.println("--------------------------------------------------------");
			System.out.print(  "Escola uma opção válida:");
			opcao = input.nextByte();
			
			switch (opcao) {
			
			case 1:
			listar();
			break;
			
			case 2:
			update();
			break;

			case 3:
			delete();
			break;
			
			}

		}while(opcao != 0);
		
	}
	
	public static void listar() {
		
		System.out.println("\n============= Exercitando LinkedList =============\n");
		
		System.out.println("---------- Listando Posiçãos  ----------\n");
		
		System.out.println("Posição n°1 do Ranking: " + carrosDeLuxo.getFirst());
		System.out.println("Posição n°Ultimo do Raking: " + carrosDeLuxo.getLast());
		
		System.out.println("\n---------- Listando LinkedList / Index ----------\n");
		
		for(int contador = 0; contador < carrosDeLuxo.size(); contador++ ) {
			
			System.out.println(" "+ (contador) + " = " +carrosDeLuxo.get(contador));
		}
		
		System.out.println("\n---------- Listando LinkedList / ForEach ----------\n");
		
		for (String carros : carrosDeLuxo) {
			
			System.out.println("Carros de Luxo = " + (carros));
			
		}
		
		System.out.println("\n---------- Listando LinkedList / Lambda ----------\n");
		
		carrosDeLuxo.forEach(carros -> {
			System.out.println("Carros de Luxo = " + (carros) );
		});
		
		System.out.println("\n---------- Listando LinkedList / Título ----------\n");
		
		System.out.println(carrosDeLuxo);
	
		System.out.println("\n============= Exercitando LinkedList =============");
		
	}

	private static void update() {
		
		String adicionando;
		
		System.out.println("\n============= Exercitando LinkedList =============\n");
		
		System.out.println("\n---------- Update LinkedList ----------\n");
		
		System.out.println("-Listando Antes de Atualizar-\n");
		
		carrosDeLuxo.forEach(carro0 -> {
			System.out.println("Carros de Luxo = " + (carro0));
		});
		
		System.out.print("\nInforme um Carro de Luxo: ");
		adicionando = input.nextLine();
		adicionando = input.nextLine();
		
		carrosDeLuxo.add(adicionando);
		
		System.out.println("\n---------- LinkedList insere por ordem de add ----------");
		
		System.out.println("\n-Listando Depois de Atualizar-\n");
			
		carrosDeLuxo.forEach(carro1 -> {
			System.out.println("Carros de Luxo = " + (carro1));
		});
		
		System.out.println("\n============= Exercitando LinkedList =============");

	}

	private static void delete() {
		
		String informacao[] = new String[2];
		
		System.out.println("\n============= Exercitando LinkedList =============\n");
		
		System.out.println("\n---------- Delete LinkedList ----------\n");
		
		System.out.println("-Listando Antes do Delete-\n");
		
		carrosDeLuxo.forEach(carro0 -> {
			System.out.println("Carros de Luxo = " + (carro0));
		});
		
		System.out.println("\n---------- Delete LinkedList / Nome ----------\n");
		
		System.out.print("Informe qual Carro quer Deletar: ");
		informacao[0] = input.nextLine();
		informacao[0] = input.nextLine();
		
		carrosDeLuxo.remove(informacao[0]);
		
		System.out.println("\n-Listando Depois do Delete-\n");
		
		carrosDeLuxo.forEach(carro1 -> {
			System.out.println("Carros de Luxo = " + (carro1));
		});

		System.out.println("\n---------- Delete LinkedList / Index ----------\n");
		
		for(int contador = (carrosDeLuxo.size() - 1); contador >= 0; contador--) {
			System.out.println("" + (contador) + " = " + carrosDeLuxo.get(contador));
		}
		
		System.out.print("\nInforme qual Carro quer Deletar (Index): ");
		informacao[1] = input.nextLine();
		
		Integer integer = Integer.parseInt(informacao[1]);
		
		carrosDeLuxo.remove(carrosDeLuxo.get(integer));

		System.out.println("\n-Listando Depois do Delete-\n");
		
		carrosDeLuxo.forEach(carro3 -> {
			System.out.println("Carros de Luxo = " + (carro3));
		});
		
		System.out.println("\n---------- Delete LinkedList First / Last  ----------\n");
		
		System.out.println("-Com LinkedList é mais Facíl Deletar n°1 | n°Ultimo-\n");
		
		System.out.println("-Listando Antes do Delete-\n");
		
		carrosDeLuxo.forEach(carro4 -> {
			System.out.println("Carros de Luxo = " + (carro4));
		});
		
		System.out.println("\n-Listando Depois do Delete-\n");

		carrosDeLuxo.remove(carrosDeLuxo.getFirst());
		carrosDeLuxo.remove(carrosDeLuxo.getLast());
		
		carrosDeLuxo.forEach(carro5 -> {
			System.out.println("Carros de Luxo = " + (carro5));
		});

		System.out.println("\n============= Exercitando LinkedList =============");

	}


}
