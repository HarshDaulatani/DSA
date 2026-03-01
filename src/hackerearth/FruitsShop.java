package hackerearth;

import java.util.Scanner;

public class FruitsShop{

    public static int fruitShop(int a, int b, int p,
                                int m, int ca, int cb, int cp) {

        int count = 0;

        for (int i = 0; i < 3; i++) {

            if (a <= b && a <= p) {
                int buy = Math.min(ca, m / a);
                count += buy;
                m -= buy * a;
                ca = 0;
                a = Integer.MAX_VALUE;
            }
            else if (b <= a && b <= p) {
                int buy = Math.min(cb, m / b);
                count += buy;
                m -= buy * b;
                cb = 0;
                b = Integer.MAX_VALUE;
            }
            else {
                int buy = Math.min(cp, m / p);
                count += buy;
                m -= buy * p;
                cp = 0;
                p = Integer.MAX_VALUE;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = sc.nextInt();

        int ca = sc.nextInt();
        int cb = sc.nextInt();
        int cp = sc.nextInt();

        int m = sc.nextInt();

        System.out.println(fruitShop(a, b, p, m, ca, cb, cp));
    }
}