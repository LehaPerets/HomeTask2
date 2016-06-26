/**
 * Created by Leha on 26.06.2016.
 */
public class FirstElevenNumbers {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int fib = 2;
        int n = 11;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(" " + fib);
        }

    }
}
