package access_modifier_static_method_static_property.baitap;

import java.util.Scanner;

public class TestCircle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập bán kính hình tròn:");
        double radius = input.nextDouble();
        input.nextLine();

        System.out.println("nhập mà sắc hình tròn:");
        String color = input.nextLine();

        Circle circle =new Circle(radius, color);
        System.out.printf("Hinh tron co ban kinh '%-3.1f', mau '%s'\n", circle.getRadius(), color);
        System.out.printf("Dien tich hinh tron la %-5.2f", circle.getArea());

    }
}
