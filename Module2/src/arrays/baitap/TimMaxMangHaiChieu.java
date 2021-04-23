package arrays.baitap;

import java.util.Scanner;

public class TimMaxMangHaiChieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size1;
        int size2;

        System.out.print("nhập kích thước 1: ");
        size1 = input.nextInt();

        System.out.print("nhập kích thước 2: ");
        size2 = input.nextInt();

        int[][] array = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.printf("nhập phần tử thứ [%d][%d] : ",i,j);
                array[i][j] = input.nextInt();
            }
        }

        System.out.println("mảng nhập vào là : ");
        displayArray(array);

        int[] maxPosition = findMax(array);
        int maxRow = maxPosition[0];
        int maxCol = maxPosition[1];

        System.out.printf("giá trị max trong mảng là %d, tai vi tri array[%d][%d]",array[maxRow][maxCol],maxRow,maxCol);
    }

    public static void displayArray (int[][]array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[] findMax (int[][]array){
        int[] maxPosition = {0,0};
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (max<array[i][j]){
                    max = array[i][j];
                    maxPosition[0] = i;
                    maxPosition[1] = j;
                }
            }
        }
        return maxPosition;
    }
}
