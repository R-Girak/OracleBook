package Chapter01;

/**
 * Created by Gerka on 08-Jan-18.
 */
public class Ch01_009_MoonGravity {
    public static void main(String[] args) {

        // Сила тяжести на Луне составляет около 17% земной.
        // Напишите программу, которая вычислила бы ваш вес на Луне

        int weightOnEarth;
        double weightOnMoon;

        weightOnEarth = 99;
        System.out.println("Weight On Earth: " + weightOnEarth);

        weightOnMoon = weightOnEarth * 0.17;
        System.out.println("Weight On Moon: " + weightOnMoon);

    }
}
