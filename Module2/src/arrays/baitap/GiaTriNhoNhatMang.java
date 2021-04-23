package arrays.baitap;
import java.util.Scanner;

public class GiaTriNhoNhatMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap vao kich thuoc mang : ");
        int size = input.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Nhap vao phan tu thu %d : ", i + 1);
            array[i] = input.nextInt();
        }

        System.out.println("Mang vua nhap la: ");
        for (int i = 0; i < size; i++) {
            System.out.printf(array[i] + "\t");
        }

        System.out.println();

        int min = findMin(array);
        System.out.printf("Phan tu nho nhat trong mang la : %d", min);
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
