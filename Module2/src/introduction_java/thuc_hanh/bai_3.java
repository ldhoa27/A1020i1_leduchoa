package introduction_java.thuc_hanh;

import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args) {
        float wigth;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        wigth = sc.nextFloat();
        System.out.println("Enter height:");
        height = sc.nextFloat();
        float area = wigth * height;
        System.out.println("area is:" + area);
    }
}
