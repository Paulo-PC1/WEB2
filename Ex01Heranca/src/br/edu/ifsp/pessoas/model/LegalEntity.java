package br.edu.ifsp.pessoas.model;

public class LegalEntity extends People {

	private String cnpj; 
	
	public LegalEntity(String name, String address, String cnpj) {
		super(name, address);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "PessoaFisica [CNPJ= " + cnpj + ", Name= " + name + ","
				+ " Address= " + address + "]";
	}

}
