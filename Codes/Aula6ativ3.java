import java.util.Scanner;

public class Aula6ativ3 {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o tamanho de aznera: ");
        int aznera[] = new int[leitor.nextInt()];

        for (int i = 0; i < aznera.length; i++) {
            try {
                System.out.println("Aznera posicao: " + (i + 1) + ", digite valor: ");
                aznera[i] = leitor.nextInt();
                System.out.println("Aznera armazenada em posição: " + (i + 1) + ", de valor: " + aznera[i] + " \n ");
            } catch (Error e) {
                leitor.close();
            }
        }
        System.out.println("Que canseira! thau brigadu!");
    }
}
