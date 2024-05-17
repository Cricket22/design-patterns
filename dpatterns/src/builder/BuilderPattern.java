package builder;

import builder.builders.OrderFormBuilder;
import builder.builders.SignInFormBuilder;
import builder.models.Form;
import builder.models.OrderForm;
import builder.models.SignInForm;
import factory.factories.AirplaneFactory;
import factory.factories.VehicleFactory;
import factory.models.Vehicle;

public class BuilderPattern {
    public void example1(){
        SignInFormBuilder signInFormBuilder = new SignInFormBuilder();
        SignInForm signInForm = signInFormBuilder.setName("Jhon")
                .setEmail("example@example.com")
                .setPassword("***").build();
        signInForm.render();
    }

    public void example2(){
        OrderFormBuilder orderFormFormBuilder = new OrderFormBuilder();
        OrderForm orderForm = orderFormFormBuilder.setName("Jhon")
                .setEmail("example@example.com")
                .setAddress("example")
                .build();
        orderForm.render();
    }
}
