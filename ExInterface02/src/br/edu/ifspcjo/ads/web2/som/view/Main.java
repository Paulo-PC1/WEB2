package br.edu.ifspcjo.ads.web2.som.view;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Instrumento instrumento = new instrumento();
		Scanner scanner = new Scanner(System.in);
		
		String instumento = scanner.nextLine();
		System.out.println("Som do:" + instumento + instrumento.tocar());
		

	}

}
