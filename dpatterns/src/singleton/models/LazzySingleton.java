package singleton.models;

import factory.models.Car;

public class LazzySingleton {
        private static LazzySingleton LAZZY_SINGLETON_INSTANCE;
        private LazzySingleton(){}

        public static LazzySingleton getInstance(){
            if(LAZZY_SINGLETON_INSTANCE == null){
                LAZZY_SINGLETON_INSTANCE = new LazzySingleton();
            }
            return LAZZY_SINGLETON_INSTANCE;
        }

        public void whoAmI(){
            System.out.println("Im a lazzy singleton!");
        }
}
