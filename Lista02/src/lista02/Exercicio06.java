package lista02;

import java.text.DecimalFormat;

/*Uma empresa deseja saber alguns dados sobre suas vendas no passado. Fa�a um programa que armazene em um vetor o valor total das vendas de cada um dos 12 meses do ano (que dever� ser informado pelo usu�rio) e mostre:
O m�s com a maior venda;
O m�s com a menor venda;
A m�dia das vendas do ano todo;
A m�dia das vendas dos meses pares;
A m�dia das vendas do 2� semestre.
*/

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contadora = 0;
		int mesMaiorVenda = 0;
		int mesMenorVenda = 0;
		double meses[] = new double[12];
		double maiorVenda = 0;
		double menorVenda = 0;
		double totalVendas = 0;
		double totalVendas2 = 0;
		double totalVendasPares = 0;
		double mediaVendas = 0;
		double mediaVendas2 = 0;
		double mediaVendasPares = 0;

		DecimalFormat df = new DecimalFormat("0.00");

		JOptionPane.showMessageDialog(null,
				"Bem vindo ao seu gerenciador de vendas, informe os valores de cada m�s e o programa lhe mostrar� informa��es");
		for (contadora = 0; contadora < 12; contadora++) {
			meses[contadora] = Double.parseDouble(
					JOptionPane.showInputDialog("Informe o valor total de vendas do " + (contadora + 1) + "� m�s"));
			while (meses[contadora] < 0) {
				JOptionPane.showMessageDialog(null, "Informe um valor a cima de 0!");
				meses[contadora] = Double.parseDouble(
						JOptionPane.showInputDialog("Informe o valor total de vendas do " + (contadora + 1) + "� m�s"));
			}

			if (contadora == 0) {
				maiorVenda = meses[contadora];
				menorVenda = meses[contadora];
			}

			if (meses[contadora] > maiorVenda) {
				maiorVenda = meses[contadora];
				mesMaiorVenda = contadora;
			}
			if (menorVenda > meses[contadora]) {
				// if (meses[contadora] < menorVenda) {

				menorVenda = meses[contadora];
				mesMenorVenda = contadora;
			}

			totalVendas = totalVendas + meses[contadora];
			mediaVendas = totalVendas / 12;

			if (meses[contadora] % 2 == 0) {
				totalVendasPares = totalVendasPares + meses[contadora];
				mediaVendasPares = totalVendasPares / 6;
			}

			totalVendas2 = totalVendas2 + meses[6] + meses[7] + meses[8] + meses[9] + meses[10] + meses[11];
			mediaVendas2 = totalVendas2 / 6;

		}
		JOptionPane.showMessageDialog(null,
				"O m�s com a maior venda do ano foi o m�s: " + (mesMaiorVenda + 1)
						+ "\n O m�s com a menor venda do ano foi o m�s: " + (mesMenorVenda + 1)
						+ "\n A m�dia de vendas do ano foi de: " + df.format(mediaVendas)
						+ "\n A m�dia de vendas dos meses pares foi de: " + df.format(mediaVendasPares)
						+ "\n A m�dia de vendas do segundo semestre foi de: " + df.format(mediaVendas2));

	}

}
