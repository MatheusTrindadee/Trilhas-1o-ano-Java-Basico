package lista01;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0, contadoraPar=0, contadoraImpar=0, somaPar=0, somaImpar=0;
		
		for (int contadora=0; contadora<10; contadora++) {
			numero=Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(contadora+1)+"º número"));
			if (numero%2==0) {
				contadoraPar= contadoraPar+1;
				somaPar= somaPar + numero;
				//System.out.println("valor de somaPar:" + somaPar); //print faz com que apareça no console
			}else {
				contadoraImpar= contadoraImpar+1;
				somaImpar=somaImpar + numero;
			}
		}
		JOptionPane.showMessageDialog(null, "A soma dos seus números pares é: "+somaPar);
		JOptionPane.showMessageDialog(null, "A soma dos seus números impares é: "+somaImpar);
		JOptionPane.showMessageDialog(null, "A quantidade de números  impares é: "+contadoraImpar);
		JOptionPane.showMessageDialog(null, "A quantidade de números pares é: "+contadoraPar);

	}

}
