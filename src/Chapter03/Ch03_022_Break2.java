package Chapter03;

/**
 * Created by Gerka on 11-Mar-18.
 */
public class Ch03_022_Break2 {
    public static void main(String[] args) throws java.io.IOException {
        char ch;

        for (;;) {
            ch = (char) System.in.read();
            if (ch == 'q') break;
        }
        System.out.println("You've entered q");
    }
}
