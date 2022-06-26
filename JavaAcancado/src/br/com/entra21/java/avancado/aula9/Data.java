package br.com.entra21.java.avancado.aula9;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.com.entra21.java.avancado.aula9.annotation.Informacao;

@Informacao (informacoes = Informacao.Informacoes.DONE, value = "Conclusão do Uso de Datas")
public class Data {

	public static void praticingData() {

		Scanner input = new Scanner(System.in);
		byte opcao;
		
		Instant inicio = Instant.now();

		do {

			System.out.println("\nPraticando Datas\n");
			System.out.println("0) Voltar");
			System.out.println("1) Data do Computador");
			System.out.println("2) Data Humana");
			System.out.println("--------------------------------------------------------");
			System.out.print("Escola uma opção válida:");
			opcao = input.nextByte();
			
			switch (opcao) {
			
			case 1:
			computador();
			break;
			
			case 2:
			humano();
			break;

			}

		} while (opcao != 0);
		
		Instant fim = Instant.now();
		
		Duration tempo = Duration.between(inicio, fim);
		
		System.out.println("\n--------------------------------------------");
		System.out.println("Milisegundos gastos escolhendo = " + tempo.toMillis());
		System.out.println("Segundos gastos escolhendo = " + tempo.toSeconds());
		System.out.println("Minutos gastos escolhendo = " + tempo.toMinutes());
		System.out.println("Horas gastos escolhendo = " + tempo.toHours());
		System.out.println("--------------------------------------------");

	}
	
	public static void computador() {
		
		System.out.println("\n============= Exercitando Datas =============\n");
		
		System.out.println("---------- Data do Computador ----------\n");
		
		System.out.println("-Computador entende tempo como duração iniciada em 01/01/1970 até atualmente-\n");
		
		System.out.println("-Data do Computador está contando enquanto você estiver nesse menu-");
			
		System.out.println("\n============= Exercitando Datas =============");
	}
	
	private static void humano() {
		
		System.out.println("\n============= Exercitando Datas =============\n");
		
		System.out.println("---------- Data Humana ----------\n");
		
		System.out.println("---------- Data Hoje ----------\n");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		
		LocalDate dataAtualmente = LocalDate.now();
		
		System.out.println("-Código acima mostra data de hoje-\n");
		
		System.out.println("-Hoje: " + dataAtualmente);
		
		System.out.println("\n-Por padrão data é mostrada em: YYYY-MM-DD (formato ISO-8601)-\n");
	
		System.out.println("---------- Data Formatada ----------\n");
		
		System.out.println("-Formatando Data-\n");
		
		System.out.println("Hoje: " +formatter.format(dataAtualmente));
		
		System.out.println("\n-Será mostrada em: dd/MM/YYYY (formato ISO-8601)\n");
		
		System.out.println("---------- Data Defininda ----------\n");
		
		LocalDate definindoData = LocalDate.of(2002, 12, 27);
		
		System.out.println("-Nascimento: " +definindoData);
		
		System.out.println("\n---------- Data Periodo ----------\n");
		
		System.out.println("-Periodo entre uma Data e Outra-\n");
		
		Period periodo = Period.between(definindoData,dataAtualmente );
		
		System.out.println("Entre meu nascimento e essa quinta");
		System.out.println("anos = " + periodo.getYears());
		System.out.println("meses = " + periodo.getMonths());
		System.out.println("dias = " + periodo.getDays());
		
		System.out.println("\n============= Exercitando Datas =============");
	}

}
