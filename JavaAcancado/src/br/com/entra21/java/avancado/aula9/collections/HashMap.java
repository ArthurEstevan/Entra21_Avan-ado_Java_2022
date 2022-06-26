package br.com.entra21.java.avancado.aula9.collections;

import java.util.Map.Entry;
import java.util.Scanner;

import br.com.entra21.java.avancado.Pessoa;

public class HashMap implements ICrud<Pessoa> {
	
	public static java.util.HashMap<String, Pessoa> pessoas = new java.util.HashMap<>();
	
	static Scanner input = new Scanner(System.in);
	
	public void praticingHashMap() {
		
		if (pessoas.isEmpty()) {
			pessoas.put("Roberto", new Pessoa("Roberto", (byte)20));
			pessoas.put("Pedro", new Pessoa("Pedro", (byte)19));
			pessoas.put("Joana", new Pessoa("Joana", (byte)18));
			pessoas.put("Beto", new Pessoa("Beto", (byte)17));
		}
		
		byte opcao;
		
		do {
			System.out.println("\nPraticando Collections\n");
			System.out.println("0) Voltar");
			
			for(int contador = 0; contador < opcoes.size(); contador++) {
				System.out.println((contador+1) + ") " +opcoes.get(contador));
			}
			System.out.println("--------------------------------------------------------");
			System.out.print(  "Escola uma opção válida: ");
			opcao = input.nextByte();
			
			switch (opcao) {
			
			case 1:
			read(pessoas);
			break;
			
			case 2:
			adicionar();
			break;

			case 3:
			read(pessoas);
			update(capturarChave());
			break;

			case 4:
			read(pessoas);
			delete(capturarChave());
			break;

				
			default:
			break;
			}
			
		}while (opcao != 0);

	}

	@Override
	public void read(java.util.HashMap<String, Pessoa> exercio) {
		
		System.out.println("\n============= Read pessoas ==============\n");
		
		for (Entry<String, Pessoa> pessoa : exercio.entrySet()) {
			System.out.println( " Chave = " + pessoa.getKey()               + "\n" +
							    " Nome  = " + pessoa.getValue().getNome()   + "\n" +
		                        " Idade = " + pessoa.getValue().getIdade()  + "\n" +
							    "------------------------------------------------");
		}
		
		System.out.println("\n============= Read pessoas ==============");
	}
	
	@Override
	public Pessoa buscar(Pessoa chave) {
		return pessoas.get(chave.getNome());
	}

	@Override
	public void update(Pessoa chave) {
		
		System.out.println("\n============= Update Pessoas ==============\n");
			
		Pessoa atual = buscar(chave);
		
		if (atual == null) {
			System.out.println("\n-Registro não encontrado-");
		} else {
			pessoas.put(atual.getNome(), capturarValores());
			System.out.println("\t    -Dados atualizados-");
		}
		
		System.out.println("\n============= Update Pessoas ==============");
	}

	@Override
	public void delete(Pessoa chave) {
		
		System.out.println("\n============= Delete Pessoas ==============\n");
		
		Pessoa atual = buscar(chave);
		
		if (atual == null) {
			System.out.println("-Registro não encontrado-");
		} else {
			pessoas.remove(atual.getNome());
			System.out.println("\t  -Item excluido-");
		}
		
		System.out.println("\n============= Delete Pessoas ==============\n");
	}

	@Override
	public void adicionar() {
		
		System.out.println("\n============= Add Pessoas ==============");
		
		Pessoa novo = capturarValores();
		
		if (buscar(novo) == null) {
			pessoas.put(novo.getNome(), novo);
			System.out.println("\t    -Pessoa Adicionada-");
		} else {
			System.out.println("-Registro Existente-");
		}
		
		System.out.println("\n============= Add Pessoas ==============");

	}

	@Override
	public Pessoa capturarChave() {
		
		Pessoa formulario = new Pessoa();
		
		System.out.print("\nInforme Nome: ");
		formulario.setNome(input.next());
		return formulario;
		
	}

	@Override
	public Pessoa capturarValores() {
		Pessoa formulario = new Pessoa();

		System.out.println("\n============= Capturar Dados =============\n");
		
		System.out.println("------------------------------");
		System.out.print("Informe o nome: ");
		formulario.setNome(input.next());
		
		System.out.print("Informe a idade: ");
		formulario.setIdade(input.nextByte());
		System.out.println("------------------------------");
		
		System.out.println("\n============= Capturar Dados =============\n");

		return formulario;
	}



}
