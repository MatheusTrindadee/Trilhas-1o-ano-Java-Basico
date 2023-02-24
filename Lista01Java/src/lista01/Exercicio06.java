package lista01;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double primeiroNum = 0, segundoNum = 0;
		String opcao = "";
		int simbolo = 0;
		primeiroNum = Integer
				.parseInt(JOptionPane.showInputDialog("Digite o seu primeiro número para calcular com o segundo"));

		do {
			segundoNum = Integer
					.parseInt(JOptionPane.showInputDialog("Digite o seu segundo número para calcular com o primeiro"));

			simbolo = Integer.parseInt(JOptionPane.showInputDialog("Digite o número respectivo ao símbolo:"
					+ "\n 1 - Adição" + "\n 2 - Subtração" + "\n 3 - Multiplicação" + "\n 4 - Divisão"));

			switch (simbolo) {
			case 1:
				primeiroNum = primeiroNum + segundoNum;
				break;
			case 2:
				primeiroNum = primeiroNum - segundoNum;
				break;
			case 3:
				primeiroNum = primeiroNum * segundoNum;
				break;
			case 4:
				while (segundoNum == 0) {
					JOptionPane.showMessageDialog(null, "Valor inválido");
					segundoNum = Integer
							.parseInt(JOptionPane.showInputDialog("Digite o seu segundo número maior que zero"));

				
			}
				primeiroNum= primeiroNum / segundoNum;
				break;
				default:
					JOptionPane.showMessageDialog(null, "Operação inválida");
					
				}
			opcao = JOptionPane.showInputDialog("Deseja calcular com outro número?" + "\n Digite S para continuar.");

		} while (opcao.equalsIgnoreCase("S"));
		
		JOptionPane.showMessageDialog(null, "Resultado calculado:"+primeiroNum);

	}

}
