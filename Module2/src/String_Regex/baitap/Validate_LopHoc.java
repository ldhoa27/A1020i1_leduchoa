package String_Regex.baitap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate_LopHoc {
    public static final String FORMAT_NAME_CLASS = "^[CAP]\\d{4}[G-M]$";

    public static boolean valiclass(String string){
        Pattern pattern = Pattern.compile(FORMAT_NAME_CLASS);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên class:");
        String className = scanner.nextLine();
        System.out.println(valiclass(className));
    }
}
