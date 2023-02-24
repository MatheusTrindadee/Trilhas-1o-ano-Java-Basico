package lista02;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/*Um estudante do ensino m�dio gostaria de controlar melhor suas notas nas disciplinas exatas. Ele gostaria de poder enxergar suas notas dos 4 bimestres com exatamente duas casas decimais e em formato de matriz, como no exemplo a seguir:

Matem�tica
F�sica
Qu�mica
9.53
8.66
8.45
7.57
9.00
8.01
8.87
9.44
7.88
7.30
6.77
9.21

Al�m disso, o estudante gostaria de poder escolher algumas op��es de visualiza��o de acordo com o menu abaixo:
Todas as notas de todas as disciplinas;
Qual a maior nota e em qual disciplina foi;
A m�dia das notas de alguma disciplina (solicitar qual);
As notas de um dos bimestres (solicitar qual);
Encerrar.
Fa�a um programa que permita cadastrar as notas de acordo com o exemplo (considerando a ordem das disciplinas) e forne�a os dados supracitados. O menu deve ser exibido repetitivamente, at� que o usu�rio deseje encerrar o programa.
*/

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao = 0, l = 0, c = 0;
		double[][] notas = new double[4][3];
		DecimalFormat df = new DecimalFormat("0.00");
		String[] materias = new String[3];
		materias[0] = "Matem�tica";
		materias[1] = "F�sica";
		materias[2] = "Qu�mica";
		boolean saida = false;

		
		JOptionPane.showMessageDialog(null, "Bem vindo ao seu boletim, informe suas notas e em seguida informe o que quer fazer de acordo com as op��es do menu");
		for (l = 0; l < notas.length; l++) {
			for (c = 0; c < notas[0].length; c++) {
				if (c == 0) {
					notas[l][c] = Double.parseDouble(
							JOptionPane.showInputDialog("Informe a " + (l + 1) + "� nota de " + materias[c]));
					while ((notas[l][c] < 0) || (notas[l][c] > 10)) {
						JOptionPane.showMessageDialog(null, "Informe um valor v�lido");
						notas[l][c] = Double.parseDouble(
								JOptionPane.showInputDialog("Informe a " + (l + 1) + "� nota de " + materias[c]));
					}
				} else if (c == 1) {
					notas[l][c] = Double.parseDouble(
							JOptionPane.showInputDialog("Informe a " + (l + 1) + "� nota de " + materias[c]));
					while ((notas[l][c] < 0) || (notas[l][c] > 10)) {
						JOptionPane.showMessageDialog(null, "Informe um valor v�lido");
						notas[l][c] = Double.parseDouble(
								JOptionPane.showInputDialog("Informe a " + (l + 1) + "� nota de " + materias[c]));
					}
				} else if (c == 2) {
					notas[l][c] = Double.parseDouble(
							JOptionPane.showInputDialog("Informe a " + (l + 1) + "� nota de " + materias[c]));
					while ((notas[l][c] < 0) || (notas[l][c] > 10)) {
						JOptionPane.showMessageDialog(null, "Informe um valor v�lido");
						notas[l][c] = Double.parseDouble(
								JOptionPane.showInputDialog("Informe a " + (l + 1) + "� nota de " + materias[c]));
					}
				}
			}
		}
		do {
			saida = false;

			opcao = Integer.parseInt(JOptionPane
					.showInputDialog("Escolha alguma das op��es: " + "\n 1 - Todas as notas de todas as disciplinas"
							+ "\n 2 - Qual a maior nota e em qual disciplina foi"
							+ "\n 3 - A m�dia das notas de alguma disciplina" + "\n 4 - As notas de um dos bimestres"
							+ "\n 5 - Encerrar"));
			while ((opcao < 1) && (opcao > 5)) {
				JOptionPane.showMessageDialog(null, "Informe um valor v�lido");
				opcao = Integer.parseInt(JOptionPane
						.showInputDialog("Escolha alguma das op��es: " + "\n 1 - Todas as notas de todas as disciplinas"
								+ "\n 2 - Qual a maior nota e em qual disciplina foi"
								+ "\n 3 - A m�dia das notas de alguma disciplina"
								+ "\n 4 - As notas de um dos bimestres" + "\n 5 - Encerrar"));
			}
			switch (opcao) {
			case 1:
				String mostrar = "";
				mostrar= mostrar + "Mat. F�s. Qui." + "\n";
						
				for (l = 0; l < notas.length; l++) {
					for (c = 0; c < notas[0].length; c++) {
						mostrar = mostrar + df.format(notas[l][c]);
						mostrar = mostrar + " ";

					}
					mostrar = mostrar + "\n";
				}
				JOptionPane.showMessageDialog(null, mostrar);
				break;
			case 2:
				double maior = 0;
				String disciplina = "";
				String maiorNota = "";

				for (l = 0; l < notas.length; l++) {
					for (c = 0; c < notas[0].length; c++) {
						if (notas[l][c] > maior) {
							maior = notas[l][c];
							disciplina = materias[c];
						}
						maiorNota =  df.format( maior);
						maiorNota = maiorNota + " em ";
						maiorNota = maiorNota + disciplina;
					}
				}
				JOptionPane.showMessageDialog(null, "Sua maior nota �: "+maiorNota);
				break;

			case 3:
				int opcaoMedia = 0;
				double mediaNota = 0;
				opcaoMedia = Integer.parseInt(JOptionPane.showInputDialog("Escolha a mat�ria para saber a m�dia"
						+ "\n 1 - Matem�tica" + "\n 2 - F�sica" + "\n 3 - Qu�mica"));
				while ((opcaoMedia < 1) && (opcaoMedia > 3)) {
					JOptionPane.showMessageDialog(null, "Informe um valor v�lido");
					opcaoMedia = Integer.parseInt(JOptionPane.showInputDialog("Escolha a mat�ria para saber a m�dia"
							+ "\n 1 - Matem�tica" + "\n 2 - F�sica" + "\n 3 - Qu�mica"));
				}
				for (l = 0; l < notas.length; l++) {
					for (c = 0; c < notas[0].length; c++) {
						if (c == opcaoMedia - 1) {
							mediaNota = mediaNota + notas[l][c] / 4;

						}

					}
				}
				JOptionPane.showMessageDialog(null, df.format(mediaNota));
				break;
			case 4:
				String bimestre = "";
				int opcaoBim = 0;
				opcaoBim = Integer.parseInt(JOptionPane
						.showInputDialog("Selecione qual bimestre voc� deseja ver" + "\n 1 - Primeiro bimestre"
								+ "\n 2 - Segundo bimestre" + "\n 3 - Terceiro bimestre" + "\n 4 - Quarto bimestre"));
				while ((opcaoBim < 1) && (opcaoBim > 4)) {
					JOptionPane.showMessageDialog(null, "Informe um valor v�lido");
					opcaoBim = Integer.parseInt(JOptionPane.showInputDialog("Selecione qual bimestre voc� deseja ver"
							+ "\n 1 - Primeiro bimestre" + "\n 2 - Segundo bimestre" + "\n 3 - Terceiro bimestre"
							+ "\n 4 - Quarto bimestre"));
				}
				for (l = 0; l < notas.length; l++) {
					for (c = 0; c < notas[0].length; c++) {
						if (l == opcaoBim - 1) {
							bimestre = bimestre + materias[c];
							bimestre = bimestre + ": ";
							bimestre = bimestre + df.format(notas[l][c]);
							bimestre = bimestre + "\n";
						}
					}
				}
				JOptionPane.showMessageDialog(null, bimestre);
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "O programa ser� encerrado!");
				saida = true;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Informe um valor v�lido");
				break;

			}
		} while (saida == false);

	}
}
