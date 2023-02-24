package lista01;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contadora=0;
		double[][]semana = new double [6][4];
		double totalM[]= new double[6], totalS=0;
		DecimalFormat df = new DecimalFormat ("0.00");		
		for (int l=0; l<6; l++) {
			for (int c=0; c<4; c++) {
			semana[l][c]=Double.parseDouble(JOptionPane.showInputDialog("Quanto foi vendido na semana "+(c+1)+"º do mês "+(l+1)+" ?"));
			totalM[l]= totalM[l] + semana[l][c];
			}
			totalS= totalS + totalM[l];
		}
		
		for (contadora=0; contadora<6; contadora++) {
			JOptionPane.showMessageDialog(null, "O total vendido no "+(contadora+1)+"º mês foi de: "+df.format(totalM[contadora]));
			
		}
		
		JOptionPane.showMessageDialog(null, "Total vendido no semestre:"+ df.format(totalS));

	}

}
