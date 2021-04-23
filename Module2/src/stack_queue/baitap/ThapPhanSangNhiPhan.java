package stack_queue.baitap;

import java.util.Scanner;
import java.util.Stack;

public class ThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> integerStack = new Stack<>();
        System.out.println("Enter demical number:");
        int num = sc.nextInt();
        while (num >0){
            int a = num % 2;
            integerStack.push(a);
            num/=2;
        }
        while(!integerStack.isEmpty()){
            System.out.println(integerStack.pop());
        }
    }
}
