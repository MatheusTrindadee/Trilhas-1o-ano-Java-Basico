package lista01;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double primeiroNum = 0, segundoNum = 0;
		String opcao = "";
		int simbolo = 0;
		primeiroNum = Integer
				.parseInt(JOptionPane.showInputDialog("Digite o seu primeiro n�mero para calcular com o segundo"));

		do {
			segundoNum = Integer
					.parseInt(JOptionPane.showInputDialog("Digite o seu segundo n�mero para calcular com o primeiro"));

			simbolo = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero respectivo ao s�mbolo:"
					+ "\n 1 - Adi��o" + "\n 2 - Subtra��o" + "\n 3 - Multiplica��o" + "\n 4 - Divis�o"));

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
					JOptionPane.showMessageDialog(null, "Valor inv�lido");
					segundoNum = Integer
							.parseInt(JOptionPane.showInputDialog("Digite o seu segundo n�mero maior que zero"));

				
			}
				primeiroNum= primeiroNum / segundoNum;
				break;
				default:
					JOptionPane.showMessageDialog(null, "Opera��o inv�lida");
					
				}
			opcao = JOptionPane.showInputDialog("Deseja calcular com outro n�mero?" + "\n Digite S para continuar.");

		} while (opcao.equalsIgnoreCase("S"));
		
		JOptionPane.showMessageDialog(null, "Resultado calculado:"+primeiroNum);

	}

}
