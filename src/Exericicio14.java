package Atividade02;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exericicio14 {

	private static DecimalFormat df2 = new DecimalFormat("#.##");

	public static void main(String[] args) {

		char continua = 'S';
		int contador = 0;
		double salariobruto = 0;
		double salarioliquido = 0;
		double desconto = 0;
		double descontototal = 0;
		double salariototal = 0;
		String lista = "Relat�rio da empresa: " + "\n";

		while (continua == 'S') {
			contador = contador + 1;

			String nome = JOptionPane.showInputDialog("Qual o nome do funcion�rio?");
			int dependentes = Integer
					.parseInt(JOptionPane.showInputDialog("Qual o n�mero de dependentes do funcion�rio?"));
			{
				salariobruto = salariobruto + (dependentes * 125.55);

			}
			int horas = Integer.parseInt(JOptionPane.showInputDialog("Quantas horas o funcion�rio trabalha?"));
			{

				salariobruto = salariobruto + (horas * 25);

			}

			salarioliquido = salariobruto - (salariobruto * 0.12);
			desconto = salariobruto - salarioliquido;

			lista = lista + nome + " | " + dependentes + " Dependentes" + " | " + df2.format(salariobruto) + " = de sal�rio bruto"
					+ " | " + df2.format(salarioliquido) + " = de sal�rio liquido" + " | " + "Valor descontado: " + df2.format(desconto) + "\n";

			descontototal = desconto + desconto;
			salariototal = salariobruto + salariobruto;
			
			salariobruto = 0;
			salarioliquido = 0;
			desconto = 0;

			continua = JOptionPane.showInputDialog("Adicionar mais funcion�rios? S/N ").toUpperCase().charAt(0);

		}
		lista = lista + "\n "+ "---"  +" \n " + df2.format(salariototal) + " Dinheiro total gasto de sal�rios " + " | "
				+ " O total descontado dos salarios �" + df2.format(descontototal);

		JOptionPane.showMessageDialog(null, lista);

	}

}
