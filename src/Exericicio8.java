package Atividade01;

import javax.swing.JOptionPane;

public class Exericicio8 {
	public static void main(String[] args) {
		
		char continua = 'S';
		int contador = 0;
	

		String lista = "Lista de alunos e suas provas.\n";
		String notas = "";


		while (continua == 'S') {
			contador = contador + 1;
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
			for(int i = 0; i < 3; i++) {
				double nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (i +1) + "º do aluno"));
				notas =  notas + nota + " | ";

				
			} 
			
			lista = lista + nome + " tirou as seguintes notas: " + notas + "\n" + "---------------" + "\n";
			notas = "";




			continua = JOptionPane.showInputDialog("Adicionar mais um número? S/N ").toUpperCase().charAt(0);

		}
				

		JOptionPane.showMessageDialog(null, lista);

	}

}
		