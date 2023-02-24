package lista01;

import javax.swing.JOptionPane;
import java.util.Random;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero[] = new int[10], 
		contadora = 0, 
		valor = 0;
		boolean validadora = false;

	//	Random gerador = new Random();
		
		for (contadora = 0; contadora < 10; contadora++) {
	
			
		//	System.out.println(gerador.nextInt(100));
		//	numero[contadora] = gerador.nextInt(100);
			numero[contadora] = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero na posição:" + (contadora+1) ));
			
			
		}
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro qualquer"));
		//while (valor < 0) {
		//	JOptionPane.showMessageDialog(null, "Valor inválido!");
			//valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro qualquer"));
		//}

		for (contadora = 0; contadora < 10; contadora++) {
			
			if (numero[contadora]== valor) {
				validadora = true;
				JOptionPane.showMessageDialog(null, "O seu número esta na posição " + contadora);
				
			}
		}
		
		
		if (validadora == false) {
			JOptionPane.showMessageDialog(null, "O seu número não foi encontrado!");
		}

	}

}
