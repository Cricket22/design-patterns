package singleton.models;


public class LazzySingleton {
        private static LazzySingleton LAZZY_SINGLETON_INSTANCE;
        private LazzySingleton(){}

        public static LazzySingleton getInstance(){
            if(LAZZY_SINGLETON_INSTANCE == null){
                System.out.println("\nMy brand new instance!");
                LAZZY_SINGLETON_INSTANCE = new LazzySingleton();
            }else{
                System.out.println("Dear, im the same you once knew before. I swear!");
            }
            return LAZZY_SINGLETON_INSTANCE;
        }

        public void whoAmI(){
            System.out.println("Im a lazzy singleton!");
        }
}
