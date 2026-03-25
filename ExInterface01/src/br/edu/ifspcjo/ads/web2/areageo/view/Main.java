package br.edu.ifspcjo.ads.web2.areageo.view;

import br.edu.ifspcjo.ads.web2.areageo.model.AreaCalculavel;
import br.edu.ifspcjo.ads.web2.areageo.model.Circulo;
import br.edu.ifspcjo.ads.web2.areageo.model.Quadrado;
import br.edu.ifspcjo.ads.web2.areageo.model.Retangulo;

public class Main {

	public static void main(String[] args) {
		AreaCalculavel quadrado = new Quadrado(5.0, 7.0);
		AreaCalculavel retangulo = new Retangulo(8.0, 7.0);
		AreaCalculavel circulo = new Circulo(5.0);
		
		System.out.println("Área: " + quadrado.calcularArea());
		System.out.println("---------------------------------");
		System.out.println("Área: " + retangulo.calcularArea());
		System.out.println("---------------------------------");
		System.out.println("Área: " + circulo.calcularArea());

	}

}
