package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;

public class MainClass {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();

        int number1 = 8;
        int number2 = 4;

        logger.info("Calculations starting");
        System.out.println("Result add: " + Calculator.add(number1, number2));
        System.out.println("Result subtract: " + Calculator.subtract(number1, number2));
        System.out.println("Result multiply: " + Calculator.multiply(number1, number2));
        System.out.println("Result division: " + Calculator.divide(number1, number2));
        logger.error("Calculation Finished");
        System.out.println();
        System.out.println("Pramberger Patrick");
    }
}
