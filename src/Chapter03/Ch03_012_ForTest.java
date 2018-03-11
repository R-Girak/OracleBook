package Chapter03;

/**
 * Created by Gerka on 11-Mar-18.
 */
public class Ch03_012_ForTest {
    // Выполнение цикла пока с клавиатуры не будет введена буква S
    public static void main(String[] args)
            throws java.io.IOException {

        int i;
        System.out.println("Для остановки нажмите S");

        for (i = 0; (char) System.in.read() != 'S' ; i++) {
            System.out.println("Проход # " + i);
        }

    }
}
