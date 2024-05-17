package factory.models;

public class Airplane extends Vehicle {
    private Integer numberOfPassengers;

    public Airplane(String model, String trademark, Integer numberOfPassengers) {
        super(  model, trademark, "aerial");
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getTrademark() {
        return this.trademark;
    }

    @Override
    public void render() {
        System.out.println(this.toString());
    }

    public String getNumberOfPassengers(){
        return "I've got " + this.numberOfPassengers + "passenger seats.";
    }

    @Override
    public String toString() {
        return "\n\nModel: " + this.model + "\nTrademark: " + this.trademark
                + "\nType: " + this.type + "\nNumber of passengers: " + this.numberOfPassengers;
    }
}
