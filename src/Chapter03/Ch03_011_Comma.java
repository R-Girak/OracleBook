package Chapter03;

/**
 * Created by Gerka on 11-Mar-18.
 */
public class Ch03_011_Comma {
    // Применение запятых в операторе цикла for
    public static void main(String[] args) {
        int i, j;

        for (i=0, j=10; i < j; i++, j--)
            System.out.println("i & j: " + i + " " + j);
    }
}
