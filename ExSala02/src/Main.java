import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Date data = new Date(01,01,1900);
		int day, month, year;
		
		JOptionPane.showMessageDialog(null, "Data" + data);
		
		 day = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of the day: "));
		 data.setDay(day);
		 
		 month = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of the month: "));
		 data.setMonth(month);
		 
		 year = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of the year: "));
		 data.setYear(year);
		 
		JOptionPane.showMessageDialog(null, "The new data" + data);
	}

}
