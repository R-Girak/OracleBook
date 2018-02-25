package Chapter03;

/**
 * Created by Gerka on 25-Feb-18.
 */
public class Ch03_001_KbIn {
    // Reading from Keyboard
    public static void main(String[] args)
        throws java.io.IOException {

        char ch;
        System.out.print("Type any symbol and click Enter: ");
        ch = (char) System.in.read();
        System.out.println("You've entered " + ch);
    }
}
