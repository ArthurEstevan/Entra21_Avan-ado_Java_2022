package br.com.entra21.java.avancado.aula9.collections;

import java.util.ArrayList;
import java.util.Arrays;

public interface ICrud<T> {
	
	ArrayList<String> opcoes = new ArrayList<>(Arrays.asList("Read","Adicionar","Update","Delete"));
	
	public void read(java.util.HashMap<String, T> exercio);
	
	public void update(T chave);
	
	public void delete(T chave);
	
	public void adicionar();
	
	public T buscar(T chave);
	
	public T capturarChave();
	
	public T capturarValores();

}
