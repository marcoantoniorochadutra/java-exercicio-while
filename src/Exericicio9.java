package Atividade01;

import javax.swing.JOptionPane;

public class Exericicio9 {
	public static void main(String[] args) {
		System.out.println( "Marco" 
				+ '"'
	
				);
		

		char continua = 'S';
		int contador = 0;
		double media = 0, soma = 0;
		int conta = 0, contre = 0, contrep = 0;

		String lista = "Lista de alunos e seu status escolar.\n";

		while (continua == 'S') {
			contador = contador + 1;
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
			for (int i = 0; i < 3; i++) {
				double nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (i + 1) + "º do aluno"));
				soma = soma + nota;
				

			}
			media = soma / 3;
			if (media >= 7.0) {
				String apr = "Aprovado";
				conta = conta + 1;
				lista = lista + nome + " teve uma média de: : " + media + " | " + apr + "\n";

			} else if (media >= 2.0 && media < 7) {
				String rec = "Recuperação";
				contre = contre + 1;
				lista = lista + nome + " teve uma média de: : " + media + " | " + rec + "\n";
			} else if (media < 2.0) {
				String rep = "Reprovado";
				contrep = contrep + 1;
				lista = lista + nome + " teve uma média de: : " + media + " | " + rep + "\n";
			}
			soma = 0;
			media = 0;



			continua = JOptionPane.showInputDialog("Adicionar mais um número? S/N ").toUpperCase().charAt(0);

		}
		lista = lista + "\n" +"---"+ "\n"+ "Foram aprovados: " + conta + "\n" + "Ficaram em recuperação " + contre + "\n"
				+ "Foram reprovados: " + contrep + "\n";

		JOptionPane.showMessageDialog(null, lista);

	}

}
