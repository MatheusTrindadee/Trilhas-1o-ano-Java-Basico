package lista02;

import javax.swing.JOptionPane;

/*Fa�a um programa que receba um vetor de valores e mostre a quantidade de  valores negativos. Os valores e o tamanho do vetor devem ser informados pelo usu�rio.*/

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamanhoLimite = 0;
		int contadoraNeg = 0;
		int contadora = 0;

		JOptionPane.showMessageDialog(null,
				"Bem vindo ao programa de vetores, informe o tamanho do seu vetor e posteriormente os valores dentro dele");

		tamanhoLimite = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho ter� o seu vetor?"));

		while (tamanhoLimite <= 0) {
			JOptionPane.showMessageDialog(null, "Informe um valor v�lido!");
			tamanhoLimite = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho ter� o seu vetor?"));
		}

		int[] tamanhoVetor = new int[tamanhoLimite];

		for (contadora = 0; contadora < tamanhoLimite; contadora++) {
			tamanhoVetor[contadora] = Integer
					.parseInt(JOptionPane.showInputDialog("Escreva o " + (contadora + 1) + "� valor"));
			if (tamanhoVetor[contadora] < 0) {
				contadoraNeg = contadoraNeg + 1;
			}

		}
		JOptionPane.showMessageDialog(null, "Este � o n�mero de n�meros negativos: " + contadoraNeg);
	}
}
