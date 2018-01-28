package Chapter02;

/**
 * Created by Gerka on 28-Jan-18.
 */
public class Ch02_004_BoolDemo {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b is equal to " + b);
        b = true;
        System.out.println("b is equal to " + b);

        if (b) System.out.println("This text is shown");
        b = false;
        if (b) System.out.println("This text is not shown");

        System.out.println("10 > 9 : " + (10 > 9));
    }
}
