package br.com.entra21.java.avancado.aula9;

import java.util.Scanner;

import br.com.entra21.java.avancado.aula9.collections.ArrayList;
import br.com.entra21.java.avancado.aula9.collections.HashMap;
import br.com.entra21.java.avancado.aula9.collections.HashSet;
import br.com.entra21.java.avancado.aula9.collections.LinkedList;

public class Collections {
	
	public static void practicingCollecntions() {
		
		Scanner input = new Scanner(System.in);
		byte opcao;
				
		System.out.println("\nPraticando Collections\n");
		System.out.println("0) Voltar");
		System.out.println("1) ArrayList");
		System.out.println("2) LinkedList");
		System.out.println("3) HashSet");
		System.out.println("4) HashMap");
		System.out.println("--------------------------------------------------------");
		System.out.print(  "Escola uma opção válida:");

		opcao = input.nextByte();
		
		switch (opcao) {
				
		case 1:
		ArrayList.praticingArrayList();
		break;
		
		case 2:
		LinkedList.praticingLinkedList();
		break;
		
		case 3:
		HashSet.praticingHashSet();
		break;

		case 4:
		new HashMap().praticingHashMap();
		break;

		default:
		System.out.println("-Escolha um opção correta-");
		break;
		}
	}
}
