package br.com.entra21.java.avancado.aula04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import br.com.entra21.java.avancado.Aula;
import br.com.entra21.java.avancado.Pessoa;

public class Aula04 extends Aula {

	public Aula04(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);
	}

	@Override
	public byte capturarOpcao() {

		byte opcao = super.capturarOpcao();
		switch (opcao) {
		
		case 1:
		aprenderHashSet();
		break;
			
		case 2:
		manipularCRUD();
		break;
		}
		return opcao;
	}

	private void aprenderHashSet() {
		
		System.out.println("\n===========================");
		
		System.out.println("\nCaracteristicas do HashSet:\n");
		
		System.out.println("- Não possui uma ordenação natural (incremento ou alfabetica)");
		System.out.println("- Não é ordenavel");
		System.out.println("- Não permite duplicidades\n");

		System.out.println("===========================");
		
		HashSet<String> linguagens = new HashSet<String>();

		System.out.println("A lista está vazia: " + (linguagens.isEmpty() ? "Sim" : "Não"));
		System.out.println("Quantidade de itens: " + linguagens.size());
		
		System.out.println("===========================");
	}

	private void manipularCRUD() {

		System.out.println("\n======== CRUD ============\n");
		
		HashSet<String> linguagens = new HashSet<String>();
		
		C(linguagens);// create
		R(linguagens);// read
		U(linguagens);// update
		D(linguagens);// delete

	}

	private void C(HashSet<String> linguagens) {
		
		System.out.println("\n======== CREATE ========\n");
		
		linguagens.add("Java");
		linguagens.add("C#");
		linguagens.add("Java");
		linguagens.add("Javascript");
		linguagens.add("Delphi");
		linguagens.add("Kotlin");
		linguagens.add("Java");
		linguagens.add("RubemOliotaLang");
		linguagens.add("C");
		linguagens.add("C#");

		linguagens.addAll(new ArrayList<>(Arrays.asList("Angular", "Typescript")));

	}

	private void R(HashSet<String> linguagens) {

		System.out.println("\n======== READ ========\n");
		System.out.println("A lista está vazia: " + (linguagens.isEmpty() ? "Sim" : "Não"));
		System.out.println("Quantidade de elementos: " + linguagens.size());

		System.out.println("\n------  Listando Elementos ------\n");
		
		System.out.println(linguagens);
		System.out.println("------------------------------------------------");
		
		for (String linguagen : linguagens) {
			System.out.println("Linguagem = " + linguagen);
		}

		System.out.println("\n------  Procurando elementos ------\n");
		System.out.println("Java esta nessa lista: " + (linguagens.contains("Java") ? "Sim" : "Não"));
		System.out.println("Advpl esta nessa lista: " + (linguagens.contains("Advpl") ? "Sim" : "Não"));

	}

	private void U(HashSet<String> linguagens) {

		System.out.println("\n======== UPDATE Não é Possível Atualizar STRING ========\n");
		
		System.out.println("----- Para trocar ele por outro seria necessario remover e depois adicionar outro -----\n");
		
		System.out.println("----- Para outras classes que contem atributos é possivel atualizar pois o objeto continua existindo na lista -----");
		
		System.out.println("----- Mas é necessário percorrer a lista para encontrar e fazer alterações -----\n");

		System.out.println("-----------------------------------------------------------------");
		System.out.println(linguagens);
		System.out.println("-----------------------------------------------------------------");
		
		if (linguagens.contains("Javascript")) {
			linguagens.remove("Javascript");
			linguagens.add("Javascript2");
		}
		
		System.out.println("\nRemovendo Javascript e incluindo Javascript2");
		
		System.out.println("\n-----------------------------------------------------------------");
		System.out.println(linguagens);
		System.out.println("-----------------------------------------------------------------");

		Pessoa pessoa1 = new Pessoa("Rubem", (byte) 33);
		Pessoa pessoa2 = new Pessoa("Fulano", (byte) 14);
		Pessoa pessoa3 = new Pessoa("Teste", (byte) 55);
		
		System.out.println("\n======== UPDATE OUTRO EXEPLO ========\n");

		HashSet<Pessoa> pessoas = new HashSet<>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);

		System.out.println("--------- Listando Pessoas Antes ---------");
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome() + "-" + pessoa.getIdade());
		}
		
		
		if (pessoas.contains(pessoa2)) {
			
			for (Pessoa pessoa : pessoas) {
				if (pessoa.getNome().equals(pessoa2.getNome())) {
					pessoa.setNome("OUTRO NOME");
					break;
				}
			}
		}

		System.out.println("\n--------- Listando Pessoas Depois ---------");
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome() + "-" + pessoa.getIdade());
		}

	}

	private void D(HashSet<String> linguagens) {

		System.out.println("\n======== DELETE ========\n");
		
		System.out.println("--------- listando Linguagens Antes ---------\n");
		
		for (String linguagem : linguagens) {
			System.out.println(linguagem);
		}
		
		System.out.println("\nDeletando Typescript");
		linguagens.remove("Typescript");
		
		System.out.println("\nDeletando GoLang que nao existe");
		linguagens.remove("GoLang");
		
		System.out.println("\n--------- Listando Linguagens Depois ---------\n");
		
		for (String linguagem : linguagens) {
			System.out.println(linguagem);
		}
		
		linguagens.clear();
	}
}
