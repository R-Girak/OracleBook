package Chapter01;

/**
 * Created by Gerka on 08-Jan-18.
 */
public class Ch01_008_GalToLitTable {

    // Программа перевода галлонов в литры. V2

    public static void main(String[] args) {
        double gallons, liters;
        int counter;

        counter = 0;
        for (gallons = 1; gallons < 50; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " of gallons is equal to " + liters + " liters");
            counter++ ;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
