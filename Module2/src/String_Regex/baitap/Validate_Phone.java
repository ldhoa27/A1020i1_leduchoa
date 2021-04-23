package String_Regex.baitap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate_Phone {
    public static final String FOMAT_PHONE = "^[(][\\d]{2}[)]-[(]0[\\d]{9}[)]$";

    public static boolean valiphone(String string){
        Pattern pattern = Pattern.compile(FOMAT_PHONE);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phone:");
        String phone = scanner.nextLine();
        System.out.println(valiphone(phone));
    }
}
