package br.edu.ifspcjo.ads.web2.som.model;

public class Piano implements Instrumento {

	@Override
	public String tocar() {
		return "Tocando Som de Piano";
	}
}
