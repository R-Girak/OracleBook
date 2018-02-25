package Chapter03;

/**
 * Created by Gerka on 25-Feb-18.
 */
public class Ch03_005_Ladder {
    // if-else-if demo
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 6; x++) {
            if (x == 1)
                System.out.println("x: 1");
            else if (x == 2)
                System.out.println("x: 2");
            else if (x == 3)
                System.out.println("x: 3");
            else if (x == 4)
                System.out.println("x: 4");
            else
                System.out.println("x is out of 1-4 range");
        }
    }
}
