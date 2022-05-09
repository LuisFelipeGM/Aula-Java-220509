package br.com.fiap;

import javax.swing.JOptionPane;

public class UsaGeometria {
	public static void main(String[] args) {
		Geometria geo1 = new Geometria();
		String aux, escolha = "sim";
		int area;
		
		while (escolha.equalsIgnoreCase("sim")) {
			try {
				aux = JOptionPane.showInputDialog("Deseja calcular qual área?"
						+ "\n(1) Quadrado"
						+ "\n(2) Retângulo"
						+ "\n(3) Círculo");
				area = Integer.parseInt(aux);
				
				switch (area) {
				// Área do Quadrado
				case 1:
					aux = JOptionPane.showInputDialog("Digite o valor do lado: ");
					float lado1 = Float.parseFloat(aux);
					geo1.calculaArea(lado1);
					break;
					
				// Área do Retagulo	
				case 2:
					aux = JOptionPane.showInputDialog("Digite o valor do lado: ");
					float lado2 = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Digite o valor da altura: ");
					float altura = Float.parseFloat(aux);
					geo1.calculaArea(lado2, altura);
					break;
					
				// Área do Quadrado
				case 3:
					aux = JOptionPane.showInputDialog("Digite o valor do raio: ");
					double raio = Double.parseDouble(aux);
					geo1.calculaArea(raio);
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
