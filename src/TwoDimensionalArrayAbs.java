/**
 * Created by Leha on 26.06.2016.
 */
public class TwoDimensionalArrayAbs {
    public static void main(String[] args) {

        int[][] mas = new int[7][4];
        int[] mas1 = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) (Math.random() * 11) - 5;
                System.out.print(mas[i][j] + " ");
                if (j == 0) mas1[i] = mas[i][j];
                else mas1[i] *= mas[i][j];
                if (j == mas[i].length - 1)
                    System.out.println(" ");
            }
        }
        int max = 0, max_i = 0;
        for (int i = 0; i < mas1.length; i++) {
            if (Math.abs(mas1[i]) > max) {
                max = Math.abs(mas1[i]);
                max_i = i;
            }
        }
        System.out.println(" Max произведение по модулю (" + max + ") имеет индекс: " + max_i);
    }
}
