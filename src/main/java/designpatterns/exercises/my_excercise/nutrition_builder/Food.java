package designpatterns.exercises.my_excercise.nutrition_builder;

public class Food extends NutritionProduct{
    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", protein=" + protein +
                ", fat=" + fat +
                ", carbs=" + carbs +
                '}';
    }
}
