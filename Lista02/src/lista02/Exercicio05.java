package lista02;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/*Faça um programa que solicite alguns dados dos usuários que frequentam um clube. O programa deve solicitar a idade, se a pessoa é fumante ou não (1- SIM, 2- NÃO), seu salário líquido e há quanto tempo frequenta o clube (em meses). O usuário deverá digitar “encerrar” quando não tiver mais pessoas para registrar.  Como dados de saída, o programa deve exibir:
A média das idades das pessoas;
A média salarial das pessoas;
Quantos são fumantes e quantos não são fumantes;
A porcentagem de pessoas que frequentam o clube há mais de 03 meses. 
*/

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 0;
		int salario = 0;
		int contadoraPessoa = 0;
		int mediaIdade = 0;
		int mediaSalario = 0;
		int contadoraFumante = 0;
		int contadoraNFumante = 0;
		int fumante = 0;
		int totalIdade = 0;
		int totalSalario = 0;
		String condicao = "";
		double porcentagemFrequenta = 0;
		double frequenta = 0;
		double contadoraFrequentaMenor = 0;
		double frequentaTotal = 0;
		double contadoraFrequenta = 0;
		DecimalFormat df = new DecimalFormat("0.00");
		
		JOptionPane.showMessageDialog(null, "Bem-vindo ao formulário do clube, digite suas informações de acordo com as perguntas");

		do {

			contadoraPessoa = contadoraPessoa + 1;

			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: "));
			while (idade <= 0) {
				JOptionPane.showMessageDialog(null, "Valor Inválido, insira sua idade novamente");
				idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: "));
			}
			fumante = Integer
					.parseInt(JOptionPane.showInputDialog("Informe se você é fumante" + "\n 1 - SIM" + "\n 2 - Não"));
			while ((fumante != 1) && (fumante != 2)) {
				JOptionPane.showMessageDialog(null, "Valor Inválido, insira sua informação novamente");
				fumante = Integer.parseInt(
						JOptionPane.showInputDialog("Informe se você é fumante" + "\n 1 - SIM" + "\n 2 - Não"));
			}
			salario = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu salário: "));
			while (salario < 0) {
				JOptionPane.showMessageDialog(null, "Informe um valor de salário valido");
				salario = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu salário: "));
			}

			frequenta = Double
					.parseDouble(JOptionPane.showInputDialog("Informe a quantos meses você frequanta o clube: "));
			while (frequenta < 0) {
				JOptionPane.showMessageDialog(null, "Valor Inválido, insira o tempo novamente");
				frequenta = Integer
						.parseInt(JOptionPane.showInputDialog("Informe a quantos meses você frequanta o clube: "));
			}

			if (fumante == 1) {
				contadoraFumante = contadoraFumante + 1;
			} else if (fumante == 2) {
				contadoraNFumante = contadoraNFumante + 1;
			}

			if (frequenta > 3) {
				contadoraFrequenta = contadoraFrequenta + 1;
			} else if (frequenta < 3) {
				contadoraFrequentaMenor = contadoraFrequentaMenor + 1;
			}

			totalIdade = totalIdade + idade;
			totalSalario = totalSalario + salario;
			frequentaTotal = contadoraFrequenta + contadoraFrequentaMenor;

			condicao = JOptionPane.showInputDialog("Ainda há pessoas para digitar?"
					+ "\n Digite qualquer caracter para continuar" + "\n Digite encerrar para encerrar");
		} while (!condicao.equalsIgnoreCase("encerrar"));

		mediaIdade = totalIdade / contadoraPessoa;
		mediaSalario = totalSalario / contadoraPessoa;
		porcentagemFrequenta = contadoraFrequenta * 100 / frequentaTotal;
		JOptionPane.showMessageDialog(null,
				"A média de idade das pessoas é: " + df.format(mediaIdade) + "\n A média de salário das pessoas é "
						+ df.format(mediaSalario) + "\n Quantidade de pessoas que fumam: " + contadoraFumante
						+ "\n Quantidade pessoas que não fumam: " + contadoraNFumante
						+ "\n Porcentagem de pessoas que frequentam o clube a mais de 3 meses: "
						+ df.format(porcentagemFrequenta) + "%");

	}

}
