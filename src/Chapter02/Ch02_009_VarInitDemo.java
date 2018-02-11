package Chapter02;

/**
 * Created by Gerka on 11-Feb-18.
 */
public class Ch02_009_VarInitDemo {
    // Демонстрация времени жизни переменной
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++) {
            int y = -1;
            System.out.println("y: " + y);
            y = 100;
            System.out.println("New value of y: " + y);
        }
    }
}
