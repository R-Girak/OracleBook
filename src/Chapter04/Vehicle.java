package Chapter04;

/**
 * Created by roman.girak on 17/03/2018.
 */
public class Vehicle {
    int passengers; // Количество пассажиров
    int fuelcap;    // Емкость топливного бака
    int mpg;        // Потребления топлива в милях на галлон

    void range() {
        System.out.println("Дальность - " + fuelcap*mpg + " миль.");
    }
}
