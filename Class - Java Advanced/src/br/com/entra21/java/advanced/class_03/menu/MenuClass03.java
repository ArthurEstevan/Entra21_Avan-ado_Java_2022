package br.com.entra21.java.advanced.class_03.menu;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenuClass03 {

	static Scanner input = new Scanner(System.in);

	public static void aprender() {

		// Instanciei minha classe "Instant"
		// Então começa a contagem do tempo.
		Instant start = Instant.now();
		byte option;

		do {

			System.out.println("Menu - Class Three:");
			System.out.println("00 - Leave Menu");
			System.out.println("01 - Dates");
			System.out.println("02 - Subject");
			System.out.println("03 - Leave Program");
			System.out.print("Choose Option Above: ");
			option = input.nextByte();

			switch (option) {

			case 0:

				break;

			case 1:
				learningDate();
				break;

			case 2:

				break;

			case 3:
				System.exit(3);
				break;

			default:
				System.out.println("choose option correct");
				break;
			}

		} while (option != 0);
		// Instanciei minha classe "Instant"
		// Então finaliza a contagem do tempo tempo
		Instant fim = Instant.now();
		
		// Instanciei minha classe "Duration"
		// Mostra duração do tempo capturado entre duas váriaveis instanciadas em "Instant"
		// Método between é usado para mostrar entre uma váriavel e outra
		Duration time = Duration.between(start, fim);
		
		// Usando um syso para mostrar a duração do tempo 
		System.out.println("-----------------------------------------------------------");
		System.out.println("you took " +time.toMillis()+ " milliseconds on the menu");
		System.out.println("you took " +time.toSeconds()+ " seconds on the menu");
		System.out.println("you took " +time.toMinutes()+ " minutes on the menu");
		System.out.println("you took " +time.toHours()+ " hours on the menu");
		System.out.println("-----------------------------------------------------------");

	}
	
	public static void learningDate() {
		
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Setting the Actual Date");
		
		// "LocalDate" mostra data de quando meu comando está sendo executado
		// Preciso definir uma váriavel
		LocalDate today = LocalDate.now(); 
		
		// Syso mostrando minha váriavel instanciada acima
		System.out.println(today);
		
		// Syso mostrando direto meu "LocalDate.now()" usado quando não preciso da váriavel futuramente
		System.out.println(LocalDate.now()); // pode funcionar 
		System.out.println("-----------------------------------------------------------");
		
		//-----------------------------------------------------------------------------------------------------------------//
		
		System.out.println("Setting Automatic/Manual Date");
		
		// "LocalDate" definindo uma data usando "LocalDate.of()"
		// Preciso definir uma váriavel
		LocalDate bourn = LocalDate.of(2002, 12, 27);
		
		// Syso mostrando minha váriavel instanciada acima
		System.out.println(bourn);
		
		// "LocalDate" definindo uma data usando "LocalDate.of()"
		// Preciso definir uma váriavel
		LocalDate todayThursday = LocalDate.of(2022, Month.JUNE, 02);
		
		// Syso mostrando minha váriavel instanciada acima
		System.out.println(todayThursday);
		System.out.println("-----------------------------------------------------------");
		
		//-----------------------------------------------------------------------------------------------------------------//
		
		System.out.println("Date Format");
		
		// "DateTimeFormatter" definindo um formato de data usando "DateTimeFormatter.ofPattern"
		DateTimeFormatter formatter0 = DateTimeFormatter.ofPattern("dd/MM"); 
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MMM"); 
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd MMM YY"); 
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/YYYY"); 
		
//		DD/MM = Dia e Ano
//		DD/MMM = Dia e só o nome do mês em inglês
//		dd MMM YY = Dia, Mês e Números finais da década
//		dd/MM/YYYY = Data Padrão
		
		// Usando meu formato com o método "formatter.format(bourn)"
		System.out.println(formatter0.format(bourn));
		System.out.println(formatter1.format(bourn));
		System.out.println(formatter2.format(bourn));
		System.out.println(formatter3.format(bourn));
		
		// Syso usado quando não preciso da váriavel futuramente
		System.out.println(DateTimeFormatter.ofPattern("YYYY").format(todayThursday));
		System.out.println("-----------------------------------------------------------");
		
		//-----------------------------------------------------------------------------------------------------------------//
		
		// "Period" definindo um tempo entre datas passadas usando o método "Period.between"
		// Preciso definir uma váriavel
		Period life = Period.between(bourn, todayThursday);
		
		// Syso mostrando meus dados usando ".getYears()", .getMonths(), .getDays()".
		System.out.println("Between My Birth and Thursday");
		System.out.println("years = " + life.getYears());
		System.out.println("months = " + life.getMonths());
		System.out.println("days = " + life.getDays());
		
		//-----------------------------------------------------------------------------------------------------------------//
		
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Setting Exact Hours");
	
		// "LocalTime" definindo um tempo 
		// Preciso definir uma váriavel
		LocalTime dinner = LocalTime.of(20,10);
		
		LocalTime evaluation = LocalTime.of(22, 00);

		LocalTime finishClass = LocalTime.of(22,15);
			
		// Usando syso para concatenar meu texto
		System.out.println("We will have dinner at " +dinner+ ", then class evaluation at " +evaluation+ ", ending the class at "+finishClass);
		System.out.println("-----------------------------------------------------------");
	}

}
