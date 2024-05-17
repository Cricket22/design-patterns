import adapter.AdapterPattern;
import builder.BuilderPattern;
import factory.FactoryPattern;
import singleton.SingletonPattern;

public class Main {
    public static void main(String[] args) {
        FactoryPattern factoryPattern = new FactoryPattern();
        factoryPattern.example1();
        factoryPattern.example2();

        BuilderPattern builderPattern = new BuilderPattern();
        builderPattern.example1();
        builderPattern.example2();

        SingletonPattern singletonPattern = new SingletonPattern();
        singletonPattern.example1();
        singletonPattern.example2();

        AdapterPattern adapterPattern = new AdapterPattern();
        adapterPattern.example1();
    }
}