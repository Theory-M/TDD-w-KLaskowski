package designpatterns.exercises.my_excercise.nutrition_builder;

public class NutritionBuilder {

    // wersja leniwa LAZY:
    String name;
    int calories;
    double protein;
    double fat;
    double carbs;
    boolean isFood;

    public NutritionBuilder() {
        // konstruktor bezargumentowy
    }

    // settery, tylko ze zamiast void zwracam NutritionBuilder oraz na koncu "return this;"
    public NutritionBuilder setName (String name){
        // this = ta instancja NutritionBuilder
        this.name = name;
        return this;
    }

    public NutritionBuilder setCalories(int calories) {
        this.calories = calories;
        return this;
    }

    public NutritionBuilder setProtein(double protein) {
        this.protein = protein;
        return this;
    }

    public NutritionBuilder setFat(double fat) {
        this.fat = fat;
        return this;
    }

    public NutritionBuilder setCarbs(double carbs) {
        this.carbs = carbs;
        return this;
    }

    public NutritionBuilder setIsFood (boolean isFood){
        this.isFood = isFood;
        return this;
    }

    public NutritionProduct build(){
        // ? oznacza tutaj IF, taki skrot
        NutritionProduct product = isFood ? new Food() : new Beverage();

        product.name = this.name;
        product.calories = this.calories;
        product.carbs = this.carbs;
        product.fat = this.fat;
        product.protein = this.protein;

        return product;
    }

    // MAIN tutaj dla skrotu
    public static void main(String[] args) {
        // teraz tworzac nowy obiekt za pomoca BUILDERA nie musze wypelniac wszystkich pol
        NutritionBuilder builder = new NutritionBuilder()
                .setIsFood(true)
                .setName("coffee")
                .setCalories(80);

        NutritionProduct product = builder.build();
        System.out.println(product);
    }
}
