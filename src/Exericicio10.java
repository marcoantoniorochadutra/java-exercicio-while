package Atividade02;

import javax.swing.JOptionPane;

public class Exericicio10 {
	public static void main(String[] args) {

		char continua = 'S';
		double salario = 0;
		String lista = "Lista de funcionários  \n";

		while (continua == 'S') {
			String nome = JOptionPane.showInputDialog("Qual o nome do funcionário?");
			salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o salário do funcionário?"));

			if (salario < 1000) {
				salario = salario * 1.40;

			} else if (salario >= 1000 && salario <= 3000) {
				salario = salario * 1.30;

			} else if (salario > 3000) {
				salario = salario * 1.20;

			}
			lista = lista + nome + " Após o reajuste no salário ficou com o salaário de: " + salario + "\n" ;

			

			continua = JOptionPane.showInputDialog("Mais números? S/N ").toUpperCase().charAt(0);
			salario = 0;

		}

		JOptionPane.showMessageDialog(null, lista);

	}

}
