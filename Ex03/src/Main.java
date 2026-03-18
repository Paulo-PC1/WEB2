import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float daily, disc, descDaily;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value of the daily: ");
		daily = input.nextFloat();
		
		System.out.print("Enter the value of the discont(%):");
		disc = input.nextFloat();
		
		descDaily = daily - (daily * disc/100);
		
		System.out.println("The daily with " + disc + "(%) is " + descDaily);
		
		input.close();
	}
}
