package lista01;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 0, maioridade = 0;
		
		maioridade= Integer.parseInt(JOptionPane.showInputDialog("Informe a maioridade civil do seu estado/pa�s"));
		while (maioridade <= 0) {
			JOptionPane.showMessageDialog(null, "Valor inc�lido, digite novamente");
			maioridade= Integer.parseInt(JOptionPane.showInputDialog("Informe a maioridade civil do seu estado/pa�s"));
		}
		
		idade= Integer.parseInt(JOptionPane.showInputDialog("Quantos anos voc� tem?"));
		while (idade <= 0) {
			JOptionPane.showMessageDialog(null, "Valor inc�lido, digite novamente");
			idade= Integer.parseInt(JOptionPane.showInputDialog("Quantos anos voc� tem?"));
		}
		
		if (idade>=maioridade) {
			JOptionPane.showMessageDialog(null, "Voc� esta acima da maioridade do seu estado/pa�s!");
			
		}else {
			JOptionPane.showMessageDialog(null, "Voc� n�o atingiu a maioridade do seu estado/pa�s :(");
			
		}

	}

}
