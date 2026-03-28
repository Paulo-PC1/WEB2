package br.edu.ifspcjo.ads.web2.som.model;

public class Bateria implements Instrumento{

	@Override
	public String tocar() {
		return "Tocando Som de Bateria";
	}
}
