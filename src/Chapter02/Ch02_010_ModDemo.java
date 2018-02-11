package Chapter02;

/**
 * Created by Gerka on 11-Feb-18.
 */
public class Ch02_010_ModDemo {
    // Демонстрация использования операции %
    public static void main(String[] args) {
        int iresult, irem;
        double dresult, drem;

        iresult = 10/3;
        irem = 10%3;

        dresult = 10.0/3.0;
        drem = 10.0%3.0;

        System.out.println("Результат и остаток от деления 10 / 3 int : " + iresult + " " + irem);
        System.out.println("Результат и остаток от деления 10 / 3 double : " + dresult + " " + drem);
    }
}
