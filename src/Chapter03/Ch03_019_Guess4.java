package Chapter03;

/**
 * Created by Gerka on 11-Mar-18.
 */
public class Ch03_019_Guess4 {
    public static void main(String[] args)
            throws java.io.IOException {

        char ch, ignore, answer = 'S';

        do {
            System.out.println("There's a letter in A-Z range.");
            System.out.print("Try to guss which one: ");

            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) {
                System.out.println("Exactly!!");
            } else {
                System.out.println("Sorry, not this one(");
                if (ch < answer) {
                    System.out.println("Closer to the end");
                } else {
                    System.out.println("Closer to the beginning");
                }
            }
        } while (answer != ch);
    }
}
