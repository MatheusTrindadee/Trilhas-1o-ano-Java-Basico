package lista02;

import javax.swing.JOptionPane;
/*Escreva um programa que receba quatro notas do aluno e as insira em um vetor. Depois, calcule a média aritmética entre as quatro notas e mostre o "conceito" do aluno conforme as instruções: 
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
		
		JOptionPane.showMessageDialog(null, "Informe suas notas para saber seu conceito, de A até D");

		for (contadora = 0; contadora < 4; contadora++) {
			notaAluno[contadora] = Double
					.parseDouble(JOptionPane.showInputDialog("Informe sua " + (contadora + 1) + "º nota:"));
			while ((notaAluno[contadora] < 0) || (notaAluno[contadora] > 10)) {
				JOptionPane.showMessageDialog(null, "Valor inválido!");
				notaAluno[contadora] = Double
						.parseDouble(JOptionPane.showInputDialog("Informe sua " + (contadora + 1) + "º nota:"));
			}

		}
		total = notaAluno[0] + notaAluno[1] + notaAluno[2] + notaAluno[3];
		total = total / 4;

		JOptionPane.showMessageDialog(null, "Sua nota total é: " + total);

		if (total >= 9) {
			JOptionPane.showMessageDialog(null, "Você recebeu o conceito A");
		} else if (total >= 8) {
			JOptionPane.showMessageDialog(null, "Você recebeu o conceito B");
		} else if (total >= 7) {
			JOptionPane.showMessageDialog(null, "Você recebeu o conceito C");
		} else {
			JOptionPane.showMessageDialog(null, "Você recebeu o conceito D");
		}

	}

}
