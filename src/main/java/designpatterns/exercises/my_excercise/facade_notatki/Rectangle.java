package designpatterns.exercises.my_excercise.facade_notatki;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("....\n" +
                ".  .\n" +
                ".  .\n" +
                ".  .\n" +
                ".  .\n" +
                "....");
    }
}
