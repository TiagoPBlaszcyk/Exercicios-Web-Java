
import java.util.Scanner;

public class Aula4ativ2 {

    public static void main(String[] args) {
        op1();
        op2();
    }

    public static void op1() {
        java.util.Scanner s = new Scanner(System.in);
        int numb = s.nextInt();

        if (numb % 2 == 0) {
            System.out.println("O número " + numb + " é par!");
        } else {
            System.out.println("O número " + numb + " é impar!");
        }

        s.close();
    }

    public static void op2() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome.");
        String nome1 = scan.nextLine();
        System.out.println("Seu nome  " + nome1 + " .");

        System.out.println("Digite sua idade.");
        int idade1 = scan.nextInt();
        System.out.println("Sua idade  " + idade1 + " .");

        System.out.println("Digite seu nome.");
        String nome2 = scan.next();
        System.out.println("Seu nome " + nome2 + " .");

        System.out.println("Digite sua idade.");
        int idade2 = scan.nextInt();
        System.out.println("Sua idade " + idade2 + " .");

        if (idade1 >= idade2) {
            System.out.println(nome1 + " tem " + idade1 + " anos " + "  uma pessoa mais vivida");
        } else {
            System.out.println(nome2 + " tem " + idade2 + " anos " + "  uma pessoa mais vivida");
        }
        scan.close();
    }

}
