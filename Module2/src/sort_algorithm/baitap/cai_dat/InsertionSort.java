package sort_algorithm.baitap.cai_dat;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];

            int j;
            for (j = i - 1; j >= 0 && array[j] > currentElement; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = currentElement;

        }
    }

    public static void main(String[] args) {
        int[] a = {8, 2, 5, 6, 4};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
