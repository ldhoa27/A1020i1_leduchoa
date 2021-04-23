package exception.thuchanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {
        ArrayExample examArr = new ArrayExample();
        int[] arr = examArr.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("vui long nhap phan tu bat ki trong mang:");
        int x = scanner.nextInt();
        try{
            System.out.println("Gia tri cua phan tu co vi tri 5" + x + "la" + arr[x] );
        }catch (IndexOutOfBoundsException e){
            System.err.println("Chi so vua nhap vuot qua gia tri cua mang");
        }

    }
}
