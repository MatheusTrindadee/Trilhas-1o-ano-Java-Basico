package lista02;

import javax.swing.JOptionPane;

/*Faça um programa que receba um vetor de valores e mostre a quantidade de  valores negativos. Os valores e o tamanho do vetor devem ser informados pelo usuário.*/

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamanhoLimite = 0;
		int contadoraNeg = 0;
		int contadora = 0;

		JOptionPane.showMessageDialog(null,
				"Bem vindo ao programa de vetores, informe o tamanho do seu vetor e posteriormente os valores dentro dele");

		tamanhoLimite = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho terá o seu vetor?"));

		while (tamanhoLimite <= 0) {
			JOptionPane.showMessageDialog(null, "Informe um valor válido!");
			tamanhoLimite = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho terá o seu vetor?"));
		}

		int[] tamanhoVetor = new int[tamanhoLimite];

		for (contadora = 0; contadora < tamanhoLimite; contadora++) {
			tamanhoVetor[contadora] = Integer
					.parseInt(JOptionPane.showInputDialog("Escreva o " + (contadora + 1) + "º valor"));
			if (tamanhoVetor[contadora] < 0) {
				contadoraNeg = contadoraNeg + 1;
			}

		}
		JOptionPane.showMessageDialog(null, "Este é o número de números negativos: " + contadoraNeg);
	}
}
