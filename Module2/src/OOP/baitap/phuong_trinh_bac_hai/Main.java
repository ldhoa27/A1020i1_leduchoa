package OOP.baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap vao a : ");
        double a = input.nextDouble();
        System.out.print("Nhap vao b : ");
        double b = input.nextDouble();
        System.out.print("Nhap vao c : ");
        double c = input.nextDouble();

        System.out.printf("Phuong trinh vua nhap la : %-3.1fx^2+%-3.1fx+%-3.1f=0\n",a,b,c);

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        if(a==0){
            System.out.print("Khong phai phuong trinh bac 2");
        } else {
            double discriminant = quadraticEquation.getDiscriminant();
            if (discriminant<0){
                System.out.print("Phuong trinh vo nghiem");
            } else if (discriminant == 0) {
                System.out.print("Phuong trinh co nghiem kep la : " + quadraticEquation.get2SameRoot());
            } else {
                System.out.println("Phuong trinh co 2 nghiem phan biet");
                System.out.printf("Nghiem 1 = %-4.1f",quadraticEquation.getRoot1());
                System.out.printf("Nghiem 2 = %-4.1f",quadraticEquation.getRoot2());
            }
        }
    }
}
