package metodos;

import javax.swing.JOptionPane;

public class Exercício01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ano = 0;

		ano = recebeAno();
		calculaAno(ano);

	}

	public static int recebeAno() {
		int ano = 0;
		ano = Integer.parseInt(JOptionPane.showInputDialog("Em qual ano você nasceu?"));
		while (ano > 2021) {
			erroAno();
			ano = Integer.parseInt(JOptionPane.showInputDialog("Em qual ano você nasceu?"));

		}
		return ano;
	}

	public static void calculaAno(int ano) {
		int idade;
		idade = 2021 - ano;
		JOptionPane.showMessageDialog(null, "Sua idade atual é:" + idade);

	}

	public static void erroAno() {
		JOptionPane.showMessageDialog(null, "Ano digitado inválido, digite um número válido!");

	}
}
