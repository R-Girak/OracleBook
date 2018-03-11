package Chapter03;

/**
 * Created by Gerka on 11-Mar-18.
 */
public class Ch03_030_FindFac {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i++) {
            System.out.print("Делители " + i + ": ");
            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
