import builder.BuilderPattern;
import factory.FactoryPattern;

public class Main {
    public static void main(String[] args) {
        FactoryPattern factoryPattern = new FactoryPattern();
        factoryPattern.example1();
        factoryPattern.example2();

        BuilderPattern builderPattern = new BuilderPattern();
        builderPattern.example1();
        builderPattern.example2();
    }
}