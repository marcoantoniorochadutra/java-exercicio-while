package Atividade01;

import javax.swing.JOptionPane;

public class Exericicio1 {
	public static void main(String[] args) {

		char continua = 'S';
		char sexo;
		int contador1 = 0, contador2 = 0;
		double idadem, idadef, soma = 0, soma2 = 0, media, media2;
		String lista = "Lista de pessoas \n";

		while (continua == 'S') {

			String nome = JOptionPane.showInputDialog("Qual seu nome?");
			lista = lista + nome + " tem ";
			sexo = JOptionPane.showInputDialog("Qual seu sexo?" + "\n M ou F").toUpperCase().charAt(0);
			{
				if (sexo == 'M') {
					idadem = Integer.parseInt(JOptionPane.showInputDialog("Idade?"));
					lista = lista + idadem + " Anos" + " (M)" + "\n";
					soma = soma + idadem;
					contador1 = contador1 + 1;

				} else if (sexo == 'F') {
					idadef = Integer.parseInt(JOptionPane.showInputDialog("Idade?"));
					soma2 = soma2 + idadef;
					lista = lista + idadef + " Anos" + " (F)" + "\n";
					contador2 = contador2 + 1;
				}

			}

			continua = JOptionPane.showInputDialog("Mais números? S/N ").toUpperCase().charAt(0);

		}
		media = soma / contador1;
		media2 = soma2 / contador2;

		JOptionPane.showMessageDialog(null, lista + "\n" + media + "\n" + media2 + "\n");

	}

}
