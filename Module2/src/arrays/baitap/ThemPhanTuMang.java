package arrays.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1, 2, 3, 5, 6};
        System.out.println("mảng cũ là:");
        System.out.println(Arrays.toString(array));
        System.out.println("phần tử muốn thêm vào:");
        int element = input.nextInt();
        System.out.println("vị trí thêm:");
        int index = input.nextInt();
        System.out.println("mảng mới là:");
        System.out.println(Arrays.toString(themPhanTu(array, index, element)));
    }

    private static int[] themPhanTu(int[] arr, int index, int val){
        int[] arrNew = new int[arr.length+1];
        for(int i =0; i <= arr.length; i++){
            arrNew[i] = (i < index ? arr[i] : (i == index ? val : arr[i-1]));

            }
        return arrNew;
        }
    }

