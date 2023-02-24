package IntroducaoJava;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] valores = new int[10];
		String repetir = "";
		for (int i = 0; i < 10; i++) {
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º valor: "));
			while (valores[i] < 0) {
				JOptionPane.showMessageDialog(null, "Valor inválido");
				valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º valor: "));
			}
		}

		do {

			int opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"O que você deseja ver?" + "\n 1 - Todos os valores" + "\n 2 - Somente o primeiro valor"
							+ "\n 3 - Somente o último valor" + "\n 4 - O maior valor" + "\n 5 - Ver os valore pares"));
			switch (opcao) {

			case 1:
				for (int i = 0; i < 10; i++) {
					JOptionPane.showMessageDialog(null, valores[i], "Valor " + (i + 1),
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;

			case 2:
				JOptionPane.showMessageDialog(null, valores[0], "Primeiro valor", JOptionPane.INFORMATION_MESSAGE);
				break;

			case 3:
				JOptionPane.showMessageDialog(null, valores[9], "Último valor", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 4:
				int maiorValor = 0;
				for (int i = 0; i < 10; i++) {
					if (valores[i] > maiorValor) {
						maiorValor = valores[i];
					}
				}
				JOptionPane.showMessageDialog(null, "Este é o maior valor:" + maiorValor, "Valor",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			case 5:
				String valoresPares = "";
				for (int i = 0; i < 10; i++) {
					if (valores[i] % 2 == 0) {
						if (valoresPares != "") {
							valoresPares += ", ";
						}
						valoresPares += valores[i];
					}
				}
				JOptionPane.showMessageDialog(null, valoresPares, "Valores Pares", JOptionPane.INFORMATION_MESSAGE);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida", "Erro", JOptionPane.INFORMATION_MESSAGE);
				break;

			}

			repetir = JOptionPane.showInputDialog(
					"Deseja voltar ao menu? " + "\n Digite S para sim ou digite outro caractere para sair:");
		} while (repetir.equalsIgnoreCase("S"));

	}
}
