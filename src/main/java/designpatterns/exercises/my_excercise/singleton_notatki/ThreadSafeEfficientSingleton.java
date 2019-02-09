package designpatterns.exercises.my_excercise.singleton_notatki;

public class ThreadSafeEfficientSingleton {
    // volatile oznacza, ze to pole nie jest cache'owane pomiedzy watkami
    // zeby nie bylo w cache'u jakiegos smiecia ktory by spowolnil lub uniemozliwil utworzenia
    // takiego singletona
    // na codzien potrzbne sa tylko Lazy oraz SimpleSingleton
    // zdaniem Krystiana najlepsze jednak sa Singletony Enumowe
    // EnumSingleton
    private volatile static ThreadSafeEfficientSingleton INSTANCE;

    private ThreadSafeEfficientSingleton() {}


    public static synchronized ThreadSafeEfficientSingleton getInstance() {
        if(INSTANCE == null) {
            synchronized (ThreadSafeEfficientSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ThreadSafeEfficientSingleton();
                }
            }
        }
        return INSTANCE;
    }

    // -----------

//    private double footprint;
//
//    private ThreadSafeEfficientSingleton() {
//        footprint = Math.random();
//    }
//
//    public void getFootprint() {
//        System.out.println("footprint = " + footprint);
//    }
}
