package Chapter03;

/**
 * Created by Gerka on 11-Mar-18.
 */
public class Ch03_031_Task01 {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        int spaceCounter = 0;

        System.out.print("Type anything and press <ENTER>: ");
        do {
            ch = (char) System.in.read();
            if (ch == ' ') spaceCounter++;
        } while (ch != '.');
        System.out.println("Number of spaces: " + spaceCounter);
    }
}
