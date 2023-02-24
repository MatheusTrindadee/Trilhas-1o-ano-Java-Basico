package lista01;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hora=0, min=0, seg=0, total=0;
		
		hora=Integer.parseInt(JOptionPane.showInputDialog("Escreva o valor em horas"));
		while (hora<0) {
			JOptionPane.showMessageDialog(null, "Valores Inválidos, reescreva os valores novamente");
			hora=Integer.parseInt(JOptionPane.showInputDialog("Escreva o valor em horas"));
		}
		total= hora*3600;
	
		
		min=Integer.parseInt(JOptionPane.showInputDialog("Escreva o valor em minutos"));
		while (min<0) {
			JOptionPane.showMessageDialog(null, "Valores Inválidos, reescreva os valores novamente");
			min=Integer.parseInt(JOptionPane.showInputDialog("Escreva o valor em minutos"));
		}
		total= total + (min*60);
		
		seg=Integer.parseInt(JOptionPane.showInputDialog("Escreva o valor em segundos"));
		while (seg<0) {
			JOptionPane.showMessageDialog(null, "Valores Inválidos, reescreva os valores novamente");
			seg=Integer.parseInt(JOptionPane.showInputDialog("Escreva o valor em segundos"));
		}
		total= total + seg;
		
		JOptionPane.showMessageDialog(null, "Este é o seu total de segundos: " +total);
		}

	
	}
