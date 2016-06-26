import java.util.Scanner;

/**
 * Created by Leha on 26.06.2016.
 */
public class PrimeNumbers {
    public static void main(String args[]) {

        System.out.print("Enter the value: ");
        Scanner scr = new Scanner(System.in);
        int end = scr.nextInt();

        for (int start = 2; start < end; start++) {
            findPrimeNumbers(start, start - 1);
        }

    }

    private static void findPrimeNumbers(int start, int end) {

        if (end == 1) {
            System.out.println(start);
        }

        if (start % end == 0) {
            return;
        }

        findPrimeNumbers(start, end - 1);

    }
}
