package arrays.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size1, size2;
        System.out.print("nhap do dai mang 1: ");
        size1 = input.nextInt();
        int[] array1 = new int[size1];
        nhapMang(size1, array1);
        System.out.print("nhap do dai mang 2: ");
        size2 = input.nextInt();
        int[] array2 = new int[size2];
        nhapMang(size2, array2);
        System.out.print("mang 1:");
        System.out.println(Arrays.toString(array1));
        System.out.print("mang 2:");
        System.out.println(Arrays.toString(array2));
        int[] array3 = Arrays.copyOf(array1, (size1 + size2));
        int j = 0;
        for (int i = size1; i < array3.length; i++) {
            array3[i] = array2[j];
            j++;
        }
        System.out.print("mang 3:");
        System.out.println(Arrays.toString(array3));
    }

    public static void nhapMang(int size, int[] arr) {
        Scanner input = new Scanner(System.in);
        int val;
        for (int i = 0; i < size; i++) {
            System.out.println("them phan tu vao mang");
            val = input.nextInt();
            arr[i] = val;
        }
    }
}
