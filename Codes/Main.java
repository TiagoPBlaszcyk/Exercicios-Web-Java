import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;
        String exit = "";
        num = s.nextInt();
        while (num != 0) {
            for (int i = 1; i <= num; i++) {
                exit = exit.concat(" " + Integer.toString(i));
            }
            exit = exit.substring(1);
            System.out.println(exit);
            exit = "";
            num = s.nextInt();
        }
        s.close();
    }      
}
 
