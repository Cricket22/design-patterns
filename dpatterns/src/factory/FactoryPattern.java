package factory;

import factory.factories.AirplaneFactory;
import factory.factories.CarFactory;
import factory.factories.VehicleFactory;
import factory.models.Airplane;
import factory.models.Vehicle;

public class FactoryPattern {
    public void example1(){
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.getVehicle();
        car.render();
    }

    public void example2(){
        VehicleFactory airplaneFactory = new AirplaneFactory();
        Airplane airplane = (Airplane) airplaneFactory.getVehicle();
        airplane.render();
    }
}
