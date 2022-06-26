package br.com.entra21.java.avancado.aula01.wrappers;

public class Wrappers {

	public static void aprender() {
		
		System.out.println("\nAs classes Wrapper são classes que possuem a implementação necessária para realizar casts primitivos de forma simples sem o uso do (cast_manual)");

		
		System.out.println("\n--------- Números INTEIROS ---------------------------");
		
		byte variavelByte = Byte.parseByte("127");
		System.out.println("Classe Byte com método parseByte recebe uma string como argumento e retorna um valor byte " + variavelByte); 

		short variavelShort = Short.parseShort("12000");
		System.out.println("Classe Short com método parseShort recebe uma string como argumento e retorna um valor short " + variavelShort);

		int variavelInt = Integer.parseInt("300000");
		System.out.println("Classe Integer com método parseInt recebe uma string como argumento e retorna um valor int " + variavelInt);

		
		System.out.println("\n--------- Números REAIS ---------------------------");
		
		long variavelLong = Long.parseLong("400000000");
		System.out.println("Classe Long com método parseLong recebe uma string como argumento e retorna um valor long " + variavelLong);

		float variavelFloat = Float.parseFloat("100.123");
		System.out.println("Classe Float com método parseFloat recebe uma string como argumento e retorna um valor float " + variavelFloat); 

		double variavelDouble = Double.parseDouble("123456.4321");
		System.out.println("Classe Double com método parseDouble recebe uma string como argumento e retorna um valor double " + variavelDouble);


		System.out.println("\n--------- Caracter ---------------------------");
		char variavelChar = Character.valueOf('c');
		System.out.println("Classe Character com método valueOf recebe um char como argumento e retorna um valor char " + variavelChar);


		System.out.println("\n--------- Lógico ---------------------------");
		
		System.out.println("Utilizando vetor para mostrar mais exemplos:");
		
		boolean vetorPossivilidadesBooleans[] = {

				Boolean.parseBoolean("true"), // True
				Boolean.parseBoolean("TRUE"), // True
				Boolean.parseBoolean("tRuE"), // True
				Boolean.parseBoolean("tru"),  // False
				Boolean.parseBoolean("1"),    // False
				Boolean.valueOf("TRUE"),      // True
				Boolean.valueOf("true"),      // True
				Boolean.TRUE                  // True
		};
		
		for (int logico = 0; logico < vetorPossivilidadesBooleans.length; logico++) {
			System.out.println("Classe Boolean possui vários métodos que aceitam Strings ou ENUM e retorna valores booleanos, verifique com o debug o motivo do valor = " + vetorPossivilidadesBooleans[logico]);
		}
		System.out.println();
	}

}
