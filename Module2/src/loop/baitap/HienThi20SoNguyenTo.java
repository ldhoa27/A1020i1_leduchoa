package loop.baitap;

import java.util.Scanner;

public class HienThi20SoNguyenTo {
    static boolean isPrimeNumber(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        int count = 0;
        int i =1;

        while (true) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
                count++;
            }
            if (count == n) {
                break;
            }
            i++;
        }
    }
}
