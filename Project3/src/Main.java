import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// instanciar um objeto da classe Scanner
		Scanner input = new Scanner(System.in);
		//input = new Scanner(System.in);
		//declarar variáveis
		int number1, number2, sum;
		
		System.out.print("Digite um número Inteiro: ");
		number1 = input.nextInt();
		
		System.out.print("Digite outro número Inteiro: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		
		System.out.println("Soma = " + sum);
		
		//fechar o teclado(input)
		
		input.close();
		
	}

}
