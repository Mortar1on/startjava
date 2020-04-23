package lesson_2_3;

public class Wolf {
    private String gender = "male";
    private String nickname = "Fang";
    private String color = "white";
    private double weight = 45.3;
    private int age = 3;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Incorrect age");
        } else {
            this.age = age;
        }
    }

    void walk() {
        System.out.println("The wolf is walking");
    }

    void sit() {
        System.out.println("The wolf is sitting");
    }

    void run() {
        System.out.println("The wolf is running");
    }

    void howl() {
        System.out.println("Wolf howls at the moon");
    }

    void hunt() {
        System.out.println("Wolf on the hunt");
    }
}
