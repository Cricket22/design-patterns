package builder;

import builder.builders.OrderFormBuilder;
import builder.builders.SignInFormBuilder;
import builder.models.OrderForm;
import builder.models.SignInForm;

public class BuilderPattern {

    public BuilderPattern() {
        System.out.println("\n\n*** Builder pattern. ***");
    }

    public void example1(){
        System.out.println("\n* Example 1. *");

        SignInFormBuilder signInFormBuilder = new SignInFormBuilder();
        SignInForm signInForm = signInFormBuilder.setName("Jhon")
                .setEmail("example@example.com")
                .setPassword("***").build();
        signInForm.render();
    }

    public void example2(){
        System.out.println("\n* Example 2. *");

        OrderFormBuilder orderFormFormBuilder = new OrderFormBuilder();
        OrderForm orderForm = orderFormFormBuilder.setName("Jhon")
                .setEmail("example@example.com")
                .setAddress("example")
                .build();
        orderForm.render();
    }
}
