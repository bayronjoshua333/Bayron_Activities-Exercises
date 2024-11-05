package Fruits;

public enum FruitType {
    APPLE("Apple", 95, 7.9),
    BANANA("Banana", 105, 9.1),
    ORANGE("Orange", 63, 53.2);

    private String name;
    private int calories;
    private double vitaminC;

    FruitType(String name, int calories, double vitaminC) {
        this.name = name;
        this.calories = calories;
        this.vitaminC = vitaminC;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public double getVitaminC() {
        return vitaminC;
    }
}
