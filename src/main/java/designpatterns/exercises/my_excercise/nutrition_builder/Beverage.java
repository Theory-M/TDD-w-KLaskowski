package designpatterns.exercises.my_excercise.nutrition_builder;

public class Beverage extends NutritionProduct{
    @Override
    public String toString() {
        return "Beverage{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", protein=" + protein +
                ", fat=" + fat +
                ", carbs=" + carbs +
                '}';
    }
}
