package stack_queue.baitap;

import java.util.*;

public class ChuoiPalindrome {
    public static void main(String[] args) {
        String word = "Able was I ere I saw Elba";
        word = word.toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new  LinkedList<>();

        for(int i=0; i< word.length(); i++){
            stack.push(word.charAt(i));
            queue.offer(word.charAt(i));
        }
        boolean isPalindrome = true;
        while (!stack.isEmpty() && !queue.isEmpty()){
            if(stack.pop().charValue() != queue.poll().charValue()){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }

}
