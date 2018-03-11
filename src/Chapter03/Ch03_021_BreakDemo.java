package Chapter03;

/**
 * Created by Gerka on 11-Mar-18.
 */
public class Ch03_021_BreakDemo {
    public static void main(String[] args) {
        int num = 100;

        for (int i = 0; i < num; i++) {
            if (i*i >= num) break;
            System.out.println(i + " ");
        }
        System.out.println("End");
    }
}
