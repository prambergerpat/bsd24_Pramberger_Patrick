package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger();

    public static double add(double number1, double number2) {
        logger.debug("add the two parameter: " + number1 + ", " + number2);
        return number1 + number2;

    }

    public static double subtract(double number1, double number2) {
        logger.debug("subtract the two parameter: " + number1 + ", " + number2);
        return number1 - number2;
    }

    public static double divide(double number1, double number2) {
        if (number2 == 0) {
            System.out.println("Error: Division by zero.");
            logger.error("division error: param2 = " + number2 + " first param is: " + number1 );
            return Double.NaN;
        } else {
            logger.debug("divide the two parameter: " + number1 + ", " + number2);
        }
            return number1 / number2;
    }

    public static double multiply(double number1, double number2) {
        logger.debug("multiply the two parameter: " + number1 + ", " + number2);
        return number1 * number2;
    }
}
