package br.edu.ifspcjo.ads.web2.ifitness.domain.model;

public enum Gender {
	//CONSTANTES
	MASCULINO("Masculino"),
	FEMININO("Feminino"),
	OUTRO("Outro"),
	PREFIRO_NAO_DIZER("Prefiro não dizer");
	//descrição no Enum = Construtor.
	
	private String descripition;

	private Gender(String descripition) {
		this.descripition = descripition;
	}

	public String getDescripition() {
		return descripition;
	}
	
}
