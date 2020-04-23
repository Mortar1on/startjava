package lesson_2_3;

public class Player {
    String name;
    int number;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public boolean setNumber(int number) {
        if (number < 0 || number > 101) {
            System.out.println("Invalid number. Enter a number between 0 and 100");
            return false;
        } else {
            this.number = number;
            return true;
        }
    }
}
