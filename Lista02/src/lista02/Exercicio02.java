package lista02;

import javax.swing.JOptionPane;
/*Escreva um programa que receba quatro notas do aluno e as insira em um vetor. Depois, calcule a m�dia aritm�tica entre as quatro notas e mostre o "conceito" do aluno conforme as instru��es: 
9.0 ou maior = Conceito A
entre 8.0 e 8.9 = Conceito B
entre 7.0 e 7.9 = Conceito C
menor que 7.0 = Conceito D
*/

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contadora = 0;
		double total = 0;
		double notaAluno[] = new double[4];
		
		JOptionPane.showMessageDialog(null, "Informe suas notas para saber seu conceito, de A at� D");

		for (contadora = 0; contadora < 4; contadora++) {
			notaAluno[contadora] = Double
					.parseDouble(JOptionPane.showInputDialog("Informe sua " + (contadora + 1) + "� nota:"));
			while ((notaAluno[contadora] < 0) || (notaAluno[contadora] > 10)) {
				JOptionPane.showMessageDialog(null, "Valor inv�lido!");
				notaAluno[contadora] = Double
						.parseDouble(JOptionPane.showInputDialog("Informe sua " + (contadora + 1) + "� nota:"));
			}

		}
		total = notaAluno[0] + notaAluno[1] + notaAluno[2] + notaAluno[3];
		total = total / 4;

		JOptionPane.showMessageDialog(null, "Sua nota total �: " + total);

		if (total >= 9) {
			JOptionPane.showMessageDialog(null, "Voc� recebeu o conceito A");
		} else if (total >= 8) {
			JOptionPane.showMessageDialog(null, "Voc� recebeu o conceito B");
		} else if (total >= 7) {
			JOptionPane.showMessageDialog(null, "Voc� recebeu o conceito C");
		} else {
			JOptionPane.showMessageDialog(null, "Voc� recebeu o conceito D");
		}

	}

}
