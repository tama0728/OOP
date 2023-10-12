import java.util.Scanner;

public class Homework4 {
    static int gcd_rec(int m, int n){
        if (n == 0) return m;
        if (m % n == 0) return n;
        return gcd_rec(n, m % n);
    }

    static int gcd_loop(int m, int n){
        int tmp;
        while (true) {
            if (n == 0) return m;
            if (m % n == 0) return n;
            m %= n;
            tmp = m;
            m = n;
            n = tmp;
        }

    }
    public static void main(String[] args){
        System.out.println(gcd_rec(40123 * 7, 40123 * 11));
        System.out.println(gcd_loop(40123 * 7, 40123 * 11));
    }
}
