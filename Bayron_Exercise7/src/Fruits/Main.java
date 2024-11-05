package Fruits;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main app = new Main();
        app.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the fruit (Apple, Banana, Orange): ");
        String fruitInput = scanner.nextLine().toUpperCase();

        try {
            FruitType fruit = FruitType.valueOf(fruitInput);
            FruitInfo fruitInfo = new FruitInfo(fruit);
            fruitInfo.display();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Invalid fruit entered. Please enter Apple, Banana, or Orange.");
        } finally {
            scanner.close();
        }
    }

    private class FruitInfo {
        private FruitType fruit;

        public FruitInfo(FruitType fruit) {
            this.fruit = fruit;
        }

        public void display() {
        	System.out.println("\nNutritional information for " + fruit.getName()
        			+ ": \nCalories: " + fruit.getCalories()
        			+ "\nVitamin C: "+fruit.getVitaminC() + " mg");
        }
    }
}
