package Chapter03;

/**
 * Created by Gerka on 25-Feb-18.
 */
public class Ch03_002_Guess {
    // Guessing a number game
    public static void main(String[] args)
            throws java.io.IOException {

        char ch, answer = 'S';

        System.out.println("There's a letter in A-Z range.");
        System.out.print("Try to guss which one: ");

        ch = (char) System.in.read();

        if (ch == answer) {
            System.out.println("Exactly!!");
        }
    }
}
