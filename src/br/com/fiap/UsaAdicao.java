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
						+ "qual tipo?" + "\n(1) Números Inteiros"
						+ "\n(2) Números Reais");
				tipo = Integer.parseInt(aux);
				
				switch (tipo) {
				// Adição com números inteiros
				case 1:
					aux = JOptionPane.showInputDialog("Digite o valor do 1° número");
					int num1 = Integer.parseInt(aux);
					aux = JOptionPane.showInputDialog("Digite o valor do 2° número");
					int num2 = Integer.parseInt(aux);
					ad1.somaNumeros(num1, num2);
					break;
					
				// Adição com números reais	
				case 2:
					aux = JOptionPane.showInputDialog("Digite o valor do 1° número");
					int numr1 = Integer.parseInt(aux);
					aux = JOptionPane.showInputDialog("Digite o valor do 2° número");
					int numr2 = Integer.parseInt(aux);
					ad1.somaNumeros(numr1, numr2);
					break;

				default:
					throw new Exception("Opção Inválida!");
				}
				
				escolha = JOptionPane.showInputDialog("Deseja continuar?");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "Fim do Programa! até breve!");
		
	}
}
