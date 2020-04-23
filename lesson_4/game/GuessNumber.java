package lesson_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int computerNumber;
    private final Scanner scanner = new Scanner(System.in);
    private final Player player1;
    private final Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playGame() {
        initGame();
        while (true) {
            if (checkAttempt(player1) || makeMove(player1)) {
                break;
            }
            if (checkAttempt(player2) || makeMove(player2)) {
                break;
            }
        }
        playerEnteredNumber();
    }

    private void initGame() {
        computerNumber = new Random().nextInt(101);
        player1.resetEnteredNumbers();
        player2.resetEnteredNumbers();
    }

    private boolean checkAttempt(Player player) {
        if (player.getAttempt() == 10) {
            System.out.println(player.getName() + " has run out of attempts");
            return true;
        }
        return false;
    }

    private boolean compareNumbers(Player player) {
        if (computerNumber > player.getNumber()) {
            System.out.println("Your number is less");
        } else if (computerNumber < player.getNumber()) {
            System.out.println("Your number is greater");
        } else if (computerNumber == player.getNumber()) {
            System.out.println(player.getName() + " won this game! " + player.getName() +
                    " guessed the number " + computerNumber + " from the " + player.getAttempt() + " attempt.");
            return true;
        }
        return false;
    }

    private void inputNumber(Player player) {
        do {
            System.out.println(player.getName() + " Enter a number:");
        } while (!player.setNumber(scanner.nextInt()));
    }

    private boolean makeMove(Player player) {
        inputNumber(player);
        player.incAttempt();
        player.setEnteredNumber(player.getNumber());
        return compareNumbers(player);
    }

    private void getPlayerNumber(Player player) {
        System.out.println("Numbers entered by: " + player.getName());
        for (int i = 0; i < player.getEnteredNumbers().length; i++) {
            System.out.println(player.getEnteredNumbers()[i]);
        }
    }

    private void playerEnteredNumber() {
        getPlayerNumber(player1);
        getPlayerNumber(player2);
    }

}
