package introduction_java.thuc_hanh;

import java.util.Scanner;

public class bai_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("enter a year:");
        year = sc.nextInt();
        boolean isLeapYear = false;

        boolean isDivibleBy4 = year%4==0;
        if(isDivibleBy4){
            boolean isDivisbleBy100 = year%100 ==0;
            if(isDivisbleBy100){
                boolean isDivisbleBy400 = year%400 ==0;
                if(isDivisbleBy400){
                    isLeapYear=true;
                }
            }else {
                isLeapYear = true;
            }
        }
        if(isLeapYear){
            System.out.printf("%d is a leap year", year);
        }else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}
