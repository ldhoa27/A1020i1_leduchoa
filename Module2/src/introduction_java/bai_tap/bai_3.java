package introduction_java.bai_tap;
import java.util.Scanner;
public class bai_3 {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền USD: ");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("giá trị VND :" + quydoi);
    }
}
