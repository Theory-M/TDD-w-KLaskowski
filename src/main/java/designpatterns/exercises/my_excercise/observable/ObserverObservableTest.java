package designpatterns.exercises.my_excercise.observable;

public class ObserverObservableTest {
    public static void main(String[] args) {
        MyTimerTask myTimer = new MyTimerTask();
        Counter counter = new Counter();

        // do listy obserwujacych dokladamy obserwatora, ktory bedzie obserwowal COUNTER
        myTimer.addObserver(counter);
        // to nie dziala jak nalezy -- Krystian wrzucil na GIT wersje dzialajaca, toche inaczej zrobiona
        // bo na zajeciach nie dal rady tego zrobic...
        myTimer.schedule(1000);
    }
}
