package singleton.models;

public class EaggerSingleton {
    private static final EaggerSingleton EAGGER_SINGLETON_INSTANCE = new EaggerSingleton();

    private EaggerSingleton() {
    }

    public static EaggerSingleton getCarEagger(){
        return EAGGER_SINGLETON_INSTANCE;
    }

    public void whoAmI(){
        System.out.println("Im a eagger singleton!");
    }
}
