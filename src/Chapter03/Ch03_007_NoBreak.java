package Chapter03;

/**
 * Created by Gerka on 25-Feb-18.
 */
public class Ch03_007_NoBreak {
    // Switch with no break demo
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("i less than 1");
                case 1:
                    System.out.println("i less than 2");
                case 2:
                    System.out.println("i less than 3");
                case 3:
                    System.out.println("i less than 4");
                case 4:
                    System.out.println("i less than 5");
            }
            System.out.println();
        }
    }
}
