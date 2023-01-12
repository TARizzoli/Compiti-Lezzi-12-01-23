package Funzioni;

import java.util.Scanner;

public class Functions {
    public static int somma(int[] a){
        int sum = 0;
        for (int num : a)
            sum += num;
        return sum;
    }
    public static boolean cercaElemento(int[]a, int el){
        boolean check = false;
        for (int num : a){
            if(num == el) {
                check = true;
                break;
            }
            else
                check = false;
        }
        return check;
    }
    public static int contaRipetuti(int[] a, int el){
        int rep = 0;
        for (int num : a){
            if(num == el) {
                rep++;
            }
        }
        if (rep == 0)
            System.out.println("Il numero non si ripete.");
        return rep;
    }
    public static int[] reverseArray(int[] a) {
        int[] b = new int[a.length];
        int counter = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            b[counter] = a[i];
            counter++;
        }
        return b;
    }

    //Più corretto per la consegna.
    public static void stampaInverso(){
        int[] a = new int[10];
        System.out.println("Inserisci i 10 elementi.");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Prossimo elemento:");
            a[i] = sc.nextInt();
        }
        sc.close();
        int[] b = new int[10];
        int counter = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            b[counter] = a[i];
            counter++;
        }
        for(int num : b)
            System.out.print(b[num]);
    }
    public static int[] inserisciArray(){

        int[] a = new int[10];
        System.out.println("Inserisci i 10 elementi.");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Prossimo elemento:");
            a[i] = sc.nextInt();
        }
        sc.close();

        int[] b = new int[10];
        int counter = 0;
        for (int i = 9; i >= 0; i--) {
            b[counter] = a[i];
            counter++;
        }
        for(int num : b)
            System.out.print(num);
        return b;
    }
    public static void stampaAlterni(int[] a){
        System.out.println("Gli alterni sono: ");
        for (int i = 0; i < a.length; i += 2) {
            System.out.print(a[i] + " ");
        }
    }
    public static void stampaPositivi(int[] a){
        System.out.println("I positivi sono: ");
        for (int i = 0; i < a.length; i++)
            if(a[i] > 0)
                System.out.print(a[i] + " ");
    }
}
