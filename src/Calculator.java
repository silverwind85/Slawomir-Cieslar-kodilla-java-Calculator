public class Calculator {

    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public int substract(int number1, int number2) {
        return number1 - number2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(9, 8)) ;
        System.out.println(calculator.substract(23,12));
    }
}
