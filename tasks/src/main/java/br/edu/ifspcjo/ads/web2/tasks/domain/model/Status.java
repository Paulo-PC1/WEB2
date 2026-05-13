package br.edu.ifspcjo.ads.web2.tasks.domain.model;

public enum Status {
	
	NOVA("Nova"),
	EM_ANDAMENTO("Em Andamento"),
	CONCLUIDA("Concluída");
	
	private String descripition;

	private Status(String descripition) {
		this.descripition = descripition;
	}
	
	public String getStatus() {
		return this.descripition;
	}
	
}
