package br.com.entra21.java.avancado.aula9.collections;

import java.util.Scanner;

public class HashSet {

	public static java.util.HashSet<String> carrosDeLuxo = new java.util.HashSet<String>();
	static Scanner input = new Scanner(System.in);
	
	public static void praticingHashSet() {
		
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
		
		System.out.println("\n============= Exercitando HashSet =============\n");
		
		System.out.println("-HashSet Não tem Ordenação-");
		
		System.out.println("\n---------- Listando HashSet / Título ----------\n");
		
		System.out.println(carrosDeLuxo);
		
		System.out.println("\n---------- Listando HashSet / ForEach ----------\n");
		
		for (String carros : carrosDeLuxo) {
	
			System.out.println("Carros de Luxo = " + (carros));
		}
		
		System.out.println("\n---------- Listando HashSet / Lambda ----------\n");
		
		carrosDeLuxo.forEach(carros -> {
			System.out.println("Carros de Luxo = " + (carros) );
		});
		
		System.out.println("\n============= Exercitando HashSet =============");
		
	}

	private static void update() {
		
		String adicionando;
		
		System.out.println("\n============= Exercitando HashSet =============\n");
		
		System.out.println("---------- Update HashSet ----------\n");
		
		System.out.println("-Precisar Deletar para Atualizar-\n");
		
		System.out.println("-Listando Antes de Atualizar-\n");
		
		carrosDeLuxo.forEach(carro0 -> {
			System.out.println("Carros de Luxo = " + (carro0));
		});
		
		System.out.print("\nInforme um Carro de Luxo (Deletar 1°): ");
		adicionando = input.nextLine();
		adicionando = input.nextLine();
		
		if(carrosDeLuxo.contains(adicionando)) {
			carrosDeLuxo.remove(adicionando);
			System.out.print("\nInforme um Carro de Luxo (Update 2°): ");
			adicionando = input.nextLine();
			carrosDeLuxo.add(adicionando);
		} else {
			System.out.println("Não contém, porém, não desanime HashSet é difícil mesmo;");
		}
		
		System.out.println("\n-Listando Depois de Atualizar-\n");
		
		carrosDeLuxo.forEach(carro1 -> {
			System.out.println("Carros de Luxo = " + (carro1));
		});

		System.out.println("\n============= Exercitando HashSet =============");

	}

	private static void delete() {
		
		System.out.println("\n============= Exercitando HashSet =============");
		
		System.out.println("\n---------- Delete HashSet ----------\n");
		
		System.out.println("-Listando Antes do Delete-\n");
		
		carrosDeLuxo.forEach(carro -> {
			System.out.println("Carros de Luxo = " +carro);
		});
				
		System.out.println("\nDeletando Porsche 911:");
		carrosDeLuxo.remove("Porsche 911");
		
		System.out.println("\nDeletando Lamborghini Urus que nao existe:");
		carrosDeLuxo.remove("Lamborghini Urus");
		
		System.out.println("\n-Listando Depois do Delete-\n");
		
		carrosDeLuxo.forEach(carro1 -> {
			System.out.println("Carros de Luxo = " +carro1);
		});

		carrosDeLuxo.clear();

	}

}
