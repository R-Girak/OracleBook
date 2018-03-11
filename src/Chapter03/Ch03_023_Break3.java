package Chapter03;

/**
 * Created by Gerka on 11-Mar-18.
 */
public class Ch03_023_Break3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("External counter: " + i);
            System.out.print("    Internal counter: ");

            int t = 0;
            while (t < 100) {
                if (t == 10) break;
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("End");
    }
}
