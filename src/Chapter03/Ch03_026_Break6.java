package Chapter03;

/**
 * Created by Gerka on 11-Mar-18.
 */
public class Ch03_026_Break6 {
    public static void main(String[] args) {
        int x, y;

        stop1:
        //label before for
        for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {
                if (y == 2) break stop1;
                System.out.println("x and y: " + x + " " + y);
            }
        }

        System.out.println();

        for (x = 0; x < 5; x++)
            stop2:{ //label after for
                for (y = 0; y < 5; y++) {
                    if (y == 2) break stop2;
                    System.out.println("x and y: " + x + " " + y);
                }
            }
    }
}
