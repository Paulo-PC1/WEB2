
public class BankAccount {
	
	//declaração de atributos(Variaveis de Instancia / Instance Variable)
	int id;
	String clientName;
	double balance;
	
	//COnstrutor(Constructor) da classe com args
	
	public BankAccount(int id, String clientName, double balance) {
		this.id = id;
		this.clientName = clientName;
		this.balance = balance;
	}
	
	//Construtor Padrão(default)
	public BankAccount() {}
	
	//método saque
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
		}
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
	
	public void displayDetails() {
		System.out.println("Data of Account: ");
		System.out.println("Acc Number: " + id);
		System.out.println("Client Name: " + clientName);
		System.out.println("Balance: R$ " + balance);
	}

}
