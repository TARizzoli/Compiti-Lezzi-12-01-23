import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Quanti caratteri si vogliono inserire?");
            int num = sc.nextInt() - 1;

            sc.nextLine();

            do {
                System.out.println("Prossimo carattere: ");
                char a = sc.next().charAt(0);
                System.out.println("Il carattere è: " + a);
                num--;

            }while (num >= 0);
            sc.nextLine();
        }
    }
}