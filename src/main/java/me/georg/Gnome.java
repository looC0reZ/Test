package me.georg;
import org.junit.Test;

import java.util.Arrays;

class Gnome {
    @Test
    public static int[] sort (int masSort[]) {
        int i = 1;
        while (i < masSort.length) {
            if (masSort[i-1] <= masSort[i]) {
                i++;
            }
            else {
                int temp = masSort[i-1];
                masSort[i-1] = masSort[i];
                masSort[i] = temp;
                if (i > 1) {
                    i--;
                }
            }

        }
        return masSort;
    }
    public static void main(String[] arg) {
        int mas[] = {-17, -4, 13, 33, 82, 30, 24, 70, -5, 49, 5, -91, -95, -94, 36, -52, 96, -27, 13, -78, -60, -8, 48,
                64, -74, 44, -95, 16, 29, 79, -26, 31, -92, 96, 30, 17, -68, -99, 99, 94, 90, -56, 9, 97, -41, 81, 86,
                -55, 16, -94};
        int sortMas[] = sort(mas);
        String result = Arrays.toString(sortMas);
        System.out.println(result);
    }

}
