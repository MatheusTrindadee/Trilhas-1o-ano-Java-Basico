package lista01;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0, n2 = 0, n3 = 0;

		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero:"));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero:"));

		if ((n1 != n2) && (n1 != n3) && (n2 != n3) ) {

			if ((n1 < n2) && (n1 < n3)) {
				JOptionPane.showMessageDialog(null, "O primeiro n�mero � o menor");
			} else {
				if (n2 < n3) {
					JOptionPane.showMessageDialog(null, "O segundo n�mero � o menor n�mero");
				} else {
					JOptionPane.showMessageDialog(null, "O terceiro n�mero � o menor n�mero");

				}

			}

		} else {
			JOptionPane.showMessageDialog(null, "Existem n�meros iguais!");
		}
	}
}
