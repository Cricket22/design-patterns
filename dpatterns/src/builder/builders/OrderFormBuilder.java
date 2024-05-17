package builder.builders;

import builder.models.OrderForm;

public class OrderFormBuilder implements FormBuilder {
    private OrderForm orderForm;

    public OrderFormBuilder(){
        this.orderForm = new OrderForm();
    }

    @Override
    public OrderFormBuilder setName(String name) {
        orderForm.setName(name);
        return this;
    }

    @Override
    public OrderFormBuilder setEmail(String email) {
        orderForm.setEmail(email);
        return this;
    }

    public OrderFormBuilder setAddress(String address){
        orderForm.setAddress(address);
        return this;
    }

    public OrderFormBuilder setNotMandatoryField(String notMandatoryField){
        orderForm.setNotMandatoryField(notMandatoryField);
        return this;
    }

    @Override
    public OrderForm build() {
        return this.orderForm;
    }
}
