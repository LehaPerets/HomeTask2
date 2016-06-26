import java.util.Scanner;

/**
 * Created by Leha on 26.06.2016.
 */
public class FourthElementFibonacci {
    private static int counter = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер елемента последовательности: ");
        int n = scanner.nextInt();

        System.out.println(fibonachiNumber(n));
    }

    static int fibonachiNumber(int lastNumber) {
        int result;

        if (lastNumber == 1 || lastNumber == 2) {
            return 1;
        } else {
            if (lastNumber == 4) {
                counter++;
            }
            result = fibonachiNumber(lastNumber - 1) + fibonachiNumber(lastNumber - 2);
            return counter;

        }
    }
}
