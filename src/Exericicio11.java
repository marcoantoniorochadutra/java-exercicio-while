package Atividade02;

import javax.swing.JOptionPane;

public class Exericicio11 {
	public static void main(String[] args) {

		char continua = 'S';
		char sexo;
		int contador1 = 0, contador2 = 0;
		double idadem, idadef, soma = 0, soma2 = 0, media, media2, idade18 = 0;
		String lista = "Lista de pessoas \n";

		while (continua == 'S') {

			String nome = JOptionPane.showInputDialog("Qual seu nome?");
			lista = lista + nome + " tem ";
			sexo = JOptionPane.showInputDialog("Qual seu sexo?" + "\n M ou F").toUpperCase().charAt(0);
			{
				if (sexo == 'M') {
					idadem = Integer.parseInt(JOptionPane.showInputDialog("Idade?"));
					{
						if (idadem >= 18) {
							idade18 = idade18 + 1;

						}
					}
					lista = lista + idadem + " Anos" + " (M)" + "\n";
					soma = soma + idadem;
					contador1 = contador1 + 1;

				} else if (sexo == 'F') {
					idadef = Integer.parseInt(JOptionPane.showInputDialog("Idade?"));
					{
						if (idadef >= 18) {
							idade18 = idade18 + 1;

						}

					}
					soma2 = soma2 + idadef;
					lista = lista + idadef + " Anos" + " (F)" + "\n";
					contador2 = contador2 + 1;
				}

			}

			continua = JOptionPane.showInputDialog("Adicionar mais pessoas? S/N ").toUpperCase().charAt(0);

		}
		media = soma / contador1;
		media2 = soma2 / contador2;

		JOptionPane.showMessageDialog(null, lista + "\n" + "A média da idade masculina é: " + media + "\n"
				+ "A média da idade feminina é: " + media2 + "\n" + "A empresa tem: " + idade18 + " maiores de idadeExericicio11.java.");

	}

}
