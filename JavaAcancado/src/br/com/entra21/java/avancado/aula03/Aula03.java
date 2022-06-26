package br.com.entra21.java.avancado.aula03;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Scanner;
import br.com.entra21.java.avancado.aula03.anotacoes.InProgress;
import br.com.entra21.java.avancado.aula03.anotacoes.Lembrete;
import br.com.entra21.java.avancado.aula03.anotacoes.Responsavel;
import br.com.entra21.java.avancado.aula03.datas.Datas;

public class Aula03 {

	static Scanner entrada = new Scanner(System.in);

	static public  void aprender() {
		
		System.out.println("\nCom a nova API de datas ficou mais facil programar e as anotações facilitam a configuração do código");

		System.out.println("\n\tAssuntos da aula 03\n");
		
		Instant inicio = Instant.now();
		
		byte opcao;
		
		do {
			System.out.println("Menu - AULA 03:\n");
			System.out.println("0 - Voltar");
			System.out.println("1 - Datas");
			System.out.println("2 - Anotações");
			System.out.println("--------------------------------------------------------");
			System.out.print("Escolha uma opção para aprender: ");
			opcao = entrada.nextByte();

			switch (opcao) {
			case 0:
			System.out.println("Voltando...");
			break;
			
			case 1:
			Datas.aprenderDatasComputador();
			Datas.aprenderDatasHumanizadas();
			break;
			
			case 2:
			aprenderAnotacoes();
			break;
			
			default:
			System.out.println("Escolha uma opção válida para aprender sobre Datas - Anotações");
			break;
			}
		} while (opcao != 0);
		
		System.out.println("Obrigado, volte sempre que quiser aprender mais sobre Datas - Anotações");
		
		Instant fim = Instant.now();
		
		Duration duracao = Duration.between(inicio, fim);

		System.out.println("\n--------------------------------------------");
		System.out.println("Milisegundos dedicados ao aprendizado = " + duracao.toMillis());
		System.out.println("Segundos dedicados ao aprendizado = " + duracao.toSeconds());
		System.out.println("Minutos dedicados ao aprendizado = " + duracao.toMinutes());
		System.out.println("Horas dedicadas ao aprendizado = " + duracao.toHours());
		System.out.println("--------------------------------------------");
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void aprenderAnotacoes() {
		
		System.out.println("Assunto anotações");
		ArrayList lista = new ArrayList();
		lista.add("dado");

		detalharAtributo();

		exercitar();
	}


	@Lembrete(value = "o value esta lá na interface e o conteúdo fica aqui")
	private static void detalharAtributo() {

	}

	@Responsavel(item = "Praticar o que aprendeu", quemAssume = "Alunos")
	private static void exercitar() {

	}
}
