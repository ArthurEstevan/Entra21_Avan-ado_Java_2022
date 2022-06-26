package br.com.entra21.java.avancado.aula06.cruds;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import br.com.entra21.java.avancado.Pessoa;
import br.com.entra21.java.avancado.aula06.Aula06;
import br.com.entra21.java.avancado.aula06.ICrud;

public class PessoaCrud implements ICrud<Pessoa> {

	private Scanner entrada = new Scanner(System.in);
	
	public void gerenciar() {
		
		byte opcao;

		do {
			System.out.println("\nMenu -ICRUD\n");
			System.out.println("0 - VOLTAR");
			
			for (int acao = 0; acao < opcoes.size(); acao++) {
				System.out.println((acao + 1) + " - " + opcoes.get(acao));
			}
			
			System.out.println("--------------------------------------------------------");
			System.out.print("Escolha uma opção para aprender: ");
			opcao = entrada.nextByte();

			switch (opcao) {
			
			case 0:
			System.out.println("Saindo dos CRUDS...");
			break;
			
			case 1:
			listar(Aula06.pessoas);
			break;

			case 2:
			adicionar();
			break;
			
			case 3:
			exibirDetalhes(buscar(capturarChave()));
			break;
			
			case 4:
			editar(capturarChave());
			break;
			
			case 5:
			deletar(capturarChave());
			break;
			}
		} while (opcao != 0);
	}

	@Override
	public void listar(HashMap<String, Pessoa> lista) {
		System.out.println("\n============= Listando pessoas ==============\n");
		for (Entry<String, Pessoa> pessoa : lista.entrySet()) {
			System.out.println("CHAVE:" + pessoa.getKey() + "\t\tNome:" + pessoa.getValue().getNome() + ", idade:"
					+ pessoa.getValue().getIdade());
		}
		System.out.println("\n============ Tamanho da Lista = " + lista.size() + " ===========");

	}

	@Override
	public void adicionar() {
		
		Pessoa novo = capturarValores();
		
		if (buscar(novo) == null) {
			Aula06.pessoas.put(novo.getNome(), novo);
			System.out.println("\t-Pessoa Adicionada-");
		} else {
			System.out.println("Ja existe um registro com Nome: " + novo.getNome());
		}

	}

	@Override
	public Pessoa buscar(Pessoa chave) {
		return Aula06.pessoas.get(chave.getNome());
	}

	@Override
	public void editar(Pessoa chave) {
		Pessoa atual = buscar(chave);
		if (atual == null) {
			System.out.println("Não existe um registro com Nome: " + chave.getNome());
		} else {
			Aula06.pessoas.put(atual.getNome(), capturarValores());
			System.out.println("\t-Dados atualizados-");
		}
	}

	@Override
	public void deletar(Pessoa chave) {
		Pessoa atual = buscar(chave);
		if (atual == null) {
			System.out.println("Não existe um registro com Nome: " + chave.getNome());
		} else {
			Aula06.pessoas.remove(atual.getNome());
			System.out.println("\t-Item excluido-");
		}

	}

	@Override
	public Pessoa capturarChave() {
		Pessoa formulario = new Pessoa();
		
		System.out.print("\nInforme Nome: ");
		formulario.setNome(entrada.next());
		return formulario;
	}

	@Override
	public Pessoa capturarValores() {
		Pessoa formulario = new Pessoa();

		System.out.println("\n============= Capturar Dados Completos =============\n");
		
		System.out.print("Informe o nome: ");
		formulario.setNome(entrada.next());
		
		System.out.println("------------------------------");
		
		System.out.print("Informe a idade: ");
		formulario.setIdade(entrada.nextByte());
		
		System.out.println("------------------------------");

		return formulario;
	}

	@Override
	public void exibirDetalhes(Pessoa completo) {
		if (completo == null) {
			System.out.println("Não é possivel exibir os detalhes, item não localizado");
		} else {
			System.out.println(completo.toString());
		}

	}

}
