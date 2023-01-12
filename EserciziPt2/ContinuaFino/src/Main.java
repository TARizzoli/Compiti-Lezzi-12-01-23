import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci una sequenza di interi.");

        int num = 0;
        int sum = 0;

        do {
            num = sc.nextInt();
            if(!(num < 0 && num % 2 == 0 || num > 0 && num % 3 == 0))
                sum += num;

        }while (!(num < 0 && num % 2 == 0 || num > 0 && num % 3 == 0));
        System.out.println("La somma vale: " + sum);
    }
}