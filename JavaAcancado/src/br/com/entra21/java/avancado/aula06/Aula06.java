package br.com.entra21.java.avancado.aula06;

import java.util.ArrayList;
import java.util.HashMap;

import br.com.entra21.java.avancado.Aula;
import br.com.entra21.java.avancado.Pessoa;
import br.com.entra21.java.avancado.aula06.cruds.PessoaCrud;

public class Aula06 extends Aula {

	public static HashMap<String, Pessoa> pessoas = new HashMap<>();

	public Aula06(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);

		if(pessoas.isEmpty()) { 
		pessoas.put("Fulano", new Pessoa("Fulano",(byte)33));
		pessoas.put("Teste", new Pessoa("Teste",(byte)24));
		pessoas.put("José", new Pessoa("José",(byte)17));
		pessoas.put("Maria", new Pessoa("Maria",(byte)18));
		}
	}

	@Override
	public byte capturarOpcao() {

		byte opcao = super.capturarOpcao();
		
		switch (opcao) {
		case 1:
		aprenderGenerics();
		break;
		
		case 2:
		praticarUso();
		break;
		}
		return opcao;
	}

	private void aprenderGenerics() {
		
		System.out.println("\n-------- Criar uma interface para ações de um CRUD que se repetem em todos os CRUD --------\n");
		
		System.out.println("- Cada crud gerencia um collection ou modelo diferente que interfaces simples não resolveriam\n");
		
		System.out.println("- Na declaração da interface informe <LETRA_AQUI> para informar que:\n");
		
		System.out.println("\t * Sempre que LETRA_AQUI foi declarada na interface considere como TIPO_DESCONHECIDO\n");
		
		System.out.println("\t * Nas classes que implementarem a interface utilize:\n");
		
		System.out.println("\t\t - implements IMinhaInterface<SUA_CLASSE_OU_TIPO_AQUI>\n");
		
		System.out.println("- Ao solicitar que gere os métodos automaticamente eles serão criados já com o tipo solicitado");
		
	}

	private void praticarUso() {
		
		System.out.println("\n\tAssuntos Gerenciamento\n");
		
		byte opcao;

		do {
		
			System.out.println("Menu - Gerenciamento\n");
			System.out.println("0 - VOLTAR");
			System.out.println("1 - Gerenciar Pessoas");
			System.out.println("--------------------------------------------------------");
			System.out.print("Escolha uma opção para aprender: ");

			opcao = getEntrada().nextByte();

			switch (opcao) {
			
			case 0:
			System.out.println("Saindo dos CRUDS...");
			break;
			
			case 1:
			new PessoaCrud().gerenciar();
			break;

			}

		} while (opcao != 0);
	}
}
