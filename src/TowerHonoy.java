import java.util.Scanner;

/**
 * Created by Leha on 26.06.2016.
 */
public class TowerHonoy {
    public static void Hanoy(int N, char A, char B, char C) {
        if (N > 0) {
            Hanoy(N - 1, A, C, B);
            System.out.println("Снять диск со стержня " + A + " на стержень " + C);
            Hanoy(N - 1, B, A, C);
            return;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите сколько дисков: ");
        int n = scanner.nextInt();
        Hanoy(n, 'A', 'B', 'C');
    }
}
