package Chapter01;

/**
 * Created by Gerka on 08-Jan-18.
 */
public class Ch01_005_IfDemo {
    public static void main(String[] args) {
        int a, b, c;
        a = 2;
        b = 3;

        if (a < b) System.out.println("a less than b");
        if (a == b) System.out.println("string that won't be shown");

        System.out.println();

        c = a - b;
        System.out.println("c is equal to -1");
        if (c >= 0) System.out.println("c is greater than 0");
        if (c < 0) System.out.println("c is less than 0");

        System.out.println();

        c = b - a;
        System.out.println("c is equal to 1");
        if (c >= 0) System.out.println("c is greater than 0");
        if (c < 0) System.out.println("c is less than 0");
    }
}
