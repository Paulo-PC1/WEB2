package br.edu.ifsp.pessoas.model;

public class Individual extends People{

	private String cpf; 
	
	public Individual(String name, String address, String cpf) {
		super(name, address);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "PessoaFisica [CPF= " + cpf + ", Name= " + name + ","
				+ " Address= " + address + "]";
	}

}
