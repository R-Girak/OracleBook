package Chapter03;

/**
 * Created by Gerka on 11-Mar-18.
 */
public class Ch03_028_ContToLabel {
    public static void main(String[] args) {
        outerloop:
        for (int i = 1; i < 10; i++) {
            System.out.print("\nOuter counter: " + i + ", Inner counter: ");
            for (int j = 1; j < 10; j++) {
                if (j == 5) continue outerloop;
                System.out.print(j + " ");
            }
        }
    }
}
