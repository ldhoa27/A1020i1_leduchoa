package arrays.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        int [] arr = {10, 4, 5, 7, 8, 6};
        Scanner sc = new Scanner(System.in);
        int index;
        System.out.println("Nhập số phần tử muốn xóa: ");
        index = sc.nextInt();
       int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == index){
                count ++;
            }
        }
        int[] arrNew = new int[arr.length - count];
        int j = 0;
        for(int i = 0; i < arr.length; i++){
                if(arr[i] == index){
                    continue;
                }
                arr[arr.length-1] = 0;
                arrNew[j] = arr[i];
                j++;
        }
        System.out.println("mảng có các phần tử:" + Arrays.toString(arrNew));
    }
}
