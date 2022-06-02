package br.com.entra21.java.advanced.class_02.collection;

import java.util.ArrayList;
import java.util.Scanner;

	public class LearningCollection {

	static Scanner input = new Scanner(System.in);

	public static void Aprender() {

		byte option;

		do {
			
			System.out.println(menu());
			option = input.nextByte();
			
			switch (option) {

			case 0:
				System.out.println("Good-Bye");
				break;

			case 1:
				learningArrayList();
				break;

			case 2:
				learningLinkedList();
				break;

			default:
				System.out.println("choose correct option");
				break;
			}
	
		}while(option!=0);
		System.out.println("come back when you wanna learn the list");
	}

	public static String menu() {

		String menu = "";

		menu += "0 - Leave\n";
		menu += "1 - Learning Array-List\n";
		menu += "2 - Learning Linked-List";
		return menu;

	}

	private static void learningArrayList() { 

		ArrayList<String> nomes = new ArrayList<String>(); //instanciando minhas classe ArrayList
		
		nomes.add("Arthur"); //criando meus m�todos de add
		nomes.add("Ariana");
		nomes.add("Oliota");
		nomes.add("Marcos");
		nomes.add(0, "Moreira"); 
		//isso fala que meu "Roberto" vai para primeira posi��o
		//(0 significa primeiro lugar da minha lista)
		
		System.out.println("Quantida de nomes na minha \"ArrayList\" = " +nomes.size()); 
		//em vez de usar "length" para ver o tamanhao na "ArrayList" uso size().
		
		// tipo do meu item e nome para minha "String", por final eu mapeo minhas "ArrayList"
		//(nome: "foreach"
		for (String item : nomes) {
			// esse for tem um f�cil uso
			//(problema � que eu n�o consigo ver meu contador)
			System.out.println("Listando Nomes = " +item); // esse for tem um f�cil uso
		}
		
		System.out.println();
		
		//for padr�o
		for (int nome = 0; nome < nomes.size(); nome++) {
			System.out.println("Listando Nomes = Posi��o " +nome+ " | Nome" +nomes.get(nome)); //usando get que � um m�todo da minha "ArrayList"
		}
		
		System.out.println();
		
		System.out.println("O primeiro nome " +nomes.get(0)); //mostra o primeiro nome da minha "ArrayList"
		System.out.println("O segundo nome " +nomes.get(2)); //mostra o primeiro nome da minha "ArrayList"
		
		nomes.set(2, "Henrique Atualizado"); //atualizando a segunda posi��o 
		
		System.out.println("O segundo nome agora �  " +nomes.get(2)); //mostra o segundo nome da minha "ArrayList"
		
		nomes.set(0, nomes.get(0).toUpperCase()); //posso definir meu primeiro em como letras ma�uscula
		System.out.println("O primeiro nome � " +nomes.get(0)); //mostra o primeiro nome da minha "ArrayList"
		System.out.println();
		
		System.out.println("Onde ser� que est� o primeiro? " +nomes.indexOf("MOREIRA"));
		System.out.println();
		System.out.println("Vou deletar quem estiver no indice " + nomes.get(2));
		nomes.remove(2); //removendo por indice
		
		nomes.remove(nomes.indexOf("Oliota")); //mas p�s remo��o fica dificil saber as posi��es ent�o uso a busca que � "indexOf"
		
		//Criei uma lista de interesses
		//adicione 5 itens
		//liste todos os itens
		//escolha dois itens favoritos
		//exlua um item por posi��o do indice
		//exclu um item por valor
		System.out.println();
		ArrayList<String> timesAula = new ArrayList<String>();
		
		timesAula.add("Verde");
		timesAula.add("Amarelo");
		timesAula.add("Azul");
		timesAula.add("Laranja");
		timesAula.add("Vermelho");
		
		for (String timesDaAula : timesAula) {
			
			System.out.println("Esses s�o os times formados : " +timesDaAula);
		}
		
		System.out.println("Meus times favoritos s�o: " +timesAula.get(0)+ " e " +timesAula.get(1));
		
		System.out.println("Felizmente aconteceu uma elimina��o e o time " +timesAula.get(2)+ " saiu.");
		timesAula.remove(2);
		
		for (String timesDaAula : timesAula) {
			
			System.out.println("Me restaram esses times : " +timesDaAula);
		}

		System.out.println("Aconteceu outra elimin��o repentina e o time Laranja saiu ");
		
		timesAula.remove("Laranaja");
		
		for (String timesDaAula : timesAula) {
			
			System.out.println("Me restaram esses times : " +timesDaAula);
		}

		
	}

	private static void learningLinkedList() {

	}

}
