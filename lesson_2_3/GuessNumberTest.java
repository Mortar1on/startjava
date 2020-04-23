package lesson_2_3;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "yes";
        while (choice.equals("yes")) {

            System.out.println("First player, introduce yourself:");
            Player player1 = new Player(scanner.next());
            System.out.println("Second player, introduce yourself:");
            Player player2 = new Player(scanner.next());

            System.out.println("Computer set a number. What number is it?");
            GuessNumber newGame = new GuessNumber(player1, player2);
            newGame.startGame();

            do {
                System.out.println("Do you want to continue? [yes/no]: ");
                choice = scanner.next();
            } while (!choice.equals("yes") && !choice.equals("no"));
        }
    }
}
