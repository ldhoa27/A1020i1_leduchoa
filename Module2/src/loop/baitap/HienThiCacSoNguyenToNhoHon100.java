package loop.baitap;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main (String[] args)
    {
        int n =2;
        boolean check;
        int count = 0;
        while (n < 20) {
            check = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(n + " ");
                count++;
            }
            n++;
        }
    }
}

