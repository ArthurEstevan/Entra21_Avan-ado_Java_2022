package br.com.entra21.java.advanced.class_02.collection;

import java.util.Scanner;

	class LearningCollection {

	static Scanner input = new Scanner(System.in);
	
	public static void Aprender() {

		byte option;

		do {
			
			System.out.println(menu());
			option = input.nextByte();

		} while (option != 0);

		switch (option) {

		case 0:
			System.out.println("Good-Bye");
			break;

		case 1:

			break;

		case 2:

			break;

		default:
			System.out.println("choose correct option");
			break;
		}
	}

	public static String menu() {
		
		String menu = "";
		
		menu += "0 - Leave";
		menu += "1 - Learning Collection";
		menu += "2 - Learning Array-List";
		menu += "3 - Learning Linked-List";
		return null;

	}
	
	private static void learningArrayList() {
		
	}
	
	private static void learningLinkedList() {
		
	}


}
