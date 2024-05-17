package factory.models;

public class Car extends Vehicle {
    private Integer numberOfDoors;

    public Car(String model, String trademark, Integer numberOfDoors) {
        super(model, trademark, "terrain");
        this.numberOfDoors = numberOfDoors;
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

    public String getNumberOfDoors(){
        return "I've got " + this.numberOfDoors + " doors.";
    }

    @Override
    public String toString() {
        return "\n\nModel: " + this.model + "\nTrademark: " + this.trademark
                + "\nType: " + this.type + "\nNumber of doors: " + this.numberOfDoors;
    }
}
