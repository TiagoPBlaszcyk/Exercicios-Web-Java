
import java.util.Scanner;

public class Aula5ativ2 {

	private static Scanner leitor;

	public static void main(String[] args) {

		long numero = Math.round(Math.random() * 10);
		leitor = new Scanner(System.in);
		System.out.println("Digite um número entre 1 e 10");
		long chute = leitor.nextLong();

			for ( ; numero != chute ; ) {
					System.out.println("Digite um número entre 1 e 10");
					chute = leitor.nextLong();
			}

		System.out.println("Você acertou!");
	}
}
