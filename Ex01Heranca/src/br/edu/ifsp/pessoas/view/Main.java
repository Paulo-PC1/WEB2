package br.edu.ifsp.pessoas.view;

import br.edu.ifsp.pessoas.model.Individual;
import br.edu.ifsp.pessoas.model.LegalEntity;
import br.edu.ifsp.pessoas.model.People;

public class Main {

	public static void main(String[] args) {
		
		People people1 = new Individual("Paulo Cezar", "Rua: Oscar da Matta N°58, Bairro: Jd Floriano Pinheiro, Campos do Jordão", "1234");
		
		System.out.println(people1);
		
		People people2 = new LegalEntity("Paulo Cezar", "Rua: Oscar da Matta N°58, Bairro: Jd Floriano Pinheiro, Campos do Jordão", "4567/890");
		
		System.out.println(people2);
	
	}

}
