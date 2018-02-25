package Chapter02;

/**
 * Created by Gerka on 18-Feb-18.
 */
public class Ch02_020_Task11 {
    public static void main(String[] args) {
        // Prime numbers from 2 to 100
        boolean isPrime;
        System.out.print("The prime numbers are: 1, 2, ");

        for (int i = 3; i < 100; i++) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.print(i + ", ");
            }
        }
    }
}
