package loop.thuchanh;

import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter invertment amount");
        money = input.nextDouble();
        System.out.println("enter number of month");
        month = input.nextInt();
        System.out.println("enter annual interest rate in percentage");
        interset_rate = input.nextDouble();
        double total_interset = 0;
        for(int i = 0; i < month; i++){
            total_interset += money * (interset_rate/100)/12 * month;
        }
        System.out.println("total of interset:" + total_interset);
    }
}
