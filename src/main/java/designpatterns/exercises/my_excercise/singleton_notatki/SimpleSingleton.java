package designpatterns.exercises.my_excercise.singleton_notatki;

public class SimpleSingleton {

    // inicjalizacja statyczna -- w tym miejscu, przed wywolaniem MAIN'a, przy inicjalizowaniu aplikacji,
    // co moze spowolnic uruchamianie aplikacji, w takim razie moge zrobim LAZY, czyli uruchamiany tylko gdy jest potrzebny
    private static final SimpleSingleton INSTANCE = new SimpleSingleton();

    private double footprint;
    //
    private SimpleSingleton(){
        footprint = Math.random();
    }

    public double getFootprint() {
        return footprint;
    }

    //
    public static SimpleSingleton getInstance(){return INSTANCE;}

    public static void main(String[] args) {

        SimpleSingleton.getInstance().getFootprint();
        SimpleSingleton instance = SimpleSingleton.getInstance();
        SimpleSingleton instance1 = new SimpleSingleton();

        System.out.println(instance.footprint);
        System.out.println(instance1.footprint);
    }
}
