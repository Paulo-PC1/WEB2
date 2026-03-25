package br.edu.ifspcjo.ads.web2.areageo.model;

public class Circulo implements AreaCalculavel {

	private final double PI = 3.14; // final = constante
	private double raio;
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return raio * Math.pow(PI, 2);
	}

}
