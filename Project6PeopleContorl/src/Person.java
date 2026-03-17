
public class Person {
	
	private String name;
	private String cpf;
	
	public Person(String name, String cpf) {
		this.name = name;
		this.cpf = cpf;
	}
	//set para capturar dado sempre void
	public void setName(String name) {
		this.name = name;
	}
	//get sempre do tipo do dado para ter o retorno
	public String getName() {
		return name;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	@Override //sobrescreve
	public String toString() {
		return "Dados da pessoa [Nome: " + name + " - CPF: " + cpf + "]";
	}
	
}
