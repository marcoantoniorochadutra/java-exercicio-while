package Atividade02;

import javax.swing.JOptionPane;

public class Exericicio13 {

	public static void main(String[] args) {

		char continua = 'S';

		String result = "";
		String saque = "";
		String deposito = "";
		int saques = 0;
		int depositos = 0;
		int saquesedepositos = 0;
		
		int filas = Integer.parseInt(JOptionPane.showInputDialog("Quantas filas existem no banco?"));
		
		for(int i = 0; i < filas; i++) {
		while (continua == 'S') {
			
		
			String nome = JOptionPane.showInputDialog("Qual seu nome?");
			char op = JOptionPane.showInputDialog("Qual a operação você quer fazer? \n D = Deposito \n S = Saque")
					.toUpperCase().charAt(0);
			if (op == 'S') {
				int b = Integer.parseInt(JOptionPane.showInputDialog("Qual o dinheiro a ser sacado?"));
				saques = saques + 1;
				saque = saque + nome + op + "\n";
				result = result + nome + " Sacou: " + b + " Reais" + "\n";

			} else if (op == 'D') {
				depositos = depositos + 1;
				deposito = deposito + nome + op + "\n";
				int a = Integer.parseInt(JOptionPane.showInputDialog("Qual o dinheiro a ser depositado?"));
				result = result + nome + " Depositou: " + a + " Reais" + "\n";

			}
			continua = JOptionPane.showInputDialog("Mais operações foram feitas? S/N ").toUpperCase().charAt(0);

			saquesedepositos = saques + depositos;

		}
		JOptionPane.showMessageDialog(null,
				"Total de saques e depositos feitos " + saquesedepositos + "\n" + "Saques feitos: " + saques + "\n"
						+ "Depositos feitos: " + depositos + "\n"  + "---" + "\n" +  "Histórico de transações" + "\n" + "---" + "\n" + result);
	}

}}
