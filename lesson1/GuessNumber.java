package lesson1;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        int a = new Random().nextInt(101);
        int value = 0;
        Scanner scanner = new Scanner(System.in);

        while (value != a) {
            System.out.println("type your number");

            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value == a) {
                    System.out.println("Got it! Your number is " + a);
                } else if (value < a - 5) {
                    System.out.println("your number is less");
                } else if (value < a + 6) {
                    System.out.println("you are close");
                } else if (value > a && value <= 100) {
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