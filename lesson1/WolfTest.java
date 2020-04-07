package lesson1;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        System.out.println("Wolf named: " + wolf.nickname);
        System.out.println("wolf age: " + wolf.age + " years");
        wolf.run();
        wolf.hunt();
    }
}
