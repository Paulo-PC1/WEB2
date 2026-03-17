import javax.swing.JOptionPane;

public class Main2 {

	public static void main(String[] agrs) {
		// declarar var
		int number1, number2, sum;
		
		number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
		
		sum = number1 + number2;
		
		JOptionPane.showMessageDialog(null, "Soma = " + sum);
	}
}
