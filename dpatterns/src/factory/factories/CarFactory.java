package factory.factories;

import factory.models.Car;

public class CarFactory implements VehicleFactory {
    @Override
    public Car getVehicle() {
        return new Car("Ibiza", "Seat", 3);
    }
}
