package lista02;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/*Fa�a um programa que solicite alguns dados dos usu�rios que frequentam um clube. O programa deve solicitar a idade, se a pessoa � fumante ou n�o (1- SIM, 2- N�O), seu sal�rio l�quido e h� quanto tempo frequenta o clube (em meses). O usu�rio dever� digitar �encerrar� quando n�o tiver mais pessoas para registrar.  Como dados de sa�da, o programa deve exibir:
A m�dia das idades das pessoas;
A m�dia salarial das pessoas;
Quantos s�o fumantes e quantos n�o s�o fumantes;
A porcentagem de pessoas que frequentam o clube h� mais de 03 meses. 
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
		
		JOptionPane.showMessageDialog(null, "Bem-vindo ao formul�rio do clube, digite suas informa��es de acordo com as perguntas");

		do {

			contadoraPessoa = contadoraPessoa + 1;

			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: "));
			while (idade <= 0) {
				JOptionPane.showMessageDialog(null, "Valor Inv�lido, insira sua idade novamente");
				idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: "));
			}
			fumante = Integer
					.parseInt(JOptionPane.showInputDialog("Informe se voc� � fumante" + "\n 1 - SIM" + "\n 2 - N�o"));
			while ((fumante != 1) && (fumante != 2)) {
				JOptionPane.showMessageDialog(null, "Valor Inv�lido, insira sua informa��o novamente");
				fumante = Integer.parseInt(
						JOptionPane.showInputDialog("Informe se voc� � fumante" + "\n 1 - SIM" + "\n 2 - N�o"));
			}
			salario = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu sal�rio: "));
			while (salario < 0) {
				JOptionPane.showMessageDialog(null, "Informe um valor de sal�rio valido");
				salario = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu sal�rio: "));
			}

			frequenta = Double
					.parseDouble(JOptionPane.showInputDialog("Informe a quantos meses voc� frequanta o clube: "));
			while (frequenta < 0) {
				JOptionPane.showMessageDialog(null, "Valor Inv�lido, insira o tempo novamente");
				frequenta = Integer
						.parseInt(JOptionPane.showInputDialog("Informe a quantos meses voc� frequanta o clube: "));
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

			condicao = JOptionPane.showInputDialog("Ainda h� pessoas para digitar?"
					+ "\n Digite qualquer caracter para continuar" + "\n Digite encerrar para encerrar");
		} while (!condicao.equalsIgnoreCase("encerrar"));

		mediaIdade = totalIdade / contadoraPessoa;
		mediaSalario = totalSalario / contadoraPessoa;
		porcentagemFrequenta = contadoraFrequenta * 100 / frequentaTotal;
		JOptionPane.showMessageDialog(null,
				"A m�dia de idade das pessoas �: " + df.format(mediaIdade) + "\n A m�dia de sal�rio das pessoas � "
						+ df.format(mediaSalario) + "\n Quantidade de pessoas que fumam: " + contadoraFumante
						+ "\n Quantidade pessoas que n�o fumam: " + contadoraNFumante
						+ "\n Porcentagem de pessoas que frequentam o clube a mais de 3 meses: "
						+ df.format(porcentagemFrequenta) + "%");

	}

}
