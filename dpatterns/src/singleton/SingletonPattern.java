package singleton;

import singleton.models.EaggerSingleton;
import singleton.models.LazzySingleton;

public class SingletonPattern {

    public SingletonPattern() {
        System.out.println("\n\n*** Singleton pattern. ***");
    }

    public void example1(){
        System.out.println("\n* Example 1. *");

        EaggerSingleton.getInstance().whoAmI();
    }

    public void example2(){
        System.out.println("\n* Example 2. *");

        LazzySingleton.getInstance().whoAmI();
        LazzySingleton.getInstance().whoAmI();
    }
}
