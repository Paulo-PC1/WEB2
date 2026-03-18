import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		float show, ticket, quantTicket;
		
		show = Float.parseFloat(JOptionPane.showInputDialog("Enter the cost of the show: "));
		
		ticket = Float.parseFloat(JOptionPane.showInputDialog("Enter the cost of each ticket: "));
		
		quantTicket = show / ticket;
		
		quantTicket =  Math.round(quantTicket);
		
		JOptionPane.showMessageDialog(null, "Amount of ticket for the show's cost is " + quantTicket);

	}

}
