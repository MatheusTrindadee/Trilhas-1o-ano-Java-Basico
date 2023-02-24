package lista02;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/*Sabe-se que o latão é constituído de 70% de cobre e 30% de zinco. Faça um programa que permita ao usuário informar uma quantidade de latão em quilos e forneça o total de cobre e zinco necessários para fabricar essa quantidade.*/

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double qntdLatao = 0;
		double totalC = 0;
		double totalZ = 0;
		DecimalFormat df = new DecimalFormat("0.00");

		JOptionPane.showMessageDialog(null,
				"Informe uma quantidade em KG de latão, para saber de quantos KGs de cobre e zinco ele é feito");

		qntdLatao = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de latão em KG"));
		while (qntdLatao <= 0) {
			JOptionPane.showMessageDialog(null, "Valor inválido");
			qntdLatao = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de latão em KG"));
		}

		totalC = qntdLatao * 0.70;
		totalZ = qntdLatao * 0.30;

		JOptionPane.showMessageDialog(null,
				"O total de cobre para fazer o latão nesta quantidade é: " + df.format(totalC) + "kg"
						+ "\n O total de zinco para fazer o latão nesta quantidade é: " + df.format(totalZ) + "kg");

	}

}
