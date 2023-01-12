import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una frase!");
        String frase = scanner.nextLine();
        System.out.println("Inserisci la parola che vuoi cercare.");
        String parola = scanner.nextLine();

        String[] parole = frase.split(" ");

        boolean check = false;
        for (String s : parole) {
            if (s.equals(parola)) {
                check = true;
                break;
            }
        }

        if(check)
            System.out.println("La parola è presente nella frase.");
        else
            System.out.println("La parola non è presente nella frase.");
    }
}