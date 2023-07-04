package catalogoDeFilmeAlura;

import java.util.Scanner;

public class LeituraDeDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu filme preferido.");
		String filme = sc.nextLine();
		System.out.println("Qual o ano de lançamento?");
		int anoLancamento = sc.nextInt();
		System.out.println("Diga sua avaliação para o filme.");
		double avaliacao = sc.nextDouble();

		System.out.println(filme);
		System.out.println(anoLancamento);
		System.out.println(avaliacao);

	}

}
