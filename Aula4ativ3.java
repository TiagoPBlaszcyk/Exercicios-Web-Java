/*Crie um programa para receber dois números e verificar se eles são iguais ou se um é maior que o outro. 
Imprima uma mensagem indicando se os números são iguais ou, no caso deles serem diferentes, 
imprima o maior valor digitado.
*/
/*
import java.util.Scanner;

public class Aula4ativ3 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        if (a == b) {
            System.out.println("Os números A:" + a + " B:" + b + " são iguais.");
        }else if (a > b) {
            System.out.println("O número A:" + a + " é maior que B:" + b);
        }else {
            System.out.println("O número B:" + b + " é maior que A:" + a);
        }
    }
}
*/
/*
Crie um programa para receber uma nota e imprimir uma mensagem de acordo com a seguinte tabela:
De 0 até 3 – Você precisa melhorar muito!
Maior que 3 e menor que 7 – Você está quase conseguindo!
Maior ou igual a 7 e menor que 9 – Você conseguiu!
Maior ou igual a 9 – Você conseguiu com distinção!
*/
/*
import java.util.Scanner;

public class Aula4ativ3 {

    public static void main(String[] args) {

        Scanner skn = new Scanner(System.in);
        float nota = skn.nextFloat();
        skn.close();

        if(nota >= 0 && nota <= 3) {
            System.out.println("Você precisa melhorar muito!");
        }else if (nota <= 6) {
            System.out.println("Você está quase conseguindo!");
        }else if (nota <= 8) {
            System.out.println("Você conseguiu!");
        }else if (nota >= 9 && nota <= 10) {
            System.out.println("Você conseguiu com distinção!");
        }else {
            System.out.println("Errouuuu!!!!");
        }
        
    }


}
*/

