package view;

import java.util.Scanner;
import model.Calculadora;

public class JogoAprendizado {

	static Scanner input = new Scanner(System.in);
	static int score = 0;
	static Calculadora calculadora;

	public static void main(String[] args) {
		JogoAprendizado.jogar();

	}

	public static void jogar() {
		System.out.println("Informe o nivel de dificuldade. [1, 2, 3, 4] : ");
		int dificuldade = JogoAprendizado.input.nextInt();

		JogoAprendizado.calculadora = new Calculadora(dificuldade);

		System.out.println("Informe o resultado para a opera��o: ");

		// Somar
		if (calculadora.getOperacao() == 0) {
			System.out.println(calculadora.getValor1() + " + " + calculadora.getValor2() + " + "
					+ calculadora.getValor3() + " + " + calculadora.getValor4());
			int resposta = JogoAprendizado.input.nextInt();

			if (calculadora.somar(resposta)) {
				// Ganha 1 ponto.
				JogoAprendizado.score += 1;
				System.out.println("Voc� tem " + JogoAprendizado.score + " pontos. ");
			}
		}

		// Subtrair
		else if (calculadora.getOperacao() == 1) {
			System.out.println(calculadora.getValor1() + " - " + calculadora.getValor2() + " - "
					+ calculadora.getValor3() + " - " + calculadora.getValor4());
			int resposta = JogoAprendizado.input.nextInt();

			if (calculadora.subtrair(resposta)) {
				// Ganha 1 ponto.
				JogoAprendizado.score += 1;
				System.out.println("Voc� tem " + JogoAprendizado.score + " pontos. ");
			}
		}

		// Multiplicar
		else if (calculadora.getOperacao() == 2) {
			System.out.println(calculadora.getValor1() + " * " + calculadora.getValor2() + " * "
					+ calculadora.getValor3() + " * " + calculadora.getValor4());
			int resposta = JogoAprendizado.input.nextInt();

			if (calculadora.multiplicar(resposta)) {
				// Ganha 1 ponto.
				JogoAprendizado.score += 1;
				System.out.println("Voc� tem " + JogoAprendizado.score + " pontos. ");
			}
		}

		else {
			System.out.println(" A opera��o " + calculadora.getOperacao() + " n�o � reconhecida. ");
		}

		System.out.println(" Deseja continuar? [1 - SIM, 0 - N�O] ");
		int continuar = JogoAprendizado.input.nextInt();

		if (continuar == 1) {
			JogoAprendizado.jogar();
		} else {
			System.out.println(" Voc� fez : " + JogoAprendizado.score + " pontos. ");
			System.out.println(
					"At� a proxima! Obrigado por contribuir para o meu aprendizado de desenvolvimento JAVA...");
			System.exit(0);
		}
	}

}
