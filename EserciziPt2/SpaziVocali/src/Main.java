import java.util.Scanner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Scrivi una frase!");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();
        int contatore = 0;

        if (word.length() == 0) {
            System.out.println("Non hai scritto niente!");
        }
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ' ')
                contatore++;
        }
        System.out.println("Il numero di spazi vuoti è: " + contatore);
    }
}