package builder.models;

public class OrderForm extends Form {
    private String address;

    public String getAddress() {
        return this.address != null ? this.address : "undefined";
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNotMandatoryField() {
        return "\nYou dont need to use all attributes";
    }

    @Override
    public void render() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "\nName: " + this.getName() + "\nAddress: " + this.getEmail()
                + "\nAddress: " + this.getAddress() + this.getNotMandatoryField();
    }
}
