package dec13;

public class CalculatorMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int subtraction = calculator.sub(10, 5);
        System.out.println("Subtraction of two num is " + subtraction);
    }
}
