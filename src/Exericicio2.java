package Atividade01;

import javax.swing.JOptionPane;

public class Exericicio2 {
	
	public static void main(String[] args) {
		
		char continua = 'S';
		int contador = 0;
		double media, soma = 0, calculo = 0;


		while (continua == 'S') {
			contador = contador + 1;
			
			calculo = Integer.parseInt(JOptionPane.showInputDialog("Adicionar um n�mero para a soma."));
			soma = soma + calculo;
			


			continua = JOptionPane.showInputDialog("Mais n�meros? S/N ").toUpperCase().charAt(0);

		}
		media = soma / contador;

		JOptionPane.showMessageDialog(null, "A m�dia dos valores informados �: " + media );

	}

}