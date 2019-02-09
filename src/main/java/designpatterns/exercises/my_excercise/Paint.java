package designpatterns.exercises.my_excercise;

import designpatterns.examples.facade.*;

public class Paint {
    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawCircle();
        shapeFacade.drawSquare();
        shapeFacade.drawRectangle();

        // ------------------------
        // vs
        // ------------------------

        Shape circle = new Circle();
        circle.draw();
        Shape square = new Square();
        square.draw();
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
    }
}
