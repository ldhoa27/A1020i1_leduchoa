package stack_queue.baitap;

import java.util.Arrays;
import java.util.Stack;

public class DaoNguoc {
    public static void main(String[] args) {

        //dao nguoc phan tu mang
        int [] arr = {1, 2, 3, 4, 5, 6};
        Stack<Integer> integerStack = new Stack<>();
            for(int i= 0; i < arr.length; i++){
                integerStack.push(arr[i]);
            }
            for(int j =0;!integerStack.isEmpty(); j++){
                arr[j] = integerStack.pop();
            }
        System.out.println(Arrays.toString(arr));

            //dao nguoc chuoi
        String chuoi="Hello World";
        Stack<Character> stack = new Stack<Character>();
        char[] reverseString = new char[chuoi.length()];
        for (int i = 0; i < chuoi.length(); i++) {
            stack.push(chuoi.charAt(i));
        }
        int i=0;
        while (!stack.isEmpty()) {
            reverseString[i++] = stack.pop();
        }
        System.out.println(reverseString);



    }
}
