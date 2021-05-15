
import java.util.Scanner;
public class Aula5ativ3 {
	public static void main(String[] args) { 
		long numero = Math.round(Math.random() * 10); 
		Scanner leitor = new Scanner(System.in); 
		long chute = -1;
		 
		for ( ;numero != chute; ) { 
			try {
				System.out.println("Digite um número entre 1 e 10"); 
				chute = leitor.nextLong(); 
        	}catch (Error e){
            	leitor.close();
        	}
		} 
		System.out.println("Você acertou!"); 
        leitor.close();
	}
}
