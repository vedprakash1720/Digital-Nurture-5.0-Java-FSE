// FactoryPatternDemo.java

interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a Car");
    }
}

class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a Bike");
    }
}

class Truck implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a Truck");
    }
}

class VehicleFactory {

    public static Vehicle getVehicle(String type) {

        if (type == null) {
            return null;
        }

        switch (type.toLowerCase()) {
            case "car":
                return new Car();

            case "bike":
                return new Bike();

            case "truck":
                return new Truck();

            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}

public class FactoryPatternDemo {

    public static void main(String[] args) {

        Vehicle v1 = VehicleFactory.getVehicle("car");
        Vehicle v2 = VehicleFactory.getVehicle("bike");
        Vehicle v3 = VehicleFactory.getVehicle("truck");

        v1.drive();
        v2.drive();
        v3.drive();
    }
}

Output:
Driving a Car
Riding a Bike
Driving a Truck