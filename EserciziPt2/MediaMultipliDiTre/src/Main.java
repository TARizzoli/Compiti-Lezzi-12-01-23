import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Quanti numeri si vogliono inserire?");
        Scanner scanner = new Scanner(System.in);
        double N = scanner.nextInt();
        double sum = 0;
        int counter = 0;
        int counterdiv = 0;
        do {
            System.out.println("Inserisci il prossimo numero.");
            int num = scanner.nextInt();
            if(num % 3 == 0) {
                sum += num;
                counterdiv++;
            }
            counter++;
        }while(counter < N);

        scanner.close();
        System.out.println("La media di tutti i numeri divisibili per 3 vale: " + (sum/counterdiv));
    }
}