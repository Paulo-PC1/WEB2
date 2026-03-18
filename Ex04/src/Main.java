import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		float product, eachInstall, installments = 5;
		
		product = Float.parseFloat(JOptionPane.showInputDialog("Enter the purchase amount:"));
		
		eachInstall = product / installments;
		
		eachInstall = Math.round(eachInstall);
		
		JOptionPane.showMessageDialog(null, "Each installments will be " + eachInstall);
		
	}
	
}
