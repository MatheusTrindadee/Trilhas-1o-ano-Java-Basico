package lista02;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/*Sabe-se que o lat�o � constitu�do de 70% de cobre e 30% de zinco. Fa�a um programa que permita ao usu�rio informar uma quantidade de lat�o em quilos e forne�a o total de cobre e zinco necess�rios para fabricar essa quantidade.*/

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double qntdLatao = 0;
		double totalC = 0;
		double totalZ = 0;
		DecimalFormat df = new DecimalFormat("0.00");

		JOptionPane.showMessageDialog(null,
				"Informe uma quantidade em KG de lat�o, para saber de quantos KGs de cobre e zinco ele � feito");

		qntdLatao = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de lat�o em KG"));
		while (qntdLatao <= 0) {
			JOptionPane.showMessageDialog(null, "Valor inv�lido");
			qntdLatao = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de lat�o em KG"));
		}

		totalC = qntdLatao * 0.70;
		totalZ = qntdLatao * 0.30;

		JOptionPane.showMessageDialog(null,
				"O total de cobre para fazer o lat�o nesta quantidade �: " + df.format(totalC) + "kg"
						+ "\n O total de zinco para fazer o lat�o nesta quantidade �: " + df.format(totalZ) + "kg");

	}

}
