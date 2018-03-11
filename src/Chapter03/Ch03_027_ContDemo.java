package Chapter03;

/**
 * Created by Gerka on 11-Mar-18.
 */
public class Ch03_027_ContDemo {
    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++) {
            if (i % 2 != 0) continue;
            System.out.print(i + " ");
        }
    }
}
