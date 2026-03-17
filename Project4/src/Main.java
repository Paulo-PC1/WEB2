import java.util.Random;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// instanciar obj classe Random
		Random numberGeneretor = new Random();
		// declaracao de var
		int face1, face2, sumFaces, tries, option, userBet;
		boolean correct;
		// repetiçao do jogo
		do {
			face1 = numberGeneretor.nextInt(6) + 1;
			face2 = numberGeneretor.nextInt(6) + 1;
			
			sumFaces = face1 + face2;
			
			tries = 3;
			
			//System.out.println("Face1: " + face1 + " - Face2: " + face2 + " - Soma Faces: " + sumFaces);
			correct = false;
			
			while (!correct && tries > 0) {
				tries--;
				
				userBet = Integer.parseInt(JOptionPane.showInputDialog("Digite sua aposta: "));
				
				if(userBet == sumFaces) {
					correct = true;
				}else {
					JOptionPane.showMessageDialog(null, "Você errou! Tente Novamente");
				}
			}
			if(correct) {
				JOptionPane.showMessageDialog(null, "Parabéns! Você Acertou");
			}else {
				JOptionPane.showMessageDialog(null, "Jogo encerrado!");
			}
			option = JOptionPane.showConfirmDialog(null, "Deseja Jogar Novamente?");
			
		}while(option == 0); // enquanto 0 continua jogando.
	}

}
