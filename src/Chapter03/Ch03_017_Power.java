package Chapter03;

/**
 * Created by Gerka on 11-Mar-18.
 */
public class Ch03_017_Power {
    public static void main(String[] args) {
        int e, result;

        for (int i = 0; i < 10; i++) {
            result = 1;
            e = i;
            while (e > 0) {
                result *= 2;
                e--;
            }
            System.out.println("2 в степени " + i + " равно " + result);
        }
    }
}
