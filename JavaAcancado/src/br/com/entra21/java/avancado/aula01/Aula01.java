package br.com.entra21.java.avancado.aula01;

import java.util.Scanner;

import br.com.entra21.java.avancado.aula01.enuns.Enuns;
import br.com.entra21.java.avancado.aula01.wrappers.Wrappers;

public class Aula01 {

	static Scanner entrada = new Scanner(System.in);
	 
	public static void aprender() {

		System.out.println("\n\tAssuntos da aula 01\n");

		byte opcao;
		
		do {
			System.out.println("Menu - AULA 01:\n");
			System.out.println("-1 - SAIR");
			System.out.println(" 0 - Voltar");
			System.out.println(" 1 - Classes Wrapper");
			System.out.println(" 2 - Enum Escrito Separado e Local"); 
			System.out.println("--------------------------------------------------------");
			System.out.print("Escolha uma opção para aprender: ");
			opcao = entrada.nextByte();

			switch (opcao) {
			
			case -1:
			System.exit(-1);
			break;
				
			case 0:
			System.out.println("Voltando...");
			break;
			
			case 1: 
			Wrappers.aprender();
			break;
				
			case 2: 
			Enuns.aprender();
			break;
			
			case 3: 
			break;
			
			default:
			System.out.println("Escolha uma opção válida para aprender sobre Wrapper - Enum");
			break;
			}
		} while (opcao != 0);
		System.out.println("Obrigado, volte sempre que quiser aprender mais sobre Wrapper - Enum");	
	}
}
