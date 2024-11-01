package Computations;

public class CalculatorApp {
	public static void number1() {
        System.out.print("Enter first number: ");
    }
	
	public static void number2() {
        System.out.print("Enter Second number: ");
    }
	
	public static void listOfOperations() {
		System.out.println("[A] Add \n[B] Subtract \n[C] Multiply \n[D] Divide \n[E] Exit");
        System.out.print("Operation:");
    }
	
    public static void displayResult(Number num1, String Operator, Number num2, Number result) {
        System.out.println(num1 + Operator + num2 + " = " + result);
    }

    public static void displayExitMessage() {
        System.out.println("Thank you for choosing our calculator.");
    }
    
    public static void zeroNotAllowed() {
        System.out.println("Error: Division by zero is not allowed.");
    }
    
    public static void notInMenu() {
        System.out.println("Kindly choose from the menu.");
    }
}
