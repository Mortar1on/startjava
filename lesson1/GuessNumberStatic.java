package lesson1;

import java.util.Scanner;

public class GuessNumberStatic {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        int value = 0;
        Scanner scanner = new Scanner(System.in);

        while (value != 35) {
            System.out.println("type your number");

            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value == 35) {
                    System.out.println("Got it! Your number is " + value);
                } else if (value <= 29) {
                    System.out.println("your number is less");
                } else if (value <= 30 || value <= 40) {
                    System.out.println("you are close");
                } else if (value <= 41 || value <= 100) {
                    System.out.println("your number is greater");
                } else if (value >= 101) {
                    System.out.println("you need to guess a number from 0 to 100");
                }
            } else {
                scanner.nextLine();
            }
        }
    }
}