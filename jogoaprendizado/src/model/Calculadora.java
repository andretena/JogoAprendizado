package model;

import java.util.Random;

public class Calculadora {
	private int dificuldade;
	private int valor1;
	private int valor2;
	private int valor3;
	private int valor4;
	private int operacao;
	private int resultado;

	// Construtor
	public Calculadora(int dificuldade) {

		Random random = new Random();

		this.operacao = random.nextInt(3); // 0 - Somar, 1 Subtrair, 2 Multiplicar,
		this.dificuldade = dificuldade;

		if (dificuldade == 1) {
			// Facil
			this.valor1 = random.nextInt(25); // Valor aleatorio entre 0 a 9;
			this.valor2 = random.nextInt(25); // == == == == ;
			this.valor3 = random.nextInt(25); // valor aleatorio entre 0 a 9;
			this.valor4 = random.nextInt(25); // == == == == ;

		} else if (dificuldade == 2) {
			// Medio
			this.valor1 = random.nextInt(50); // Valor aleatorio entre 0 a 49;
			this.valor2 = random.nextInt(50); // == == == == ;
			this.valor3 = random.nextInt(50); // valor aleatorio entre 0 a 49;
			this.valor4 = random.nextInt(50); // == == == == ;

		} else if (dificuldade == 3) {
			// Dificil
			this.valor1 = random.nextInt(100); // Valor aleatorio entre 0 a 99;
			this.valor2 = random.nextInt(100); // == == == == ;
			this.valor3 = random.nextInt(100); // valor aleatorio entre 0 a 99;
			this.valor4 = random.nextInt(100); // == == == == ;

		} else if (dificuldade == 4) {
			// Extremo
			this.valor1 = random.nextInt(10000); // Valor aleatorio entre 0 a 9999;
			this.valor2 = random.nextInt(10000); // == == == == ;
			this.valor3 = random.nextInt(10000); // valor aleatorio entre 0 a 9999;
			this.valor4 = random.nextInt(10000); // == == == == ;
		} else {
			// bronca
			System.out.println(" Valores entre 1 e 4 seu relaxado...");

		}
	}

	// gets
	public int getDificuldade() {
		return dificuldade;
	}

	public int getValor1() {
		return valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public int getValor3() {
		return valor3;
	}

	public int getValor4() {
		return valor4;
	}

	public int getOperacao() {
		return operacao;
	}

	public int getResultado() {
		return resultado;
	}

	public String toString() {
		String op;
		if (this.getOperacao() == 0) {
			op = "Somar";
		} else if (this.getOperacao() == 1) {
			op = "Subtrair";
		} else if (this.getOperacao() == 2) {
			op = "Multiplicar";
		} else {
			op = "Operacao Desconhecida";
		}
		return "Valor1: " + this.getValor1() + "\nValor2: " + this.getValor2() + "\nValor3: " + this.getValor3()
				+ "\nValor4: " + this.getValor4() + "\nDificuldade: " + this.getDificuldade() + "\nOperacao: " + op;

	}

	// Somar
	public boolean somar(int resposta) {
		this.resultado = this.getValor1() + this.getValor2() + this.getValor3() + this.getValor4();
		boolean correto = false;

		if (resposta == this.getResultado()) {
			System.out.println("Resposta Certa! ");
			correto = true;
		} else {
			System.out.println("Errooouuuu, Resposta errada.");
		}
		System.out.println(this.getValor1() + " + " + this.getValor2() + " + " + this.getValor3() + " + "
				+ this.getValor4() + " = " + this.getResultado());
		return correto;
	}

	// subtrair
	public boolean subtrair(int resposta) {
		this.resultado = this.getValor1() - this.getValor2() - this.getValor3() - this.getValor4();
		boolean correto = false;

		if (resposta == this.getResultado()) {
			System.out.println("Resposta Certa! ");
			correto = true;
		} else {
			System.out.println("Errooouuuu, Resposta errada.");
		}
		System.out.println(this.getValor1() + " - " + this.getValor2() + " - " + this.getValor3() + " - "
				+ this.getValor4() + " = " + this.getResultado());
		return correto;
	}

	// multiplicar
	public boolean multiplicar(int resposta) {
		this.resultado = this.getValor1() * this.getValor2() * this.getValor3() * this.getValor4();
		boolean correto = false;

		if (resposta == this.getResultado()) {
			System.out.println("Resposta Certa! ");
			correto = true;
		} else {
			System.out.println("Errooouuuu, Resposta errada.");
		}
		System.out.println(this.getValor1() + " * " + this.getValor2() + " * " + this.getValor3() + " * "
				+ this.getValor4() + " = " + this.getResultado());
		return correto;
	}

}
