package lista02;

import javax.swing.JOptionPane;

/*Escreva um programa que leia um número inteiro e apresente um menu para o usuário escolher:
Verificar se o número é múltiplo de algum outro número (pedir ao usuário esse número);
Verificar se o número é par;
Verificar se o número está entre 0 e 1000;
Sair
Após as entradas de dados, deve ser mostrado ao usuário o resultado da respectiva opção escolhida, e novamente o menu. Para a opção “4- Sair”, utilize System.exit(0);*/

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao = 0;
		int numero = 0;
		int outroNumero = 0;
		String repetir = "";
		
		JOptionPane.showMessageDialog(null, "Informe um número e depois selecione o que quer fazer de acordo com o menu");

		numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
		while (numero < 0) {
			JOptionPane.showMessageDialog(null, "Valor inválido");
			numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
		}

		do {

			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"O que você deseja ver?" + "\n 1 - Verificar se o número é múltiplo de algum outro número"
							+ "\n 2 - Verificar se o número é par" + "\n 3 - Verificar se o número está entre 0 e 1000"
							+ "\n 4 - Sair"));

			while ((opcao < 1) || (opcao > 4)) {
				JOptionPane.showMessageDialog(null, "Informe uma opção válida!");
				opcao = Integer.parseInt(JOptionPane.showInputDialog(
						"O que você deseja ver?" + "\n 1 - Verificar se o número é múltiplo de algum outro número"
								+ "\n 2 - Verificar se o número é par"
								+ "\n 3 - Verificar se o número está entre 0 e 1000" + "\n 4 - Sair"));
			}

			switch (opcao) {
			case 1:
				outroNumero = Integer.parseInt(
						JOptionPane.showInputDialog("Informe um outro número para saber se é múltiplo do primeiro"));
				if ((numero % outroNumero) == 0) {
					JOptionPane.showMessageDialog(null, "Seu número é um múltiplo");
				} else {
					JOptionPane.showMessageDialog(null, "Seu número não é um múltiplo");
				}
				break;
			case 2:
				if ((numero % 2) == 0) {
					JOptionPane.showMessageDialog(null, "Seu número é par");
				} else {
					JOptionPane.showMessageDialog(null, "Seu número é impar");
				}
				break;
			case 3:
				if ((numero >= 0) && (numero <= 1000)) {
					JOptionPane.showMessageDialog(null, "Seu número esta entre 0 e 1000");
				} else {
					JOptionPane.showMessageDialog(null, "Seu número não esta entre 0 e 1000");
				}
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "O programa será encerrado!");
				System.exit(0);
				break;

			}

			repetir = JOptionPane.showInputDialog(null, "Digite S para voltar ao menu");

		} while (repetir.equalsIgnoreCase("S"));

	}
}
