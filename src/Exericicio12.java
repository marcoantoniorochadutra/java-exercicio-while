package Atividade02;

import javax.swing.JOptionPane;

public class Exericicio12 {
 
	public static void main(String[] args) {
	

		char continua = 'S';
		
		int contador = 0, provas = 0; 

		double media = 0, mediaturma = 0, notas, soma = 0;


		while (continua == 'S') {
			contador = contador + 1;
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno?"); 			
			provas = Integer.parseInt(JOptionPane.showInputDialog("Quantas provas o aluno fez?"));	
			
			for(int i = 0; i < provas; i ++) {
				
				notas = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (i+1)+ "º nota da prova."  ));
				soma = soma + notas;
				media = soma / provas;
		
			}
			mediaturma = media / contador;
			
			
			
		
				
			
			continua = JOptionPane.showInputDialog("Mais números? S/N ").toUpperCase().charAt(0);


			}

		JOptionPane.showMessageDialog(null, "A média total da turma é: " + mediaturma);
		

			
		}

			
}
