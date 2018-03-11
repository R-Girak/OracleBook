package Chapter03;

/**
 * Created by Gerka on 11-Mar-18.
 */
public class Ch03_025_Break5 {
    public static void main(String[] args) {

        done:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(k + " ");
                    if (k == 5) break done;
                }
                System.out.println("After k");
            }
            System.out.println("After j");
        }
        System.out.println("After i");
    }
}
