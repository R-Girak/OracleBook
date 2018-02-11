package Chapter02;

/**
 * Created by Gerka on 11-Feb-18.
 */
public class Ch02_012_SCops {
    // Демонстрация использования укороченых логических операций
    public static void main(String[] args) {
        int n, d, q;

        n = 10;
        d = 2;
        if (d != 0 && (n%d)==0) System.out.println(d + " является делителем " + n);

        d = 0;
        if (d != 0 && (n%d)==0) System.out.println(d + " является делителем " + n); // does not calculate /0 - no exception

        if (d != 0 & (n%d)==0) System.out.println(d + " является делителем " + n); // throws an exception
    }
}
