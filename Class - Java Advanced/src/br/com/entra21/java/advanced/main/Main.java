package br.com.entra21.java.advanced.main;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.entra21.java.advanced.class_01.enum_.LearningEnum;
import br.com.entra21.java.advanced.class_01.enum_.gameCharacter;
import br.com.entra21.java.advanced.class_02.collection.LearningCollection;
import br.com.entra21.java.advanced.class_03.menu.MenuClass03;

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
				LearningCollection.Aprender();
				break;
				
			case 4:
				MenuClass03.aprender();
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
		menu += "0 - Leave\n";
		menu += "1 - Wrapper\n";
		menu += "2 - ENUM\n";
		menu += "3 - Collection\n";
		menu += "4 - Collection";
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
	}
	
}

