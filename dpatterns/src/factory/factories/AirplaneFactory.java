package factory.factories;

import factory.models.Airplane;

public class AirplaneFactory implements VehicleFactory {
    @Override
    public Airplane getVehicle() {
        return new Airplane("Airbus", "A380", 100);
    }
}
