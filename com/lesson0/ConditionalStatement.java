package com.lesson0;

public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 25;
        boolean isMale = true;
        double height = 1.90;
        char firstNameLetter = 'M';

        if (age > 20) {
            System.out.println("Вы старше 20");
        }

        if (isMale) {
            System.out.println("Вы мужчина");
        }

        if (!isMale) {
            System.out.println("Вы женщина");
        }

        if (height < 1.80) {
            System.out.println("Вы не подходите по росту");
        } else {
            System.out.println("Добро пожаловать!");
        }

        if (firstNameLetter == 'M') {
            System.out.println("Ваше имя начинается на M");
        } else if (firstNameLetter == 'I') {
            System.out.println("Ваше имя начинается на I");
        } else {
            System.out.println("Ваше имя начинается на другую букву");
        }

    }
}