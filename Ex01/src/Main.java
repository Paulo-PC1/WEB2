import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float kilo, grams, rest, cats;
		
		System.out.print("Enter the amount of feed in kilograms(kg): ");
		kilo = input.nextFloat();
		
		kilo *= 1000;
		
		System.out.print("Enter the amount of feed for each cat in grams(g): ");
		grams = input.nextFloat();
		
		cats = (grams * 2) * 5;
		
		rest = kilo - cats;
		
		rest /= 1000;
		
		System.out.println("The rest of the feed in 5 days is: " + rest + "Kg");
		
		input.close();
		
	}

}
