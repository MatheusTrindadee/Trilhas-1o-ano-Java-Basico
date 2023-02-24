package lista01;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0, n2 = 0, n3 = 0;

		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));

		if ((n1 != n2) && (n1 != n3) && (n2 != n3) ) {

			if ((n1 < n2) && (n1 < n3)) {
				JOptionPane.showMessageDialog(null, "O primeiro número é o menor");
			} else {
				if (n2 < n3) {
					JOptionPane.showMessageDialog(null, "O segundo número é o menor número");
				} else {
					JOptionPane.showMessageDialog(null, "O terceiro número é o menor número");

				}

			}

		} else {
			JOptionPane.showMessageDialog(null, "Existem números iguais!");
		}
	}
}
