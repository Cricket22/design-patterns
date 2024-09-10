package factory;

import factory.factories.AirplaneFactory;
import factory.factories.CarFactory;
import factory.factories.VehicleFactory;
import factory.models.Airplane;
import factory.models.Vehicle;

public class FactoryPattern {

    public FactoryPattern() {
        System.out.println("\n\n*** Factory pattern. ***");
    }

    public void example1(){
        System.out.println("\n* Example 1. *");

        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.getVehicle();
        car.render();
    }

    public void example2(){
        System.out.println("\n* Example 2. *");

        VehicleFactory airplaneFactory = new AirplaneFactory();
        Airplane airplane = (Airplane) airplaneFactory.getVehicle();
        airplane.render();
    }
}
