import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		double killowatt, energyConsumed, price, discontPrice;
		
		killowatt = Double.parseDouble(JOptionPane.showInputDialog("Enter the Value of the Killowatts(kW) consumed: "));
		
		energyConsumed = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount of the Energy Consumed: "));
		
		energyConsumed *=1000;
		
		price = killowatt * energyConsumed;
		
		JOptionPane.showMessageDialog(null, "The price to be paid is R$" + price);
		
		discontPrice = price - (price * 0.15);
		
		JOptionPane.showMessageDialog(null, "The price with 15% of discont is R$" + discontPrice);
	}

}
