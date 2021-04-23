package exception.baitap;

import java.util.Scanner;

public class TriangleWithException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double slide1 = 0.0;
        double slide2 = 0.0;
        double slide3 = 0.0;
        System.out.println("side1");
        slide1 = input.nextDouble();
        System.out.println("side2");
        slide2 = input.nextDouble();
        System.out.println("side3");
        slide3 = input.nextDouble();
        try {
            Triangle triangle = new Triangle(slide1,slide2,slide3);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }

    }


}
