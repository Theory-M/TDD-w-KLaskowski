package designpatterns.examples;

import designpatterns.examples.decorator.*;

public class Mcdonald {
    public static void main(String[] args) {
        Burger myFavouriteBurger = new BigMac();
        WithFries myFirstOrder = new WithFries(myFavouriteBurger);
        WithDrink mySecondOrder = new WithDrink(new McRoyal());
        System.out.println("Order #1: " + myFirstOrder.toString());
        System.out.println("Order #2: " + mySecondOrder.toString());

        // moge:
        Burger bigMac = new BigMac();
        Burger quarterpounderWithCheese = new McRoyal();
        System.out.println("Order #3: " + bigMac.toString());
        System.out.println("Order #4: " + new WithDrink(bigMac));
        // cos to ponizej nie pojdzie, ale by moglo gdyby inne rzeczy bylo troche pozmieniane
//        System.out.println("Order #5: " + new WithDrink(new WithFries(bigMac)));
    }
}
