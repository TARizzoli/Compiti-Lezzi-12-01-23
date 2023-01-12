import Funzioni.Functions;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Inserire i numeri che si volgiono scrivere, finire con un invio a vuoto.");
        Scanner scan = new Scanner(System.in);
        String numbers = "";
        String number = "";
        int counter = 0;

        do {
            System.out.println("Prossimo numero:");
            number = scan.nextLine();
            numbers += number + " ";
            counter++;

        }while (number.length() > 0);

        /*Checks.
        System.out.println(numbers);
        System.out.println(counter - 1);
        */

        int[] nums = new int[counter - 1];
        String[] nmbrs = numbers.split(" ");

        for (int i = 0; i < counter - 1; i++) {
            nums[i] = Integer.parseInt(nmbrs[i]);
        }

        /*Checks.
        for (int num : nums) {
            System.out.print(num + " ");
        }*/

        System.out.println();

        //Sommo.
        System.out.println("La somma vale:");
        int somma = Functions.somma(nums);
        System.out.println(somma);

        //Cerco elemento.
        System.out.println("Inserire un numero per controllare se il \nnumero è presente tra quelli inseriti precedentemente.");
        int elemento = scan.nextInt();
        if(Functions.cercaElemento(nums, elemento))
            System.out.println("Il numero è presente.");
        else
            System.out.println("Il numero non è presente.");

        //elemento si ripete?
        System.out.println("Inserire un numero per controllare quante volte il \nnumero è presente tra quelli inseriti precedentemente.");
        int elemento2 = scan.nextInt();
        int rep = Functions.contaRipetuti(nums, elemento2);
        if (rep > 0 && rep != 1)
            System.out.println("Il numero si ripete " + rep + " volte.");
        if (rep == 1)
            System.out.println("Il numero si ripete " + rep + " volta.");

        scan.nextLine();

        //Stampo al contrario.
        System.out.println("Vuoi invertire i valori messi all'inizio? (Y/N)");
        String n = scan.nextLine();
        if(n.equals("y") || n.equals("Y")) {
            int[] c = Functions.reverseArray(nums);;
            for (int num : c)
                System.out.print(num + " ");
        }

        //Inserisci array. Restituisce un array al contrario.
        System.out.println();
        Functions.inserisciArray();
        System.out.println();
        Functions.stampaAlterni(nums);
        System.out.println();
        Functions.stampaPositivi(nums);
    }

}