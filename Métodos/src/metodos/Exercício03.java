package metodos;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercício03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double compraTotal=0;
		
		compraTotal=valorTotal();
		desconto(compraTotal);

	}

	public static double valorTotal() {
		double compraTotal=0;
		compraTotal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total da compra"));
		while (compraTotal <= 0) {
			erroWhile();
			compraTotal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total da compra"));
		}
		return compraTotal;
	}
	public static void erroWhile() {
		JOptionPane.showMessageDialog(null, "Valor de compra inválido!");
	}
	public static void desconto (double compraTotal) {
		DecimalFormat df = new DecimalFormat("0.00");
		if (compraTotal<=100) {
			JOptionPane.showMessageDialog(null, "Sem desconto, valor total da compra: "+ df.format(compraTotal));
		}else if (compraTotal<=200) {
		  compraTotal=compraTotal*0.80;
		  JOptionPane.showMessageDialog(null, "O valor da compra tem 20% de desconto, valor total da compra: "+ df.format(compraTotal));
		}else {
			compraTotal=compraTotal*0.70;
			JOptionPane.showMessageDialog(null, "O valor da compra tem 30% de desconto, valor total da compra: "+ df.format(compraTotal));
		}
		
	}

}
