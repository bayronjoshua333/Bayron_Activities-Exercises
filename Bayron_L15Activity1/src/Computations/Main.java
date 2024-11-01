package Computations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            CalculatorApp.number1();
            Double num1 = scanner.nextDouble();

            CalculatorApp.number2();
            Double num2 = scanner.nextDouble();
            
            CalculatorApp.listOfOperations();
            char operation = scanner.next().charAt(0);

            if (operation == 'E' || operation == 'e') {
                CalculatorApp.displayExitMessage();
                break;
            }

            Double result = null;
            boolean validOperation = true;
            String operatorSymbol = "";
            
            switch (operation) {
                case 'A':
                case 'a':
                    result = Operations.add(num1, num2);
	                operatorSymbol = "+";    
                    break;
                case 'B':
                case 'b':
                    result = Operations.subtract(num1, num2);
                    operatorSymbol = "-";
                    break;
                case 'C':
                case 'c':
                    result = Operations.multiply(num1, num2);
                    operatorSymbol = "*";
                    break;
                case 'D':
                case 'd':
                    if (num2 != 0) {
                        result = Operations.divide(num1, num2);
                        operatorSymbol = "/";
                    } else {
                        CalculatorApp.zeroNotAllowed();
                        validOperation = false;
                    }
                    break;
                default:
                    CalculatorApp.notInMenu();
                    validOperation = false;
                    break;
            }

            if (validOperation && result != null) {
                CalculatorApp.displayResult(num1, operatorSymbol, num2, result);
            }
        }

        scanner.close();
    }
}