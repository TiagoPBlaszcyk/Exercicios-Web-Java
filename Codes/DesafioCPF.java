// Tiras os "." e "-" de uma entrada 000.000.000-00 quebrando linha a cada remoção.

import java.util.Scanner;
import java.util.Locale;

public class DesafioCPF{
	public static void main(String[] args) {

		Locale.setDefault(new Locale("en", "US"));

		Scanner sc = new Scanner(System.in);
		
		String cpf = new String();

        //continue a solucao

        cpf = sc.nextLine();
        for (int i = 1; i < cpf.length(); i++) {
           /* if ((cpf.charAt(i) == '.') || (cpf.charAt(i) == '-')) {
                System.out.println();
            }else {
                System.out.print(cpf.charAt(i)); 
            } */
            if (i % 4 != 0) {
                System.out.print(cpf.charAt(i-1)); 
            }else {
                System.out.println();
            }
                
        }
		sc.close();
	}
}
