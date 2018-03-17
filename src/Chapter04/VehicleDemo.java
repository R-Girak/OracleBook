package Chapter04;

/**
 * Created by roman.girak on 17/03/2018.
 */
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Минивен может перевезти " + minivan.passengers + " пассажиров на расстояние " + range + " миль");
    }
}
