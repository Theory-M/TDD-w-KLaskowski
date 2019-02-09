package designpatterns.exercises.my_excercise.facade_notatki;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("....\n" +
                ".  .\n" +
                "....");
    }
}
