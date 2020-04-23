package com.lesson_4.game;

import java.util.Arrays;

public class Player {
    private final String name;
    private int number;
    private final int[] enteredNumber = new int[10];
    private int attempt = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getAttempt() {
        return attempt;
    }

    public boolean setNumber(int number) {
        if (number < 0 || number > 101) {
            return false;
        } else {
            this.number = number;
            return true;
        }
    }

    public void incAttempt() {
        attempt++;
    }

    public void setEnteredNumber(int number) {
        enteredNumber[attempt - 1] = number;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumber, attempt);
    }

    public void resetEnteredNumbers() {
        Arrays.fill(enteredNumber, 0, attempt, 0);
        attempt = 0;
    }
}
