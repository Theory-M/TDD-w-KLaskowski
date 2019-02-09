package designpatterns.examples.decorator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class WithFries implements Pricy, Caloric{
    Burger burger;
    public WithFries(Burger burger){
        this.burger = burger;
    }

    @Override
    public BigDecimal getPrice() {
        return this.burger.getPrice().add(new BigDecimal(2.50));
    }

    // robie nowy obiekt ktory w sobie przechowuje ten dekorowany
    // potem tylko dodaje na przyklad frytki i ich wartosc kaloryczna
    @Override
    public int getCalories() {
        return this.burger.getCalories() + 500;
    }

    @Override
    public String toString() {
        return "Price: " + getPrice().setScale(2, RoundingMode.CEILING) + "\n"
                + "Calories: " + getCalories() + "\n";
    }
}
