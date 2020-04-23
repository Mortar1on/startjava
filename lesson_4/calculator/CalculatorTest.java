package lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String choice = "yes";
    while (choice.equals("yes")) {
        Calculator calc = new Calculator();

        System.out.println("Enter a math expression");
        calc.splitMathOperation(scanner.nextLine());

        System.out.println("Value: " + calc.calculate());

        do {
            System.out.println("Do you want to continue? [yes/no]");
            choice = scanner.nextLine();
        } while (!choice.equals("yes") && !choice.equals("no"));
    }
    }
}
