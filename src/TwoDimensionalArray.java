/**
 * Created by Leha on 26.06.2016.
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] mas = new int[8][5];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) (Math.random() * 90) + 10;
                System.out.print(mas[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
