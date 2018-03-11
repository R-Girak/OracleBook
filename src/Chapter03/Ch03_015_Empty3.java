package Chapter03;

/**
 * Created by Gerka on 11-Mar-18.
 */
public class Ch03_015_Empty3 {
    public static void main(String[] args) {
        int i;
        int sum = 0;

        for (i = 1; i <= 5; sum += i++);
        System.out.println("Sum is: " + sum);
    }
}
