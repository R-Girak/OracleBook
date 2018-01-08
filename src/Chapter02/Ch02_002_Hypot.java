package Chapter02;

/**
 * Created by Gerka on 08-Jan-18.
 */
public class Ch02_002_Hypot {

    // Определение длинны гипотенузы, исходя из длинны катетов, по теореме Пифагора

    public static void main(String[] args) {
        double x, y, z;

        x = 3;
        y = 4;

        z = Math.sqrt(x*x + y*y);

        System.out.println("Длинна гипотенузы: " + z);
    }
}
