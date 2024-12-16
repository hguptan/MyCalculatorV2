package com.example.mycalculatorv2;

import java.util.ArrayList;

public class CalculatorBrain {
    public void push(String s){

    }
    public static double calculate(String expression) {
        if (expression == null || expression.isEmpty()) {
            throw new IllegalArgumentException("Expression cannot be null or empty");
        }

        // Use regular expressions to split numbers and operators
        String[] numbers = expression.split("[+\\-*/]");
        String[] operators = expression.split("[0-9]+");

        // Validate inputs
        if (numbers.length == 0) {
            throw new IllegalArgumentException("No numbers found in the expression");
        }

        // Parse first number as the initial result
        double result = Double.parseDouble(numbers[0]);

        // Perform operations sequentially
        int operatorIndex = 1; // Operators split adds an empty string at the start
        for (int i = 1; i < numbers.length; i++) {
            double num = Double.parseDouble(numbers[i]);

            switch (operators[operatorIndex]) {
                case "+":
                    result += num;
                    break;
                case "-":
                    result -= num;
                    break;
                case "*":
                    result *= num;
                    break;
                case "/":
                    if (num == 0) {
                        throw new ArithmeticException("Division by zero is not allowed");
                    }
                    result /= num;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operators[operatorIndex]);
            }

            operatorIndex++;
        }

        return result;
    }
    // Convert ArrayList to a single String with line breaks
    public static String historyText (){
        String toDisplay = "";
        for (int i = 0; i < MyApp.history.size(); i++) {
           toDisplay += MyApp.history.get(i) + "\n";
        }
        return toDisplay;
    }
}
