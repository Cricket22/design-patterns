package singleton;

import factory.factories.AirplaneFactory;
import factory.factories.CarFactory;
import factory.factories.VehicleFactory;
import factory.models.Airplane;
import factory.models.Vehicle;
import singleton.models.EaggerSingleton;
import singleton.models.LazzySingleton;

public class SingletonPattern {

    public void example1(){
        EaggerSingleton.getInstance().whoAmI();
    }

    public void example2(){
        LazzySingleton.getInstance().whoAmI();
        LazzySingleton.getInstance().whoAmI();
    }
}
