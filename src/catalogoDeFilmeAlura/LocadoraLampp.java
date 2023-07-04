package catalogoDeFilmeAlura;

public class LocadoraLampp {

    String categoria = "Terror";
    String transmissao = "Streaming";
    double duracao = 1;

    public static void main(String[] args) {

    	LocadoraLampp movie = new LocadoraLampp();
        System.out.println(movie.categoria);
        System.out.println(movie.transmissao);
        System.out.println(movie.duracao);
    }
}