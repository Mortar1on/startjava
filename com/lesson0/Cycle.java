package com.lesson0;

public class Cycle {
    public static void main(String[] args) {
        // Цикл for
        int result = -1;
        for (int i = 0; i <= 21; i++) {
            result++;
            System.out.println(result);
        }
        System.out.println();

        // Цикл while
        int value = 6;
        while (value >= -6) {
            System.out.println(value);
            value = value - 2;
        }
        System.out.println();

        // Цикл do-while
        int sum = 0;
        int x = 1;
        int calculation = 10;
        do {
            calculation++;
            if (calculation % 2 == 0) {
                System.out.println("Число " + calculation + " чётное");
            } else {
                System.out.println("Число " + calculation + " нечетное");
                sum += calculation;
            }
            x++;
        } while (x <= 10);

        System.out.println("Сумма нечётных чисел : " + sum);

    }
}