package br.com.fiap;

import javax.swing.JOptionPane;

public class Geometria {
	private float lado;
	private float altura;
	private double raio;

	// Construtores
	public Geometria() {
	}

	public Geometria(float lado, float altura, double raio) {
		this.lado = lado;
		this.altura = altura;
		this.raio = raio;
	}

	
	// GETTERS e SETTERS
	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	// Métodos
	public void calculaArea(float lado) {
		setLado(lado);
		float area = this.lado * this.lado;
		JOptionPane.showMessageDialog(null, "Área do Quadrado: " + area);
		
	}
	
	public void calculaArea(float lado, float altura) {
		setLado(lado);
		setAltura(altura);
		float area = this.lado * this.altura;
		JOptionPane.showMessageDialog(null, "Área do Retângulo: " + area);
	}
	
	public void calculaArea(double raio) {
		final double PI = 3.1416;
		setRaio(raio);
		double area = PI * this.raio * this.raio;
		JOptionPane.showMessageDialog(null, "Área do Círculo: " + area);
	}
	
	

}
