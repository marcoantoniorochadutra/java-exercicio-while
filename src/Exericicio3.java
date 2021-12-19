package Atividade01;

import javax.swing.JOptionPane;

public class Exericicio3 {
	public static void main(String[] args) {
		
		char continua = 'S';
		int potencia = 1;
		int contador = 0;
	



		int x = Integer.parseInt(JOptionPane.showInputDialog("Qual a base para elevar?"));

		
		while (continua == 'S') {
			contador = contador + 1;
			potencia = potencia * x;
			
		
			


			continua = JOptionPane.showInputDialog("O número" + x + " será elevado há " + contador + " Você quer continuar elevando ele? \n S ou N? ").toUpperCase().charAt(0);

		}


		JOptionPane.showMessageDialog(null, "A resultado da potencia é:  " + potencia );

		
	}

}
