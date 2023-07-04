package catalogoDeFilmeAlura;

public class Condicional {

	public static void main(String[] args) {
		
		int anoDeLancamento = 2022;
		boolean incluidoNoPlano = false;
		double notaDoFilme = 8.1;
		String tipoPlano = "plus";
		
		if (anoDeLancamento >= 2022) {
			System.out.println("Lançamento que os clientes estão curtindo!");
		} else {
			System.out.println("Filme retrô que vale a pena de assistir!"); 
		}
		
		if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
			System.out.println("Filme liberado.");
		} else {
			System.out.println("Deve paga a locação.");
		}
		
		if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
			System.out.println("Filme liberado.");
		} else {
			System.out.println("Deve paga a locação.");
		}
	}

}
