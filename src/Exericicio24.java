package Atividade02;



import javax.swing.JOptionPane;

public class Exericicio24 {

	public static void main(String[] args) {
		
		String data = JOptionPane.showInputDialog("Informe uma data no formado abaixo." + "\n" +" 00/00/00");
		
		String mes = data.substring (4,5);
		String ano = data.substring (6,8);
		
		String dia = null;
		String completo = "A data de hoje é: " + data + "\n " + "O dia de hoje é: " + dia + "\n " + "O mês é : " + mes + "\n " + "O ano é: " + "20" +ano;  
		
		JOptionPane.showMessageDialog(null, completo);


	}

}


