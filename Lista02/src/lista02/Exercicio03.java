package lista02;

import javax.swing.JOptionPane;

/*Escreva um programa que leia um n�mero inteiro e apresente um menu para o usu�rio escolher:
Verificar se o n�mero � m�ltiplo de algum outro n�mero (pedir ao usu�rio esse n�mero);
Verificar se o n�mero � par;
Verificar se o n�mero est� entre 0 e 1000;
Sair
Ap�s as entradas de dados, deve ser mostrado ao usu�rio o resultado da respectiva op��o escolhida, e novamente o menu. Para a op��o �4- Sair�, utilize System.exit(0);*/

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao = 0;
		int numero = 0;
		int outroNumero = 0;
		String repetir = "";
		
		JOptionPane.showMessageDialog(null, "Informe um n�mero e depois selecione o que quer fazer de acordo com o menu");

		numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero inteiro"));
		while (numero < 0) {
			JOptionPane.showMessageDialog(null, "Valor inv�lido");
			numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero inteiro"));
		}

		do {

			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"O que voc� deseja ver?" + "\n 1 - Verificar se o n�mero � m�ltiplo de algum outro n�mero"
							+ "\n 2 - Verificar se o n�mero � par" + "\n 3 - Verificar se o n�mero est� entre 0 e 1000"
							+ "\n 4 - Sair"));

			while ((opcao < 1) || (opcao > 4)) {
				JOptionPane.showMessageDialog(null, "Informe uma op��o v�lida!");
				opcao = Integer.parseInt(JOptionPane.showInputDialog(
						"O que voc� deseja ver?" + "\n 1 - Verificar se o n�mero � m�ltiplo de algum outro n�mero"
								+ "\n 2 - Verificar se o n�mero � par"
								+ "\n 3 - Verificar se o n�mero est� entre 0 e 1000" + "\n 4 - Sair"));
			}

			switch (opcao) {
			case 1:
				outroNumero = Integer.parseInt(
						JOptionPane.showInputDialog("Informe um outro n�mero para saber se � m�ltiplo do primeiro"));
				if ((numero % outroNumero) == 0) {
					JOptionPane.showMessageDialog(null, "Seu n�mero � um m�ltiplo");
				} else {
					JOptionPane.showMessageDialog(null, "Seu n�mero n�o � um m�ltiplo");
				}
				break;
			case 2:
				if ((numero % 2) == 0) {
					JOptionPane.showMessageDialog(null, "Seu n�mero � par");
				} else {
					JOptionPane.showMessageDialog(null, "Seu n�mero � impar");
				}
				break;
			case 3:
				if ((numero >= 0) && (numero <= 1000)) {
					JOptionPane.showMessageDialog(null, "Seu n�mero esta entre 0 e 1000");
				} else {
					JOptionPane.showMessageDialog(null, "Seu n�mero n�o esta entre 0 e 1000");
				}
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "O programa ser� encerrado!");
				System.exit(0);
				break;

			}

			repetir = JOptionPane.showInputDialog(null, "Digite S para voltar ao menu");

		} while (repetir.equalsIgnoreCase("S"));

	}
}
