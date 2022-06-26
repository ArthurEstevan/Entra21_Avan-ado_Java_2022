package br.com.entra21.java.avancado.aula9;

import java.util.ArrayList;
import br.com.entra21.java.avancado.Aula;

public class Aula09 extends Aula {


	public Aula09(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);
	}

	@Override	
	public byte capturarOpcao() {

		byte opcao = super.capturarOpcao();

		switch (opcao) {

		case 1:
		Wrapper.practicingWrapper();
		break;

		case 2:
		Enum.practicingEnum();
		break;

		case 3:
		Collections.practicingCollecntions();
		break;

		case 4:

		break;
		
		case 5:

		break;

		case 6:

		break;

		}

		return opcao;
	}

}

