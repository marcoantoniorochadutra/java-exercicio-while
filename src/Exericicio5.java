package Atividade01;

import javax.swing.JOptionPane;

public class Exericicio5 {
	public static void main(String[] args) {
		
		char continua = 'S';
		int contador = 0;
		double salario, soma = 0, media;

		String lista = "Lista de pessoas \n";

		while (continua == 'S') {
			contador = contador + 1;
			

			String nome = JOptionPane.showInputDialog("Informe o nome do " + contador + ("º funcionário."));
			salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o sálario do funcionário?"));
			
			lista = lista + "O salaráio de " + nome + " é " + salario + "\n";
			
			soma = soma + salario;
		

					


				

			continua = JOptionPane.showInputDialog("Adicionar mais um funcionário? S/N ").toUpperCase().charAt(0);

		}
		media = soma / contador;
				

		JOptionPane.showMessageDialog(null, lista + "\n" + "-----" + "\n" + "\n" + "A média dos salários é: " + media );

	}

}
