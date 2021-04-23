package introduction_java.thuc_hanh;

import java.util.Scanner;

public class bai_4 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        double a, b, c;
        System.out.println("a :");
        a = sc.nextDouble();
        System.out.println("b :");
        b = sc.nextDouble();
        System.out.println("c :");
        c = sc.nextDouble();
        if(a!=0){
            double answer = (c -b) / a;
            System.out.println("phuong trinh co nghiem x = %f!\n" + answer);
        } else {
            if(b == 0){
                System.out.println("phuong trinh co vo so nghiem x!");
            }
            else{
                System.out.println("pt vo nghiem");
            }
        }
    }

}
