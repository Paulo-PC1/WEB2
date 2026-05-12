package br.edu.ifspcjo.ads.web2.tasks.domain.model;

public enum Status {
	
	NOVA ("Nova"),
	EM_ANDAMENTO ("Em Andamento"),
	CONCLUIDA ("Concluída");
	
	private String status;

	Status(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return this.status;
	}
	
}
