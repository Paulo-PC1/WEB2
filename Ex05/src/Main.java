import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float real, doll, exchange;
		
		System.out.print("Entre the amount of dollar He has: ");
		doll = input.nextFloat();
		
		System.out.print("Enter the real exchange rate: ");
		exchange = input.nextFloat();
		
		real = doll * exchange;
		
		System.out.println("The Amount of dollar in real is " + real);
		
		input.close();

	}

}
