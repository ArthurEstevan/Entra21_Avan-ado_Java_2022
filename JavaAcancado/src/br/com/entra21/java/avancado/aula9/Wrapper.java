package br.com.entra21.java.avancado.aula9;

import br.com.entra21.java.avancado.aula9.annotation.Informacao;

@Informacao (informacoes = Informacao.Informacoes.DONE, value = "Conclusão do Uso de Wrapper")
public class Wrapper {
	
	public static void practicingWrapper() {
		
		String auxiliar[] = new String[7];

		System.out.println("\n============== Praticando com Wrapper ==============\n");
		
		System.out.println("---------------- Número Inteiro ----------------");

		auxiliar[0] = "100";
		Byte byteWrapper = Byte.parseByte(auxiliar[0]);
		System.out.println(byteWrapper + " - Antes era uma String agora é um byte.");

		auxiliar[1] = "10000";
		Short shortWrapper = Short.parseShort(auxiliar[1]);
		System.out.println(shortWrapper + " - Antes era uma String agora é um short.");

		auxiliar[2] = "100000";
		Integer intWrapper = Integer.parseInt(auxiliar[1]);
		System.out.println(intWrapper + " - Antes era uma String agora é um int.");

		
		System.out.println("\n---------------- Número Reais ----------------");
		
		auxiliar[3] = "1000000";
		Long longWrapper = Long.parseLong(auxiliar[3]);
		System.out.println(longWrapper + " - Antes era uma String agora é um long.");
		
		auxiliar[4] = "10.5";
		Float floatWrapper = Float.parseFloat(auxiliar[1]);
		System.out.println(floatWrapper + " - Antes era uma String agora é um float.");

		auxiliar[5] = "100.5";
		Double doubleWrapper = Double.parseDouble(auxiliar[5]);
		System.out.println(doubleWrapper + " - Antes era uma String agora é um double.");
		

		System.out.println("\n---------------- Caracteres ----------------");
		
		char charWrapper = Character.valueOf('A');
		System.out.println(charWrapper + " - Antes era uma String agora é um char.");
		
		
		System.out.println("\n---------------- Lógicos ----------------");

		auxiliar[6] = "true";
		Boolean booleanWrapper = Boolean.parseBoolean(auxiliar[6]);
		System.out.println(booleanWrapper + " - Antes era uma String agora é um boolean");
		
		System.out.println("\n============== Praticando com Wrapper ==============");
	}
}
