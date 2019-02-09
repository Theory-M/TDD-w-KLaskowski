package designpatterns.exercises.my_excercise.observable;

import java.util.Observable;
import java.util.Observer;

// Obserwator
public class Counter implements Observer {
    int i=0;

    // ta metoda nigdy nie jest wywolywana, przeze mnie
    // Java wywoluje ja sama
    // "O COS SIE ZMIENILO!!!"
    @Override
    public void update(Observable o, Object arg) {
        i++;
        System.out.println("i = " + i);
    }
}
