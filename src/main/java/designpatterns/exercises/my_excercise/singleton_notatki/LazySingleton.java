package designpatterns.exercises.my_excercise.singleton_notatki;

public class LazySingleton {
    private static LazySingleton INSTANCE;

    private LazySingleton() {
    }

    // sprawdzanie czy jest juz utworzone, jak nie, to robie
    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
    // tu dalej czegos brakuje -- THREADSAFE
    // pub stat synchronized ThreadSafeSingleton getInstance(){
//            if(INSTANCE == null){
//                    INSTANCE = new ThreadSafeSingleton();
//              }
//              return INSTANCE;
//         }

    // ale najlepiej robic ThreadSafeEfficientSingleton, co jest istotne na przyklad
    // przy kupowaniu na gieldzie, gdzie nawet milisekundy sie licza
    // jesli chce kupic przed kims innym, kto na przyklad ma o jednego IF'a za duzo
    }
