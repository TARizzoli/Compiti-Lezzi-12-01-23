import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Inserire una serie di numeri interi, termina con il numero 0.");
        Scanner scan = new Scanner(System.in);
        int number = 0;
        int number2 = 0;
        int counter = 0;

        do {
            System.out.println("Prossimo numero:");
            number = scan.nextInt();

            if (counter > 0 && number2 + number < number2) {
                System.out.println("OK");
                break;
            }
            else{
                System.out.println("NO");
                number2 = number;
                counter++;
                continue;
            }
        } while (number != 0);

    }
}