package lista01;

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contadora = 0, intervalo1 = 0, intervalo2 = 0, guarda = 0, somaPar = 0;

		intervalo1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro intervalo:"));
		intervalo2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo intervalo"));

		if (intervalo2 < intervalo1) {
			guarda = intervalo1;
			intervalo1 = intervalo2;
			intervalo2 = guarda;
		}

		for (contadora = intervalo1; contadora <= intervalo2; contadora++) {
			if (contadora % 2 == 0) {
				somaPar = somaPar + contadora;
			}

			
		}
		JOptionPane.showMessageDialog(null, "Esta é a soma dos pares: " + somaPar);
	}

}
