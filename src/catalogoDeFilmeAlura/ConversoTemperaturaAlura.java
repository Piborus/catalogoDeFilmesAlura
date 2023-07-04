package catalogoDeFilmeAlura;

import java.util.Scanner;

public class ConversoTemperaturaAlura {

	public static void main(String[] args) {

		System.out.println("Converso de Celsius para Fahrenheit.");
		Scanner sc = new Scanner(System.in);

		System.out.println("\nDigite a temperatura em Celsius");
		double celsius = sc.nextDouble();

		double fahrenheit = (celsius * 1.8) + 32;
		System.out.println("Sua temperatura é: " + fahrenheit);
		String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit",
				celsius, fahrenheit);
		System.out.println(mensagem);

		int converso1 = (int) (celsius * 1.8) + 32;
		System.out.println("Sua temperatura é: " + converso1);

	}

}
