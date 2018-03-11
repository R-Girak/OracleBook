package Chapter03;

/**
 * Created by Gerka on 11-Mar-18.
 */
public class Ch03_009_SqrRoot {
    // Квадратные корни чисел от 1 до 99
    public static void main(String[] args) {
        double num, sroot, rerr;

        for (num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Корень квадратный из " + num + " равен " + sroot);
            // Ошибка округления
            rerr = num - (sroot*sroot);
            System.out.println("Ошибка округления: " + rerr);
            System.out.println();
        }
    }
}
