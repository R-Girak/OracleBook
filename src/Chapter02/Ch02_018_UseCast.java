package Chapter02;

/**
 * Created by Gerka on 18-Feb-18.
 */
public class Ch02_018_UseCast {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 5; i++) {
            System.out.println(i + " / 3: " + i/3);
            System.out.println(i + " / 3 (double): " + (double) i/3);
            System.out.println();
        }
    }
}
