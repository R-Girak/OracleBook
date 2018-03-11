package Chapter03;

/**
 * Created by Gerka on 11-Mar-18.
 */
public class Ch03_018_DWDemo {
    public static void main(String[] args) throws java.io.IOException {
        char ch;

        do {
            System.out.print("Type a key, then <ENTER>: ");
            ch = (char) System.in.read();
        } while (ch != 'q');
    }
}
