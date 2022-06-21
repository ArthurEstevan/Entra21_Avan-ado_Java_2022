package br.com.entra21.java.avancado.aula9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Scanner;

import br.com.entra21.java.avancado.Aula;

public class Aula09 extends Aula {

	public enum DiasDaSemana {
		SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO,
	}

	public Aula09(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);
	}

	@Override
	
	public byte capturarOpcao() {

		byte opcao = super.capturarOpcao();

		switch (opcao) {

		case 1:
		classesWrapper();
		break;

		case 2:
		exerciseENUM();
		break;

		case 3:
		exerciseCollections();
		break;

		case 4:
		exerciseHashSet();
		break;
		
		case 5:
		exerciseHasMap();
		break;

		case 6:

		break;

		}

		return opcao;
	}


	private void exerciseENUM() {

		System.out.println("\nENUM dentro da Classe");
		System.out.println("\nPrimeiro dia da semana é " + DiasDaSemana.DOMINGO);
		System.out.println("Segundo dia da semana é " + DiasDaSemana.SEGUNDA);
		System.out.println("Terceiro dia da semana é " + DiasDaSemana.TERCA);
		System.out.println("Quarto dia da semana é " + DiasDaSemana.QUARTA);
		System.out.println("Quinto dia da semana é " + DiasDaSemana.QUINTA);
		System.out.println("Sexto dia da semana é " + DiasDaSemana.SEXTA);
		System.out.println("Sétimo dia da semana é " + DiasDaSemana.SABADO + "\n");

		System.out.println(
				"\nNão preciso importar um ENUM posso utilizar ele apenas escrevendo corretamento sua sintaxe\n");

		System.out.println("BitCoin (mostrar o nome) = " + CriptoMoedas.BITCOIN.name());
		System.out.println("BitCoin (mostrar a posição) = " + CriptoMoedas.BITCOIN.ordinal());
		System.out.println("BitCoin (mostrar atributo defenido) = " + CriptoMoedas.BITCOIN.getNome());
		System.out.println("BitCoin (mostrar atributo defenido) = " + CriptoMoedas.BITCOIN.getPreco() + "\n");

		System.out.println("\nPercorrendo ENUM");

		for (int i = 0; i < CriptoMoedas.values().length; i++) {
			System.out.println("Criptomoeda = " + CriptoMoedas.values()[i].name() + " Posição = " + CriptoMoedas.values()[i].ordinal() + " Criador = " + CriptoMoedas.values()[i].getNome() + " Preço de Mercadp = " + CriptoMoedas.values()[i].getPreco());
		}
		System.out.println();

	}

	public static void classesWrapper() {

		String auxiliar[] = new String[7];

		System.out.println("");

		auxiliar[0] = "100";
		Byte byteWrapper = Byte.parseByte(auxiliar[0]);
		System.out.println(byteWrapper + " - Antes era uma String agora é um byte.");

		auxiliar[1] = "10000";
		Short shortWrapper = Short.parseShort(auxiliar[1]);
		System.out.println(shortWrapper + " - Antes era uma String agora é um short.");

		auxiliar[2] = "100000";
		Integer intWrapper = Integer.parseInt(auxiliar[1]);
		System.out.println(intWrapper + " - Antes era uma String agora é um int.");

		auxiliar[3] = "1000000";
		Long longWrapper = Long.parseLong(auxiliar[3]);
		System.out.println(longWrapper + " - Antes era uma String agora é um long.");

		auxiliar[4] = "10.5";
		Float floatWrapper = Float.parseFloat(auxiliar[1]);
		System.out.println(floatWrapper + " - Antes era uma String agora é um float.");

		auxiliar[5] = "100.5";
		Double doubleWrapper = Double.parseDouble(auxiliar[5]);
		System.out.println(doubleWrapper + " - Antes era uma String agora é um double.");

		char charWrapper = Character.valueOf('A');
		System.out.println(charWrapper + " - Antes era uma String agora é um char.");

		auxiliar[6] = "true";
		Boolean booleanWrapper = Boolean.parseBoolean(auxiliar[6]);
		System.out.println(booleanWrapper + " - Antes era uma String agora é um boolean\n");

	}

	public static void exerciseCollections() {
		
		Scanner input = new Scanner(System.in);
		byte opcao;
		
		System.out.println("Escolha qual Exercício quer Ver:");
		System.out.println("1) ArrayList");
		System.out.println("2) LinkedList");
		System.out.print("Chosse Option: ");
		opcao = input.nextByte();
		
		switch (opcao) {
		
		case 0:
		break;
		
		case 1:
		collections();
		break;
		
		case 2:
		linkedList();
		break;

		default:
		System.out.println("Escolha uma Alternativa Correta");
		break;
		}
		
	}
	
	public static void collections() {
		
		// Criando ArrayList
		
		ArrayList<String> carrosDeLuxo = new ArrayList<>();
		
		// Adicionando Manualmente
		
		carrosDeLuxo.add("Porsche Panamera");
		carrosDeLuxo.add("Lamborghini Aventador");
		carrosDeLuxo.add("Porsche 911");
		carrosDeLuxo.add("Audi R8");
		carrosDeLuxo.add("Bugatti Veyron Grand Sport");
		
		// Tamanho da Minha ArrayList
		
		carrosDeLuxo.size();
		
		// Adicionando em Posições Específica
		
		carrosDeLuxo.add(5, "Ferrari 458 Italia");
		
		// Buscando Item
		
		carrosDeLuxo.get(0);
		System.out.println(carrosDeLuxo.get(0));
		
		// Buscando Ultima Posição
		
		carrosDeLuxo.get(carrosDeLuxo.size()-1);
		System.out.println(carrosDeLuxo.get(carrosDeLuxo.size()-1));
		
		// Removendo Pelo Valor e Index
		carrosDeLuxo.remove("Ferrari 458 Italia");
		carrosDeLuxo.remove(0);
		
		// Adicionando na Criação
		
		ArrayList<String> atores = new ArrayList<>(Arrays.asList("Will Smith", "Brad Pitt", "Adam Sandler", "Leonardo DiCaprio"));
		
		// Lendo com ForEach
		
		atores.forEach(ator -> {
			System.out.println("nomes: " +ator);
		});
		
	}

	public static void linkedList() {
		
		// Criando LinkedList
		
		LinkedList<String> carrosDeLuxo = new LinkedList<>();
		
		// Adicionando Manualmente
		
		carrosDeLuxo.add("Porsche Panamera");
		carrosDeLuxo.add("Lamborghini Aventador");
		carrosDeLuxo.add("Porsche 911");
		carrosDeLuxo.add("Audi R8");
		carrosDeLuxo.add("Bugatti Veyron Grand Sport");
		
		// Tamanho da Minha LinkedList
		
		carrosDeLuxo.size();
		
		// Adicionando em Posições Específica
		
		carrosDeLuxo.add(5, "Ferrari 458 Italia");
		
		// Buscando Item
		
		carrosDeLuxo.getFirst(); // Pega Primeira Posição
		System.out.println(carrosDeLuxo.getFirst());
		
		// Buscando Ultima Posição
		
		carrosDeLuxo.getLast();
		System.out.println(carrosDeLuxo.getLast());
		
		// Removendo Pelo Valor e Index
		carrosDeLuxo.indexOf("Ferrari 458 Italia"); //Captura o Index
		carrosDeLuxo.remove("Ferrari 458 Italia");
				
		// Adicionando na Criação
		
		LinkedList<String> atores = new LinkedList<>(Arrays.asList("Will Smith", "Brad Pitt", "Adam Sandler", "Leonardo DiCaprio"));
		
		// Lendo com ForEach
		
		atores.forEach(ator -> {
			System.out.println("nomes: " +ator);
		});
		
		// Lendo com For
		
		for (int i = atores.size()-1; i >= 0; i--) {
			System.out.println("(" +i+ ") ator = " +atores.get(i));
		}

	}

	public void exerciseHashSet() {
		
		// Criando minha HashSet
		
		HashSet<String> idiomas = new HashSet<>();
		
		// Vendo se está vazia
		
		idiomas.isEmpty();
		
		// Tamanho
		
		idiomas.size();
		
		C(idiomas); //CREAT
		R(idiomas); //READ
		U(idiomas); //UPDATE
		D(idiomas); //DELETE
	}

	public void D(HashSet<String> idiomas) {
		
		//Removendo
		System.out.println(idiomas);
		idiomas.remove("Brazileirismo");
		idiomas.add("Português");
		System.out.println(idiomas);
		
		// Limpando minha Lista
		
		idiomas.clear();
		System.out.println(idiomas);
		
	}

	public void U(HashSet<String> idiomas) {
		
		System.out.println(idiomas);
		
		if(idiomas.contains("Português")) {
			idiomas.remove("Português");
			idiomas.add("Brazileirismo");
		}
		
		System.out.println(idiomas);
		
	}

	public void R(HashSet<String> idiomas) {
		
		// Lendo todos os Itens que contém na minha lista
		
		System.out.println(idiomas);
		
		// Lendo com ForEache
		
		idiomas.forEach(idioma ->{
			System.out.println(idioma);
		});		
		
		// Vendo se tem o item
		
		idiomas.contains("Português");
	}

	public void C(HashSet<String> idiomas) {
		
		// Adiciona Manualmente 
		
		idiomas.add("Português");
		idiomas.add("Inglês");
		
		// Adiciona Automático
		
		idiomas.addAll(new ArrayList<>(Arrays.asList("Espanhol", "Japonês", "Chinês")));
	}

	public void exerciseHasMap() {
		
		HashMap<String, HashMap<String, Double>> marca = new HashMap<>();
		
		C(marca); // Creat
		R(marca); // Read
		U(marca); // Update
		D(marca); // Delete
		
	}

	private void D(HashMap<String, HashMap<String, Double>> marca) {


		marca.remove("Puma");

		
	}

	private void U(HashMap<String, HashMap<String, Double>> marca) {
		
		HashMap<String, Double> tenis = new HashMap<>();
		
		tenis.put("Tênis Puma Runner V2 Sn Bdp", 194.39);
		
		marca.put("Nike",tenis);
		
	}

	private void R(HashMap<String, HashMap<String, Double>> marca) {
		
		for (String marcas : marca.keySet()) {
			System.out.println("Marcas = " +marcas);
		}
		
		System.out.println();
		
			
			for (Entry<String, HashMap<String, Double>> tenis : marca.entrySet()) {
				System.out.println("Modelos: " +tenis.getValue().keySet());
				System.out.println("Preços: " +tenis.getValue().values());
			}
		
	}

	private void C(HashMap<String, HashMap<String, Double>> marca) {
		
		HashMap<String, Double> nike = new HashMap<>();
		
		nike.put("NIKE HYPER ADAPT 1.0 BRZ", 3499.90);
		nike.put("NIKE ZOOM VAPORFLY", 1399.90);
		nike.put("NIKE AIR VAPORMAX ’97", 1299.90);
		
		marca.put("Nike", nike);
		
		HashMap<String, Double> adidas = new HashMap<>();
		
		adidas.put("SUPERSTAR", 622.99);
		adidas.put("STAN SMITH", 349.99);
		adidas.put("ULTRABOOST", 1199.99);

		marca.put("Adidas", adidas);
		
		System.out.println(marca);
		
	}

	
}

