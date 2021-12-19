package Atividade01;

import javax.swing.JOptionPane;

public class Exericicio7 {
	
	public static void main(String[] args) {
		
		char continua = 'S';
		int contador = 0;

		String lista = "Lista de número.\n"; 

		while (continua == 'S') {
			contador = contador + 1;
			

			int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o números inteiros maiores que 0."));
			lista = lista + numero + "\n";

			

					


				

			continua = JOptionPane.showInputDialog("Adicionar mais um número? S/N ").toUpperCase().charAt(0);

		}
				

		JOptionPane.showMessageDialog(null, lista);

	}

}
		


