package sort_algorithm.baitap;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] a = {2, 8, 4, 3, 6};
        InsertionSort(a);
    }

    public static void InsertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            System.out.println("Curent element: " + currentElement);
            int j;
            for (j = i - 1; j >= 0 && array[j] > currentElement; j--) {
                System.out.println("For j: ");
                array[j + 1] = array[j];
                System.out.println(Arrays.toString(array));
            }
            array[j + 1] = currentElement;
            System.out.println("Result " + currentElement + ": ");
            System.out.println(Arrays.toString(array));
        }
    }
    
}
