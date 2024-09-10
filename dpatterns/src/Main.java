import adapter.AdapterPattern;
import builder.BuilderPattern;
import factory.FactoryPattern;
import observer.ObserverPattern;
import singleton.SingletonPattern;

public class Main {
    public static void main(String[] args) {

        /* Factory pattern */
        FactoryPattern factoryPattern = new FactoryPattern();
        factoryPattern.example1();
        factoryPattern.example2();

        /* Builder pattern */
        BuilderPattern builderPattern = new BuilderPattern();
        builderPattern.example1();
        builderPattern.example2();

        /* Singleton pattern */
        SingletonPattern singletonPattern = new SingletonPattern();
        singletonPattern.example1();
        singletonPattern.example2();

        /* Adapter pattern */
        AdapterPattern adapterPattern = new AdapterPattern();
        adapterPattern.example1();

        /* Observer pattern */
        ObserverPattern observerPattern = new ObserverPattern();
        observerPattern.example1();
        observerPattern.example2();
    }
}