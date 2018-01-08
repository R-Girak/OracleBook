package Chapter01;

/**
 * Created by Gerka on 08-Jan-18.
 */
public class Ch01_010_InchesToMetres {

    // Программа перевода дюймов в метры

    public static void main(String[] args) {
        double inches, metres;
        int counter;

        counter = 0;
        for (inches = 1; inches < 37; inches++) {
            metres = inches * 39.37;
            System.out.println(inches + " of inches is equal to " + metres + " metres");
            counter++ ;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
