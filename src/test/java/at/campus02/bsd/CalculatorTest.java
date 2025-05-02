package at.campus02.bsd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.lang.Float.NaN;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {


    static Calculator calculator;

    @BeforeAll
    static void setUp() {
        calculator = new Calculator();
    }

    @DisplayName("Testing testAddPositiveNumbers() method")
    @Test
    void testAddPositiveNumbers() {
        double result = calculator.add(4, 3);
        assertEquals(7.0, result);
    }

    @DisplayName("Testing testAddWithZero() method")
    @Test
    void testAddWithZero() {
        double result = calculator.add(0, 234);
        assertEquals(234, result);
    }

    @DisplayName("Testing testAddNegativeNumbers() method")
    @Test
    void testAddNegativeNumbers() {
        double result = calculator.add(-4, -34);
        assertEquals(-38, result);
    }

    @DisplayName("Testing testAddDecimalNumbers() method")
    @Test
    void testAddDecimalNumbers() {
        double result = calculator.add(5.111222, 5.111222);
        assertEquals(10.222444, result);
    }




    @DisplayName("Testing testSubtractPositiveNumbers() method")
    @Test
    void testSubtractPositiveNumbers() {
        double result = calculator.subtract(12, 6);
        assertEquals(6, result);
    }

    @DisplayName("Testing testSubtractWithZero() method")
    @Test
    void testSubtractWithZero() {
        double result = calculator.subtract(12, 0);
        assertEquals(12, result);
    }

    @DisplayName("Testing testSubtractNegativeNumbers() method")
    @Test
    void testSubtractNegativeNumbers() {
        double result = calculator.subtract(-23, -45);
        assertEquals(22, result);
    }

    @DisplayName("Testing testSubtractDecimalNumbers() method")
    @Test
    void testSubtractDecimalNumbers() {
        double result = calculator.subtract(4.4545, 0.4545);
        assertEquals(4, result);
    }




    @DisplayName("Testing testMultiplyPositiveNumbers() method")
    @Test
    void testMultiplyPositiveNumbers() {
        double result = calculator.multiply(4, 4);
        assertEquals(16, result);
    }

    @DisplayName("Testing testMultiplyByZero() method")
    @Test
    void testMultiplyByZero() {
        double result = calculator.multiply(34, 0);
        assertEquals(0, result);
    }


    @DisplayName("Testing testMultiplyNegativeNumbers() method")
    @Test
    void testMultiplyNegativeNumbers() {
        double result = calculator.multiply(-6, -6);
        assertEquals(36, result);
    }

    @DisplayName("Testing testMultiplyDecimalNumbers() method")
    @Test
    void testMultiplyDecimalNumbers() {
        double result = calculator.multiply(6.2, 8.6);
        assertEquals(53.32, result);
    }



    @DisplayName("Testing testDividePositiveNumbers() method")
    @Test
    void testDividePositiveNumbers() {
        double result = calculator.divide(81, 9);
        assertEquals(9, result);
    }

    @DisplayName("Testing testDivideByZero() method")
    @Test
    void testDivideByZero() {
        double result = calculator.divide(81, 0);
        assertTrue(Double.isNaN(result));
    }

    @DisplayName("Testing testDivideNegativeNumbers() method")
    @Test
    void testDivideNegativeNumbers() {
        double result = calculator.divide(-45, -5);
        assertEquals(9, result);
    }

    @DisplayName("Testing testDivideDecimalNumbers() method")
    @Test
    void testDivideDecimalNumbers() {
        double result = calculator.divide(25, 0.125);
        assertEquals(200, result);
    }
}
