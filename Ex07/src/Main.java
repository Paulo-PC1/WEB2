import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double weight, weightLoss, weightGain;
		
		System.out.print("Enter your weight: ");
		weight = input.nextDouble();

		weightGain = weight + (weight * 0.15);
		weightLoss = weight - (weight * 0.20);
		
		System.out.println("Weight if you gain 15% is " + weightGain);
		System.out.println("Weight if you loss 20% is " + weightLoss);
		
		input.close();

	}

}
