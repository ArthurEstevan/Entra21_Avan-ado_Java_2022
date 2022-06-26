package br.com.entra21.java.avancado.aula06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import br.com.entra21.java.avancado.aula03.anotacoes.Lembrete;

//<QualquerLetra> serve como alias para um tipo que será informado por quem implementar essa interface
//em cada assinatura de método que possuir o alias 
//será criado um método para implementar com o retorno ou parametro já atualizado conforme solicitado

public interface ICrud<T> {

	// atributos são estáticos em interfaces e podem ser utilizados para fornecer de
	// forma facil uma lista
	ArrayList<String> opcoes = new ArrayList<String>(Arrays.asList("Listar", "Adicionar", "Buscar", "Editar", "Deletar"));

	@Lembrete(value = "Inclui um valor")
	public void listar(HashMap<String, T> lista);
	// Perfeita forma de generics, solicitar parametro de uma Collection
	// que gerencia um 'Tipo' que eu ainda nem sei oque é

	@Lembrete(value = "Inclui um valor")
	public void adicionar();// método simples em uma interface, nao tem parametros nem retorno

	@Lembrete(value = "Busca um valor com base em um campo chave e devolve o item quando encontra")
	public T buscar(T chave);
	//forma de generics, retornar e solicita parametro de um 'Tipo' que eu ainda não sei

	@Lembrete(value = "Edita um valor com base em um campo chave")
	public void editar(T chave);
	//forma de generics, solicitar parametro de um 'Tipo' que eu ainda nem sei

	@Lembrete(value = "Deleta um item com base em um campo chave")
	public void deletar(T chave);
	//forma de generics, solicitar parametro de um 'Tipo' que eu ainda nem sei

	@Lembrete(value = "Retorna um valor que é considerado chave de busca")
	public T capturarChave();
	//forma de generics, retonar um 'Tipo' que eu ainda nem sei

	@Lembrete(value = "Retorna um valor que é considerado item completo")
	public T capturarValores();
	//forma de generics, retornar um 'Tipo' que eu ainda nem sei

	@Lembrete(value = "Espera um item completo para exibir seus detalhes")
	public void exibirDetalhes(T completo);
	//forma de generics, solicitar parametro de um 'Tipo' que eu ainda nem
}
