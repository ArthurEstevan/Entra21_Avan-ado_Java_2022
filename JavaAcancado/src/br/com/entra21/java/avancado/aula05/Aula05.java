package br.com.entra21.java.avancado.aula05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import br.com.entra21.java.avancado.Aula;

public class Aula05 extends Aula {

	HashMap<String, String> estados = new HashMap<>();

	public Aula05(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);
	}

	@Override
	public byte capturarOpcao() {

		byte opcao = super.capturarOpcao();
		switch (opcao) {
		
		case 1:
		aprenderHashMap();
		break;
		
		case 2:
		aprenderCreate();
		break;
		
		case 3:
		aprenderRead();
		break;
		
		case 4:
		aprenderUpdate();
		break;
		
		case 5:
		aprenderDelete();
		break;
		
		case 6:
		aprenderExemplo();
		break;
		}
		
		return opcao;
	}

	private void aprenderHashMap() {
		
		System.out.println("\n===========================\n");

		System.out.println("Caracteristicas do HashMap:\n");
		
		System.out.println("- Não possui uma ordenação natural (incremento ou alfabetica)");
		System.out.println("- Não é ordenavel");
		System.out.println("- Não permite duplicidades");

		System.out.println("\n===========================");
		
		HashMap<String, String> linguagens = new HashMap<>();

		System.out.println("A lista está vazia: " + (linguagens.isEmpty() ? "Sim" : "Não"));
		System.out.println("Quantidade de itens: " + linguagens.size());
		
		System.out.println("===========================");
	}

	private void aprenderCreate() {
		
		System.out.println("\n======== CREATE ========\n");
			
		estados.clear();
		
		estados.put("CE", "Ceará");
		estados.put("AL", "Alagoas");
		estados.put("DF", "Distrito Federal");
		estados.put("AC", "Acre");
		estados.put("ES", "Espírito Santo");
		estados.put("AP", "Amapá");
		estados.put("AM", "Amazonas");
		estados.put("BA", "Bahia");
		estados.put("PB", "Paraíba");
		estados.put("GO", "Goiâs");
		estados.put("SC", "Santa Catarina");

	}

	private void aprenderRead() {

		System.out.println("\n======== READ ========\n");
		
		System.out.println("===========================");
		
		System.out.println("A lista está vazia: " + (estados.isEmpty() ? "Sim" : "Não"));
		System.out.println("Quantidade de elementos " + estados.size());
		
		System.out.println("===========================\n");

		System.out.println("------ Listando Elementos ------\n");
		
		System.out.println(estados+"\n");
		
		System.out.println("----- Listar Chaves Padrão --------\n");
		
		for (String estado : estados.keySet()) {
			System.out.println("Estado : " + estado);
		}
		
		System.out.println();
		
		System.out.println("-------- Listar Apenas Valores --------\n");
		
		for (String estado : estados.values()) {
			System.out.println("Estado : " + estado);
		}
		
		System.out.println();

		System.out.println("--------Listar Todos os Detalhes----------------\n");
		
		for (Entry<String, String> estado : estados.entrySet()) {
			System.out.println("Estado : " + estado);
			System.out.println("\tKey : " + estado.getKey());
			System.out.println("\tValue : " + estado.getValue());
			System.out.println();
		}
		

		System.out.println("----- Procurando Elementos por Chave -----");
		
		System.out.println("============================================================");
		
		System.out.println("PB é uma chave nessa lista: " + (estados.containsKey("PB") ? "Sim" : "Não"));
		System.out.println("PE é  uma chave nessa lista: " + (estados.containsKey("PE") ? "Sim" : "Não"));
		
		System.out.println("============================================================\n");

		System.out.println("----- Procurando Elementos por Valor -----");
		
		System.out.println("============================================================");
		
		System.out.println("Paraíba é um valor nessa lista: " + (estados.containsValue("Paraíba") ? "Sim" : "Não"));
		System.out.println("Pernambuco é um valor nessa lista: " + (estados.containsValue("Pernambuco") ? "Sim" : "Não"));
		
		System.out.println("============================================================\n");

		System.out.println("-----  Obter Elemento por Chave -----");
		
		System.out.println("============================================================");
		
		String obter1 = estados.get("DF");
		System.out.println("Tentei buscar pela chave DF será que existe: " + (obter1 != null ? "Sim" : "Não"+"\n"));

		String obter2 = estados.get("RR");
		System.out.println("Tentei buscar pela chave RR ser� que existe? " + (obter2 != null ? "Sim" : "Não"+"\n"));

		String obter3 = estados.getOrDefault("RO", "Não achei, tentei usar a chave RO");
		System.out.println("Tentei buscar pela chave RO... " + obter3);

		String obter4 = estados.getOrDefault("BA", "eu sei que tem");
		System.out.println("Tentei buscar pela chave BA... " + obter4);
		System.out.println("============================================================");

	}

	private void aprenderUpdate() {

		System.out.println("\n======== UPDATE por padrão o PUT inserte ou atualiza ========\n");
		
		System.out.println("\n----- basta informar uma chave existente e um valor novo -----\n");

		System.out.println("--------- Listando Estados Antes ---------\n");
		
		for (Entry<String, String> estado : estados.entrySet()) {
			System.out.println("Estado : " + estado);
			System.out.println("\tKey : " + estado.getKey());
			System.out.println("\tValue : " + estado.getValue());
			System.out.println();
		}

		estados.put("SC", "Santa Catarina (Atualizado)");

		System.out.println("--------- Listando Estados Depois --------------\n");
		
		for (Entry<String, String> estado : estados.entrySet()) {
			System.out.println("Estado : " + estado);
			System.out.println("\tKey : " + estado.getKey());
			System.out.println("\tValue : " + estado.getValue());
			System.out.println();
		}
	}

	private void aprenderDelete() {

		System.out.println("\n======== DELETE ========\n");
		
		System.out.println("--------- Listando Estados Antes = " + estados.size() + " ---------\n");
		
		for (Entry<String, String> estado : estados.entrySet()) {
			System.out.println("Estado : " + estado);
			System.out.println("\tKey : " + estado.getKey());
			System.out.println("\tValue : " + estado.getValue());
			System.out.println();
		}
		
		estados.remove("OPA");
		estados.remove("PB");
		estados.remove("SC", "Santa Catarina (Atualizado)");

		System.out.println("--------- Listando Estados Depois = " + estados.size() + " ---------");
		
		System.out.println();
		
		for (Entry<String, String> estado : estados.entrySet()) {
			System.out.println("Estado : " + estado);
			System.out.println("\tKey : " + estado.getKey());
			System.out.println("\tValue : " + estado.getValue());
			System.out.println();
		}
	}

	private void aprenderExemplo() {
		
		System.out.println("\nGerenciar as notas dos alunos:\n");

		HashMap<String, float[]> alunos = new HashMap<>();
		
		System.out.println("------------- Criando 4 alunos e suas 3 notas -------------\n");
		
		alunos.put("Oliota", new float[] { 7, 8, 9 });
		alunos.put("Fulano", new float[] { 7, 8, 8, 8 });
		alunos.put("Zé", new float[] { 7, 9, 9 });
		alunos.put("Maria", new float[] { 7, 9, 10 });

		System.out.println("\n------------- Listar Todos os Alunos -------------\n");

		for (String aluno : alunos.keySet()) {
			System.out.println("Aluno:" + aluno);
		}
		System.out.println();

		System.out.println("------------- Listar Todos os Alunos e suas Respectivas Notas -------------\n");
		
		listarAlunosDetalhes(alunos);
		System.out.println();

		System.out.println("------------- Alterando as Notas do Zé -------------\n");
		
		alunos.put("Zé", new float[] { 10, 7, 10 });

		System.out.println("------------- Buscar e ler notas do Zé -------------\n");
		
		for (float nota : alunos.get("Zé")) {
			System.out.println("\tnota = " + nota);
		}
		System.out.println();

		System.out.println("------------- listar todos os alunos e suas respectivas notas após a alteração -------------\n");
		listarAlunosDetalhes(alunos);
		System.out.println();

		System.out.println("------------- Excluindo o Fulano -------------\n");
		
		if(alunos.containsKey("Fulano")) {
			alunos.remove("Fulano");
		}else {
			System.out.println("Fulano? nunca nem vi");
		}

		System.out.println("------------- listar todos os alunos e suas respectivas notas após exluir o Fulano -------------\n");
		listarAlunosDetalhes(alunos);

	}

	private void listarAlunosDetalhes(HashMap<String, float[]> alunos) {
		
		for (Entry<String, float[]> aluno : alunos.entrySet()) {
			
			System.out.println("Aluno:" + aluno.getKey() + "\n");
			
			float soma = 0;
			
			for (int nota = 0; nota < aluno.getValue().length; nota++) {
				
				System.out.println("\t" + (nota + 1) + "° nota = " + aluno.getValue()[nota]);
				
				soma += aluno.getValue()[nota];
			}
			
			System.out.println("\tMédia = " + soma / aluno.getValue().length+"\n");
			System.out.println("===========================");

		}
		System.out.println("----------------- total de alunos " + alunos.size() + " -----------");
	}
}
