import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Choose Operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result = 0;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error! Cannot divide by zero.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }

        System.out.println("Result: " + result);
    }
}
