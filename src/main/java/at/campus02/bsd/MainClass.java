package at.campus02.bsd;




public class MainClass {
    public static void main(String[] args) {

        int number1 = 8;
        int number2 = 9;

        Calculator calculator = new Calculator();

        System.out.println("Result add: " + calculator.add(number1, number2));
        System.out.println("Result subtract: " + calculator.subtract(number1, number2));
        System.out.println("Result multiply: " + calculator.multiply(number1, number2));
        System.out.println("Result division: " + calculator.divide(number1, number2));
        System.out.println();
        System.out.println("Pramberger Patrick");
    }
}
