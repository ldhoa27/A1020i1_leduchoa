package OOP.thuchanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap vao chieu dai : ");
        double height = input.nextDouble();

        System.out.print("Nhap vao chieu rong : ");
        double width = input.nextDouble();

        Rectangle rec = new Rectangle(width,height);

        double recArea = rec.getArea();
        double recPer = rec.getPerimeter();

        rec.display(width,height,recArea,recPer);
    }
}
