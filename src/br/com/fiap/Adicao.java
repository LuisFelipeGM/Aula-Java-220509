package br.com.fiap;

import javax.swing.JOptionPane;

public class Adicao {
	int numInteiro1, numInteiro2;
	double numReal1, numReal2;

	public Adicao() {
	}

	public int getNumInteiro1() {
		return numInteiro1;
	}

	public void setNumInteiro1(int numInteiro1) {
		this.numInteiro1 = numInteiro1;
	}

	public int getNumInteiro2() {
		return numInteiro2;
	}

	public void setNumInteiro2(int numInteiro2) {
		this.numInteiro2 = numInteiro2;
	}

	public double getNumReal1() {
		return numReal1;
	}

	public void setNumReal1(double numReal1) {
		this.numReal1 = numReal1;
	}

	public double getNumReal2() {
		return numReal2;
	}

	public void setNumReal2(double numReal2) {
		this.numReal2 = numReal2;
	}
	
	public void somaNumeros(int numInteiro1, int numInteiro2) {
		setNumInteiro1(numInteiro1);
		setNumInteiro2(numInteiro2);
		int soma = this.numInteiro1 + this.numInteiro2;
		JOptionPane.showMessageDialog(null, "O primeiro número é: " + numInteiro1
				+ "\nO segundo número é: " + numInteiro2 + "\nA soma é de: " + soma
				+ "\nFoi escolhido o tipo Inteiro");
		
	}
	
	public void somaNumeros(double numReal1, double numReal2) {
		setNumReal1(numReal1);
		setNumReal2(numReal2);
		double soma = this.numReal1 + this.numReal2;
		JOptionPane.showMessageDialog(null, "O primeiro número é: " + numReal1
				+ "\nO segundo número é: " + numReal2 + "\nA soma é de: " + soma
				+ "\nFoi escolhido o tipo Real");
				
	}

}
