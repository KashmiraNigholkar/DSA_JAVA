package OOPS.PRset;


class Automobile {
    protected String drive() {
        return "Driving vehicle";
    }
}

class Car extends Automobile {
    @Override
    protected String drive() {
        return "Driving cars";
    }
}

public class ElectricCar extends Car {
    @Override
    public final String drive() {
        return "Driving electric Car";
    }

    public static void main(String[] args) {
        final Car car = new ElectricCar();
        System.out.println(car.drive());  
    }
}

