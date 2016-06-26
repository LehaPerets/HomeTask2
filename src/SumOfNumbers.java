import java.util.Scanner;

/**
 * Created by Leha on 26.06.2016.
 */
public class SumOfNumbers {
    public static void main(String [] args){
        int n;
        int sum = 0;
        System.out.print("Введите число - ");
        Scanner sr = new Scanner(System.in);
        n = sr.nextInt();
        for (int i=0; n != 0; n/=10){
            sum = sum + (n % 10);
        }
        System.out.println("Сумма: " + sum );
    }
}

