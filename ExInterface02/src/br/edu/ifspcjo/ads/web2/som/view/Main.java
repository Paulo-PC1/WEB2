package br.edu.ifspcjo.ads.web2.som.view;

import java.util.Scanner;
import br.edu.ifspcjo.ads.web2.som.model.Instrumento;
import br.edu.ifspcjo.ads.web2.som.model.Bateria;
import br.edu.ifspcjo.ads.web2.som.model.Guitarra;
import br.edu.ifspcjo.ads.web2.som.model.Piano;

public class Main {

	public static void main(String[] args) {
		Instrumento instrumento;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o instrumento a ser tocado: ");
		String nomeInstrumento = scanner.nextLine();
		if(nomeInstrumento.equalsIgnoreCase("Piano")) {
			instrumento  = new Piano();
			System.out.println(instrumento.tocar());
		}
		else if (nomeInstrumento.equalsIgnoreCase("Bateria")) {
			instrumento = new Bateria();
			System.out.println(instrumento.tocar());
		}
		else if (nomeInstrumento.equalsIgnoreCase("Guitarra")) {
			instrumento = new Guitarra();
			System.out.println(instrumento.tocar());
		}
		else {
			System.out.println("Instrumento não encontrado/cadastrado");
		}
		System.out.println("Pressione <ENTER> para continuar");
		scanner.nextLine();
		
		scanner.close();
	}
}
