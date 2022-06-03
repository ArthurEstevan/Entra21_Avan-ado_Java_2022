package br.com.entra21.java.advanced.class_01.enum_;

public class LearningEnum {

	public static void Aprender() {

		// usando meu "Enum" que foi criado dentro do package
		// apenas mostrando as caracteristicas e vida com concatenação
		System.out.println("Gosto desse tipo de personagem " + gameCharacter.ANAO);
		System.out.println("Geralmente a classe " + gameCharacter.ANAO + " tem HP = " + gameCharacter.ANAO.getLIFE());
		System.out.println("Caracteristica mais comum " + gameCharacter.ANAO.getDESCRICAO());
		System.out.println("Veja a descrição completa do " + gameCharacter.DRUIADA + " | Seu HP = "
				+ gameCharacter.DRUIADA.getLIFE() + " | Sua Caracterista = " + gameCharacter.DRUIADA.getDESCRICAO());
		System.out.println();

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
}
