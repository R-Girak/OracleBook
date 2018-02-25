package Chapter02;

/**
 * Created by Gerka on 18-Feb-18.
 */
public class Ch02_017_PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b*b;

        b = (byte) (b*b);

        System.out.println("i and b: " + i + " " + b);
    }
}
