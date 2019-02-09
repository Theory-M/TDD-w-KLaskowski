package designpatterns.exercises.my_excercise.observable;

import java.util.Timer;
import java.util.TimerTask;

public class ObserverExample {

    // przy podzielnym przez 3 chce dostac slowo fizz,
    // zamiast podzielne przez 5 chce dostac buzz
    // przez 3 i 5 fizz i buzz

//    private List<Integer> channels = new ArrayList<>();

    public static void main(String[] args) {

        // OBSERVER
        for(int i=1; i<100;i++){
            if (i%3 == 0 && i%5 == 0) System.out.println("fizzbuzz");
            else if (i%3 == 0) System.out.println("fizz");
            else if (i%5 == 0) System.out.println("buzz");
            System.out.println(i);

            Timer timer = new Timer();
            TimerTask timerTask = new TimerTask() {
                public void run() {
                    System.out.println("time traveller says Hello World");
                }
            };
            // pojawienie z opoznieniem 10*1000 milisekund -- lepszy sposob zapisu
            timer.schedule(timerTask,1000);
//            timer.schedule(()-> System.out.println("Hello world travellers"));
            // to samo zadanie mozna umiescic w kilku roznych punktach za pomoca mojego timera:
            MyTimerTask myTimer = new MyTimerTask();
            myTimer.schedule(3000);
            myTimer.schedule(2000);
            myTimer.schedule(1000);

        }
    }
}
