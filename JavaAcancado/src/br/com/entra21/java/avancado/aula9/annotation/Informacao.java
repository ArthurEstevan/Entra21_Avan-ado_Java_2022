package br.com.entra21.java.avancado.aula9.annotation;

/*
* Anotação usada para organização do projeto
*/
public @interface Informacao {
	
	public enum Informacoes{
		TODO, DO, DOING, DONE
	};
	
	Informacoes informacoes() default Informacoes.DONE;

	String value();
}
