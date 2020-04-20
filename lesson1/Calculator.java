package lesson1;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number1 = getNum();
        char operation = getOperation();
        int number2 = getNum();
        int result = calculations(number1, number2, operation);
        System.out.println("Result:" + result);
    }

    private static int getNum() {
        System.out.println("Enter a number:");
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Error. Please enter a number");
            scanner.next();
            number = getNum();
        }
        return number;
    }

    private static char getOperation() {
        System.out.println("Enter operation");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    private static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }

    private static int calculations(int number1, int number2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            case '^':
                result = power(number1, number2);
                break;
            case '%':
                result = number1 % number2;
                break;
            default:
                System.out.println("Wrong operation. Please, retype");
                result = calculations(number1, number2, getOperation());
        }
        return result;
    }
}


