package com.lesson_2_3;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setColor("Brown");
        System.out.println("Wolf named: " + wolf.getNickname());
        System.out.println("wolf age: " + wolf.getAge() + " years");
        System.out.println(wolf.getColor());
        wolf.run();
        wolf.hunt();
    }
}
