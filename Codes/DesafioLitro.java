// Desafio da DIO bootcamp Anyware Solucionando desafios matemáticos em Java

import java.util.Scanner;
import java.util.Locale;
class DesafioLitro{
	public static void main(String[] args){

        Locale.setDefault(new Locale("en", "US"));

		Scanner scan = new Scanner(System.in);
        int horas = scan.nextInt();
        int velocidade = scan.nextInt();
        
        
        System.out.printf("%.3f\n", (horas * velocidade)/12.0);
        scan.close();
	}
}