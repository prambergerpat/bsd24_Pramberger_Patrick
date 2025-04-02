package at.campus02.bsd;

public class MainClass {
    public static void main(String[] args) {

        int number1 = 8;
        int number2 = 4;

        System.out.println("Result add: " + Calculator.add(number1, number2));
        System.out.println("Result subtract: " + Calculator.subtract(number1, number2));
        System.out.println("Result multiply: " + Calculator.multiply(number1, number2));
        System.out.println("Result division: " + Calculator.divide(number1, number2));
        System.out.println();
        System.out.println("Pramberger Patrick");

        System.out.println("Calculation Finished");
    }
}
