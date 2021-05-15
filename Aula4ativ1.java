import java.util.Scanner;
public class Aula4ativ1 {
public static void main(String[] args) {
    op1();
    op2();
    op3();
}
    public static void op1 () {
        Scanner s = new Scanner(System.in);
        int numb1 = s.nextInt() % 2;
        int numb2 = s.nextInt() % 2;
        int numb3 = s.nextInt() % 2;
        int numb4 = s.nextInt() % 2;
        int numb5 = s.nextInt() % 2;
        String mult = "múltiplo de 2";
       
        if (numb1 == 0) {
            System.out.println("Numero 1 é " + mult);
        }
        if (numb2 == 0) {
            System.out.println("Numero 2 é " + mult);
        } 
        if (numb3 == 0) {
            System.out.println("Numero 3 é " + mult);
        } 
        if (numb4 == 0) {
            System.out.println("Numero 4 é " + mult);
        } 
        if (numb5 == 0) {
            System.out.println("Numero 5 é " + mult);
        }
        System.out.println("Fim !");
        s.close();
    }


    public static void op2 () {

        Scanner s = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {

            int numb = s.nextInt();

            if (numb % 2 == 0) {
                System.out.println("O " + i + "° número ( " + numb + " ) é múltiplo de 2");
            } else {
                System.out.println("O " + i + "° número ( " + numb + " ) não é múltiplo de 2");
            }
        }
        s.close();

    }

    public static void op3 () {
        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        Boolean hipo = a < b + c;
        Boolean cat1 = b < a + c;
        Boolean cat2 = c < a + b;

        if (hipo && cat1 && cat2 == true) {
            System.out.println("Tringulo: Completo " + true);
        }else if (hipo == false) {
            System.out.println("Tringulo: " + hipo + " Valor A menor que B + C ");
        }else if (cat1 == false) {
            System.out.println("Tringulo: " + cat1 + " Valor B menor que A + C ");
        }else {
            System.out.println("Tringulo: " + cat2 + " Valor C menor que A + B ");
        }
        s.close();
    }

 
}
