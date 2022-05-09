package br.com.fiap;

import javax.swing.JOptionPane;

public class UsaAdicao {
	public static void main(String[] args) {
		Adicao ad1 = new Adicao();
		String aux, escolha = "sim";
		int tipo;
		while (escolha.equalsIgnoreCase(escolha)) {
			try {
				aux = JOptionPane.showInputDialog("Deseja fazer a soma com "
						+ "qual tipo?" + "\n(1) N�meros Inteiros"
						+ "\n(2) N�meros Reais");
				tipo = Integer.parseInt(aux);
				
				switch (tipo) {
				// Adi��o com n�meros inteiros
				case 1:
					aux = JOptionPane.showInputDialog("Digite o valor do 1� n�mero");
					int num1 = Integer.parseInt(aux);
					aux = JOptionPane.showInputDialog("Digite o valor do 2� n�mero");
					int num2 = Integer.parseInt(aux);
					ad1.somaNumeros(num1, num2);
					break;
					
				// Adi��o com n�meros reais	
				case 2:
					aux = JOptionPane.showInputDialog("Digite o valor do 1� n�mero");
					int numr1 = Integer.parseInt(aux);
					aux = JOptionPane.showInputDialog("Digite o valor do 2� n�mero");
					int numr2 = Integer.parseInt(aux);
					ad1.somaNumeros(numr1, numr2);
					break;

				default:
					throw new Exception("Op��o Inv�lida!");
				}
				
				escolha = JOptionPane.showInputDialog("Deseja continuar?");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "Fim do Programa! at� breve!");
		
	}
}
