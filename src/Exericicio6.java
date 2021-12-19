package Atividade01;

import javax.swing.JOptionPane;

public class Exericicio6 {
	public static void main(String[] args) {
		
		
		String nomeMaior = "";
		char continua = 'S';
		int contador = 0;
		double mediaMaior = 0;
		
	


		while (continua == 'S') {
			contador = contador + 1;
			

			String nome = JOptionPane.showInputDialog("Informe o nome do aluno.");
			double media = Double.parseDouble(JOptionPane.showInputDialog("Qual a média do aluno?"));
			
			if (media > mediaMaior) {
				mediaMaior = media;
				nomeMaior = nome;
			}
			
			
		
					


				

			continua = JOptionPane.showInputDialog("Adicionar mais um funcionário? S/N ").toUpperCase().charAt(0);

		}
				

		JOptionPane.showMessageDialog(null, "O aluno com a maior média é " + nomeMaior + " com a média de: " + mediaMaior);
	}

}
