package factory.models;

public abstract class Vehicle {
    protected String model;
    protected String trademark;
    protected String type;

    public Vehicle(String model, String trademark, String type){
        this.model = model;
        this.trademark = trademark;
        this.type = type;
    }

    public abstract String getType();

    public abstract String getModel();

    public abstract String getTrademark();

    public abstract void render();
}
