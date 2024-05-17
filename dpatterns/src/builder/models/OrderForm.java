package builder.models;

public class OrderForm extends Form {
    private String address;
    private String notMandatoryField;

    public String getAddress() {
        return this.address != null ? this.address : "undefined";
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNotMandatoryField() {
        return "\nYou dont need to use all attributes";
    }

    public void setNotMandatoryField(String notMandatoryField) {
        this.notMandatoryField = notMandatoryField;
    }

    @Override
    public void render() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "\n\nName: " + this.getName() + "\nAddress: " + this.getEmail()
                + "\nAddress: " + this.getAddress() + this.getNotMandatoryField();
    }
}
