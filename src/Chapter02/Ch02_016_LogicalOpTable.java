package Chapter02;

/**
 * Created by Gerka on 18-Feb-18.
 */
public class Ch02_016_LogicalOpTable {
    public static void main(String[] args) {
        boolean p, q;

        System.out.println("P\t " + " Q\t " + "   AND\t " + " OR\t" + "XOR\t" + "  NOT");

        p = true; q = true;
        System.out.print(p + "  " + q + "  ");
        System.out.print((p&q) + "  " + (p|q) + "  ");
        System.out.println((p^q) + " " + (!p));

        p = true; q = false;
        System.out.print(p + "  " + q + " ");
        System.out.print((p&q) + " " + (p|q) + "  ");
        System.out.println((p^q) + "  " + (!p));

        p = false; q = false;
        System.out.print(p + " " + q + " ");
        System.out.print((p&q) + " " + (p|q) + " ");
        System.out.println((p^q) + " " + (!p));

        p = false; q = false;
        System.out.print(p + " " + q + " ");
        System.out.print((p&q) + " " + (p|q) + " ");
        System.out.println((p^q) + " " + (!p));
    }
}
