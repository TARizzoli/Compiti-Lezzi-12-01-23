import java.util.Scanner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            System.out.println("Scrivi qualcosa!");
            Scanner sc = new Scanner(System.in);
            String word = sc.nextLine();
            sc.close();
            String drow = "";

            int counter = 0;
            for (int i = word.length() - 1; i >= 0; i--) {
                drow += word.charAt(i);
            }
            System.out.print(drow);
        }
    }