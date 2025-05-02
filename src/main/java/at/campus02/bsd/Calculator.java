package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger();

    public double add(double number1, double number2) {

        return number1 + number2;

    }

    public double subtract(double number1, double number2) {

        return number1 - number2;
    }

    public double divide(double number1, double number2) {
        if (number2 == 0) {
            System.out.println("Error: Division by zero.");
            logger.error("division error: param2 = " + number2 + " first param is: " + number1 );
            return Double.NaN;
        } else {
            logger.debug("divide the two parameter: " + number1 + ", " + number2);
        }
            return number1 / number2;
    }

    public double multiply(double number1, double number2) {

        return number1 * number2;
    }

    public double factorial(double number) {
        if (number < 0) {
            return Double.NaN;
        } else {
            double result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            return result;
        }
    }
}