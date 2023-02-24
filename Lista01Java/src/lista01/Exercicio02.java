package lista01;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 0, maioridade = 0;
		
		maioridade= Integer.parseInt(JOptionPane.showInputDialog("Informe a maioridade civil do seu estado/país"));
		while (maioridade <= 0) {
			JOptionPane.showMessageDialog(null, "Valor incálido, digite novamente");
			maioridade= Integer.parseInt(JOptionPane.showInputDialog("Informe a maioridade civil do seu estado/país"));
		}
		
		idade= Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));
		while (idade <= 0) {
			JOptionPane.showMessageDialog(null, "Valor incálido, digite novamente");
			idade= Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));
		}
		
		if (idade>=maioridade) {
			JOptionPane.showMessageDialog(null, "Você esta acima da maioridade do seu estado/país!");
			
		}else {
			JOptionPane.showMessageDialog(null, "Você não atingiu a maioridade do seu estado/país :(");
			
		}

	}

}
