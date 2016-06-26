import java.util.Scanner;

/**
 * Created by Leha on 26.06.2016.
 */
public class SumUpToN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Введите число: ");
        n = scanner.nextInt();
        System.out.print("Сумма от 1 до " + n + " = " + sum(n));
    }
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }
}
