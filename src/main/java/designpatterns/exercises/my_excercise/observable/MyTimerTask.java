package designpatterns.exercises.my_excercise.observable;


import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

// OBSERWOWANE, wiec extends Observable
public class MyTimerTask extends Observable {
    // robie sobie swoja wersje Timera ktora moze uzywac LAMBDY, bo standardowa nie moze gdyz jest ze starej Javy
    Timer timer = new Timer();
//    int i = 0;

    public void schedule(int delay){
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                hasChanged();
                notifyObservers();
//                i++;
//                System.out.println("better timer with lamdba");
                // zamordowanie kompa: co sekunde tworze nowy timertask i go wykonuje:
                // czasami potrzebuje cos takiego np przy serwerach, zeby sprawdzac obecnosc, dzialanie, helpcheck...
                schedule(1000);
            }
        };
        timer.schedule(timerTask,delay);
    }

}
