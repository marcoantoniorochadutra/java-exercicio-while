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
			

			String nome = JOptionPane.showInputDialog("Informe o nome do " + contador + ("� funcion�rio."));
			salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o s�lario do funcion�rio?"));
			
			lista = lista + "O salar�io de " + nome + " � " + salario + "\n";
			
			soma = soma + salario;
		

					


				

			continua = JOptionPane.showInputDialog("Adicionar mais um funcion�rio? S/N ").toUpperCase().charAt(0);

		}
		media = soma / contador;
				

		JOptionPane.showMessageDialog(null, lista + "\n" + "-----" + "\n" + "\n" + "A m�dia dos sal�rios �: " + media );

	}

}
