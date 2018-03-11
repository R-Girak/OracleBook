package Chapter03;

/**
 * Created by Gerka on 11-Mar-18.
 */
public class Ch03_016_ForVar {
    public static void main(String[] args) {
        int sum = 0, fact = 1;

        for (int i = 1; i <= 5; i++) {
            sum += i;
            fact *= i;
        }

        System.out.println("Summ: " + sum);
        System.out.println("Factorial: " + fact);
    }
}
