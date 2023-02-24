package metodos;

import javax.swing.JOptionPane;

public class DesafioFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] montarEstrutura = new String[3][3];
		String jogador = "";
		int nroJogada = 0;
		boolean resultado = false;
		String mostrar = "";
		String jogada = "";
		boolean validar = false;

		montarTabu(montarEstrutura);

		while (resultado == false && nroJogada != 9) {
			nroJogada++;

			jogador = vezJogador(nroJogada); //X ou O

			do {
				mostrar = mostrarTabu(montarEstrutura); // Retornando o tabuleiro ja montado
				jogada = JOptionPane.showInputDialog(mostrar + "\n" + jogador + " escolha onde quer jogar");
				validar = colocar(jogada, montarEstrutura, jogador); //Retornando a valida��o de jogada

			} while (validar == true); //validar = falso sai do 'do'
			resultado = validarVitoria(montarEstrutura, jogador); //Retornando se alguem venceu ou n�o

		}
		mostrarResultado(resultado, montarEstrutura, jogador);
	}
	public static void montarTabu(String[][] montarEstrutura) {

		int l = 0;
		int c = 0;
		String mostrar = "";
		int contadora = 0;

		for (l = 0; l < 3; l++) {            
			mostrar = mostrar + "\n";
			for (c = 0; c < 3; c++) {
				contadora++;
				montarEstrutura[l][c] = String.valueOf(contadora);
				mostrar = mostrar + " " + montarEstrutura[l][c];
			}
		}
	}
	public static String mostrarTabu(String[][] montarEstrutura) {
		int l = 0;
		int c = 0;
		String mostrar = "";
		for (l = 0; l < 3; l++) {
			mostrar = mostrar + "\n";
			for (c = 0; c < 3; c++) {
				mostrar = mostrar + " " + montarEstrutura[l][c];

			}
		}
		return mostrar;
	}
	public static String vezJogador(int nroJogada) {
		String jogador = "";
		// nroJogada = nroJogada + 1;
		if (nroJogada % 2 != 0) {
			jogador = "X";
		} else {
			jogador = "O";
		}
		return jogador;
	}
	public static boolean colocar(String jogada, String[][] jogoTabu, String jogador) {
		boolean validadoraJogada = false;
		switch (jogada) {
		case "1":
			if ((jogoTabu[0][0] != "X") && (jogoTabu[0][0] != "O")) { // [0] [0]
				jogoTabu[0][0] = jogador;
				validadoraJogada = false;
			} else {
				validadoraJogada = true;
			}
			break;
		case "2":
			if ((jogoTabu[0][1] != "X") && (jogoTabu[0][1] != "O")) {
				jogoTabu[0][1] = jogador;
				validadoraJogada = false;
			} else {
				validadoraJogada = true;
			}

			break;
		case "3":
			if ((jogoTabu[0][2] != "X") && (jogoTabu[0][2] != "O")) {
				jogoTabu[0][2] = jogador;
				validadoraJogada = false;
			} else {
				validadoraJogada = true;
			}

			break;
		case "4":
			if ((jogoTabu[1][0] != "X") && (jogoTabu[1][0] != "O")) {
				jogoTabu[1][0] = jogador;
				validadoraJogada = false;
			} else {
				validadoraJogada = true;
			}

			break;
		case "5":
			if ((jogoTabu[1][1] != "X") && (jogoTabu[1][1] != "O")) {
				jogoTabu[1][1] = jogador;
				validadoraJogada = false;
			} else {
				validadoraJogada = true;
			}
			break;
		case "6":
			if ((jogoTabu[1][2] != "X") && (jogoTabu[1][2] != "O")) {
				jogoTabu[1][2] = jogador;
				validadoraJogada = false;
			} else {
				validadoraJogada = true;
			}
			break;
		case "7":
			if ((jogoTabu[2][0] != "X") && (jogoTabu[2][0] != "O")) {
				jogoTabu[2][0] = jogador;
				validadoraJogada = false;
			} else {
				validadoraJogada = true;
			}
			break;
		case "8":
			if ((jogoTabu[2][1] != "X") && (jogoTabu[2][1] != "O")) {
				jogoTabu[2][1] = jogador;
				validadoraJogada = false;
			} else {
				validadoraJogada = true;
			}
			break;
		case "9":
			if ((jogoTabu[2][2] != "X") && (jogoTabu[2][2] != "O")) {
				jogoTabu[2][2] = jogador;
				validadoraJogada = false;
			} else {
				validadoraJogada = true;
			}
			break;
		default:
			validadoraJogada = true;
			JOptionPane.showMessageDialog(null, "Jogada Inv�lida");
		}

		return validadoraJogada;
	}
	public static boolean validarVitoria(String[][] montarEstrutura, String jogador) {
		boolean resultado = false;
		int l = 0;
		int c = 0;
        // DIAGONAL
		if ((montarEstrutura[0][0] == jogador && montarEstrutura[1][1] == jogador
				&& montarEstrutura[2][2] == jogador)) {
			resultado = true;

		} else if ((montarEstrutura[0][2] == jogador && montarEstrutura[1][1] == jogador
				&& montarEstrutura[2][0] == jogador)) {
			resultado = true;
		}

		// HORIZONTAL
		for (l = 0; l < 3; l++) {
			if ((montarEstrutura[l][0] == jogador && montarEstrutura[l][1] == jogador
					&& montarEstrutura[l][2] == jogador)) {
				resultado = true;
			}
		}
		// VERTICAL
		for (c = 0; c < 3; c++) {
			if ((montarEstrutura[0][c] == jogador && montarEstrutura[1][c] == jogador
					&& montarEstrutura[2][c] == jogador)) {
				resultado = true;
			}
		}

		return resultado;
	}
	public static void mostrarResultado(boolean resultado, String[][] montarEstrutura, String jogador) {
		String mostrar = "";
		mostrar = mostrarTabu(montarEstrutura);
		if (resultado == true) {

			JOptionPane.showMessageDialog(null, mostrar + "\n Jogador " + jogador + " venceu", "Vit�ria",
					JOptionPane.PLAIN_MESSAGE);

		} else if (resultado == false) {

			JOptionPane.showMessageDialog(null, mostrar + "\n Deu velha ", "Empate", JOptionPane.PLAIN_MESSAGE);

		}
	}
}