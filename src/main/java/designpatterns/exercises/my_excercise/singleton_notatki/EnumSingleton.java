package designpatterns.exercises.my_excercise.singleton_notatki;

public enum EnumSingleton {
    // najprostsy i najbardziej uzyteczny rodzaj Singletona

    INSTANCE;

    private double footprint;

    EnumSingleton() {
        footprint = Math.random();
    }

    public void getFootprint() {
        System.out.println("footprint = " + footprint);
    }
}
