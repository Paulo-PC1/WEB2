
public class Main {

	public static void main(String[] args) {
		//instanciar obj classe BankAccount
		BankAccount account1 = new BankAccount(1, "Cliente 1", 1000);
		//instcanciar outro obj
		BankAccount account2 = new BankAccount();
		
		System.out.println("Account 1: ");
		System.out.println(account1);
		account1.displayDetails();
		
		account1.deposit(1000);
		account1.displayDetails();
		
		System.out.println("[Show Atribute], New Balance: " + account1.balance);
		
		account1.withdraw(1500);
		
		System.out.println("[Show Atribute], New Balance: " + account1.balance);
		
		account1.clientName = "Fulanin de Tal";
		account1.displayDetails();
		
		
		System.out.println("Account 2: ");
		System.out.println(account2);
		account2.displayDetails();

	}

}
