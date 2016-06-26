/**
 * Created by Leha on 26.06.2016.
 */
public class DigitalClock {
    public static void main(String[] args) {
        int b = 0;
        for (int h = 1; h < 25; h++) {
            for (int m = 0; m < 60; m++) {
                if (h / 10 % 10 == m % 10 & h % 10 == m / 10 % 10) {
                    b++;
                }
            }
        }
        System.out.println(b + " совпадений");
    }
}
