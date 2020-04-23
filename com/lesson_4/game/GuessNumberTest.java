package com.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choice = "yes";
        while (choice.equals("yes")) {


            System.out.print("First player enter your name: ");
            Player player1 = new Player(scan.next());

            System.out.print("Second player enter your name: ");
            Player player2 = new Player(scan.next());

            System.out.println("Today play: " + player1.getName() + " and " + player2.getName());
            System.out.println("Computer generated a number. What do you think this number is?");

            GuessNumber playGame = new GuessNumber(player1, player2);
            playGame.playGame();

            do {
                System.out.print("Do you want to continue? [yes/no]: ");
                choice = scan.next();
            } while (!choice.equals("yes") && !choice.equals("no"));
        } // end of main while
    } // end of method main
}
