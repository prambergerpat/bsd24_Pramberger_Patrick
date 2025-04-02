package at.campus02.bsd;

public class Calculator {

    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    public static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    public static double divide(double number1, double number2) {
        if (number2 == 0) {
            System.out.println("Error: Division by zero.");
            return Double.NaN;
        } else return number1 / number2;
    }

    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }
}
