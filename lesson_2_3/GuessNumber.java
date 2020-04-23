package lesson_2_3;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final int computerNumber = new Random().nextInt(101);
    private final Scanner scanner = new Scanner(System.in);
    private final Player player1;
    private final Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private void inputNumber(Player player) {
        do {
            System.out.println(player.getName() + " enter a number: ");
        } while (!player.setNumber(scanner.nextInt()));
    }

    private boolean compareNumber(Player player) {
        if (computerNumber > player.getNumber()) {
            System.out.println("Your number is less. Maybe next time you'll get luckier.");
        } else if (computerNumber < player.getNumber()) {
            System.out.println("Your number is greater. Try a bit harder next time.");
        } else if (computerNumber == player.getNumber())  {
            System.out.println("Bull's-eye! " + player.getName() + " you won!");
            return true;
        }
        return false;
    }

    private boolean makeMove(Player player) {
        inputNumber(player);
        return compareNumber(player);
    }

    public void startGame() {
        while (true) {
            if (makeMove(player1)) {
                break;
            }
            if (makeMove(player2)) {
                break;
            }
        }
    }
}