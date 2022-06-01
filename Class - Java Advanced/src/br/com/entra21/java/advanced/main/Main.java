package br.com.entra21.java.advanced.main;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.entra21.java.advanced.class_01.enum_.LearningEnum;
import br.com.entra21.java.advanced.class_01.enum_.gameCharacter;

public class Main {

	static Scanner input = new Scanner(System.in);

	//cricação de um enum chamado "DiasSemana" no Main, definindo apenas nome das constantes.
	//(constantes sem valor)
	public enum DiasSemana {
		SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO 
	}

	public static void main(String[] args) {

		byte option;

		do {

			System.out.println(exibirMenu());
			option = input.nextByte();

			switch (option) {
			case 0:

				break;

			case 1:
				learningWrapper();
				break;

			case 2:
				learningENUM();
				break;
				
			case 3:
				learningCollection();
				break;


			default:
				System.out.println("choose correct option");
				break;
			}

		} while (option != 0);

	}

	//--------MENU--------//
	public static String exibirMenu() {

		String menu = "";
		menu += "Learning Advanced Concept in Java\n";
		menu += "\t0 - Leave\n";
		menu += "\t1 - Wrapper\n";
		menu += "\t2 - ENUM\n";
		menu += "Choose Option";

		return menu;

	}

	//--------LEARNING WRAPPER--------//
	public static void learningWrapper() {

		// converter valores para váriaveis primitivas

		// caracteres
		char letra = Character.valueOf('A');

		// para operações booleanas
		boolean verdade = Boolean.parseBoolean("TRUE");
		boolean verdade1 = Boolean.parseBoolean("tRue");
		boolean verdade2 = Boolean.parseBoolean("true");
		boolean falso = Boolean.parseBoolean("t");

		// números inteiros
		byte inteiroUm = Byte.parseByte("127");

		short inteiroDois = Short.parseShort("128");

		int inteiroTres = Integer.parseInt("10000");

		long inteiroQuatro = Long.parseLong("100000");

		// números fracionados
		float fracionadoUm = Float.parseFloat("10.5");

		double fracionadoDois = Double.parseDouble("20.5");

	}

	//--------LEARNING ENUM--------//
	public static void learningENUM() {
		
		//usando meu "Enum" que foi instanciado dentro da main
		System.out.println("Testando Enum: " + DiasSemana.TERCA);

		System.out.println(DiasSemana.DOMINGO == DiasSemana.SEGUNDA ? "sim" : "não");

		for (int dias = 0; dias < DiasSemana.values().length; dias++) {
			System.out.println((dias + 1) + " - " + DiasSemana.values()[dias]);
		}
		
		//---------------------------------------------------------------------------------//

		//usando meu "Enum" que foi criado dentro do package
		//apenas mostrando as caracteristicas e vida com concatenação
		System.out.println("Gosto desse tipo de personagem " + gameCharacter.ANAO);
		System.out.println("Geralmente a classe " + gameCharacter.ANAO + " tem HP = " + gameCharacter.ANAO.getLIFE());
		System.out.println("Caracteristica mais comum " + gameCharacter.ANAO.getDESCRICAO());
		System.out.println("Veja a descrição completa do " + gameCharacter.DRUIADA + " | Seu HP = "+ gameCharacter.DRUIADA.getLIFE() + " | Sua Caracterista = " + gameCharacter.DRUIADA.getDESCRICAO());
		System.out.println();
		
		//---------------------------------------------------------------------------------//
		
		//usando meu "Enum" que foi criado dentro do package
		//mostrando como percorer meu "Enum" dentro de um for
		//(percorrendo as constantes, LIFE E DESCRICAO
		for (int personagens = 0; personagens < gameCharacter.values().length; personagens++) {
			System.out.println((personagens + 1) + " - " + gameCharacter.values()[personagens] );
			System.out.println(" Veja a descrição completa do " + gameCharacter.values()[personagens]);
			System.out.println(" | Seu HP = "+ gameCharacter.values()[personagens].getLIFE() );
			System.out.println(" | Sua Caracterista = " + gameCharacter.values()[personagens].getDESCRICAO());
			System.out.println();
		}
		
		//---------------------------------------------------------------------------------//
		
		//usando meu "Enum" que foi criado dentro do package
		//for de iteração vai de um por um, usando next.
		for (gameCharacter variavel: gameCharacter.values()) { 
			System.out.println(variavel.ordinal()); //ordinal mostra posição que está no looping
		}
		
		//mostra posição dentro do meu "Enum"
		System.out.println("O druida está " +gameCharacter.DRUIADA.ordinal());
	}

	//--------LEARNING COLLECTION--------//
	public static void learningCollection() {
		
		
	}
}
