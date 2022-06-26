package br.com.entra21.java.avancado.aula08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import br.com.entra21.java.avancado.Aula;
import br.com.entra21.java.avancado.Pessoa;

public class Aula08 extends Aula {
	
	Pessoa pessoa;
	public static HashMap<String, Pessoa> pessoas = new HashMap<>();

	public Aula08(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);

	}

	@Override
	public byte capturarOpcao() {

		byte opcao = super.capturarOpcao();
		
		switch (opcao) {
		
		case 1:
		aprenderListar();
		break;
		
		case 2:
		aprenderFiltrar();
		break;
		
		case 3:
		aprenderEstatisticas();
		break;
		
		case 4:
		aprenderOrdenacao();
		break;
		}
		return opcao;
	}

	private void aprenderListar() {

		ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

		System.out.println("\n----- Listando de forma muito resumida -----\n");
		lista.forEach(System.out::println);

		System.out.println("\n----- Listando normal -----\n");
		
		for (Integer numero : lista) {
			System.out.println(numero);
		}

		System.out.println("\n------- Listando com Lambda ( uma unica ação não exige escopo) -------\n");
		
		System.out.println("itemDoLoop -> ação unica que usa o itemDoLoop\n");
		lista.forEach(numero -> System.out.println(numero));

		System.out.println("\n------- Listando com Lambda---(mais de uma ação exige escopo) -------\n");
		
		System.out.println("itemDoLoop -> { ");
		System.out.println(" primeira ação");
		System.out.println(" segunda ação");
		System.out.println("}\n");
		
		lista.forEach(numero -> {
			if (numero % 2 == 0) {
				System.out.println(numero + " ° par");
			} else {
				System.out.println(numero + " ° impar");
			}
		});
	}

	private void aprenderFiltrar() {
		
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		
		pessoas.add(new Pessoa("Juninho", (byte) 17));
		pessoas.add(new Pessoa("Fulano", (byte) 18));
		pessoas.add(new Pessoa("Zé", (byte) 12));
		pessoas.add(new Pessoa("Maria", (byte) 31));

		System.out.println("\n-----------------------------------------");
		
		System.out.println("Pessoas maiores de idade: ");
		
		List<Pessoa> pessoasMaiores = pessoas.stream().filter(p -> p.getIdade() >= 18).collect(Collectors.toList());

		pessoasMaiores.forEach(pessoa -> {
			System.out.println("Pessoa de maior: " + pessoa.getNome() + " - " + pessoa.getIdade());
		});

		System.out.println("-----------------------------------------");
		
		System.out.println("Pessoas cuja idade é par: ");
		
		List<Pessoa> pessoasComIdadePar = pessoas.stream().filter(p -> p.getIdade() % 2 == 0).collect(Collectors.toList());
		
		pessoasComIdadePar.forEach(pessoa -> {
			System.out.println("Pessoa  com idade par: " + pessoa.getNome() + " - " + pessoa.getIdade());
		});

		System.out.println("-----------------------------------------");
		
		System.out.println("Pessoas que terminam com a letra o: ");
		
		List<Pessoa> pessoasFinalLetraO = pessoas.stream().filter(p -> p.getNome().endsWith("o")).collect(Collectors.toList());
		
		pessoasFinalLetraO.forEach(pessoa -> {
			System.out.println("Pessoa que termina com a letra o: " + pessoa.getNome() + " - " + pessoa.getIdade());
		});

		System.out.println("-----------------------------------------");
		
		System.out.println("Pessoas que terminam com a letra o e é maior de idade: ");
		
		List<Pessoa> pessoasFinalLetraOMaior = pessoas.stream().filter(p -> p.getNome().endsWith("o") && p.getIdade() >= 18).collect(Collectors.toList());
		
		pessoasFinalLetraOMaior.forEach(pessoa -> {
			System.out.println("Pessoa que termina com a letra o: " + pessoa.getNome() + " - " + pessoa.getIdade());
		});

		System.out.println("-----------------------------------------");
		
		System.out.println("Pessoas que terminam com a letra o e é maior de idade: filtradas e listadas na mesma ação: ");
		
		pessoas.stream().filter(p -> p.getIdade() >= 18).filter(p -> p.getNome().endsWith("o")).forEach(pessoa -> {
			System.out.println("Pessoa de maior: " + pessoa.getNome() + " - " + pessoa.getIdade());
		});

	}

	private void aprenderEstatisticas() {
		
		System.out.println("\nImprime todos os elementos da lista\n");

		ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		
		System.out.println("\n----- Listando normal -----\n");
		
		for (Integer numero : lista) {
			System.out.println(numero);
		}

		IntSummaryStatistics stats = lista.stream().mapToInt((x) -> x).summaryStatistics();

		System.out.println("Maior:" + stats.getMax());
		System.out.println("Menor:" + stats.getMin());
		System.out.println("Soma:" + stats.getSum());
		System.out.println("Média:" + stats.getAverage());
		System.out.println("Contagem" + stats.getCount());

	}

	private void aprenderOrdenacao() {
		
		List<String> nomes = Arrays.asList("João", "José", "Maria", "Adam");
		
		System.out.println("\n-------- Listando nomes ordem de criação --------\n");
		nomes.forEach(System.out::println);

		System.out.println("\n--------Listando nomes em ordem alfabetica------------\n");
		nomes.sort(String::compareTo);
		nomes.forEach(System.out::println);
		
		
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		
		pessoas.add(new Pessoa("Juninho", (byte) 17));
		pessoas.add(new Pessoa("Fulano", (byte) 18));
		pessoas.add(new Pessoa("Zé", (byte) 12));
		pessoas.add(new Pessoa("Maria", (byte) 31));
		pessoas.add(new Pessoa("Ananias", (byte) 50));

		System.out.println("\n-------- Listando pessoas em ordem de criação (classe com mais atributos) --------\n");
		
		pessoas.forEach(pessoa-> {
			System.out.println("Pessoa de maior: " + pessoa.getNome() + " - " + pessoa.getIdade());
		});

		System.out.println("\n-------- Listando pessoas em ordem alfabetica (classe com mais atributos) --------\n");
		
		pessoas.sort( Comparator.comparing(Pessoa::getNome )) ; 
		pessoas.forEach(pessoa-> {
			System.out.println("Pessoa de maior: " + pessoa.getNome() + " - " + pessoa.getIdade());
		});
		
		System.out.println("\n-------- Listando pessoas em ordem alfabetica DECRESCENTE (classe com mais atributos) --------\n");
		
		pessoas.sort( Comparator.comparing(Pessoa::getNome ).reversed()) ; 
		pessoas.forEach(pessoa-> {
			System.out.println("Pessoa de maior: " + pessoa.getNome() + " - " + pessoa.getIdade());
		});
		
		System.out.println("\n-------- Listando pessoas em ordem de idade (classe com mais atributos) --------\n");
		
		pessoas.sort( Comparator.comparing(Pessoa::getIdade )) ; 
		pessoas.forEach(pessoa-> {
			System.out.println("Pessoa de maior: " + pessoa.getNome() + " - " + pessoa.getIdade());
		});	
		
		System.out.println("\n-------- Listando pessoas em ordem de idade DECRESCENTE (classe com mais atributos) --------\n");
		
		pessoas.sort( Comparator.comparing(Pessoa::getIdade ).reversed()) ; 
		pessoas.forEach(pessoa-> {
			System.out.println("Pessoa de maior: " + pessoa.getNome() + " - " + pessoa.getIdade());
		});

	}
}
