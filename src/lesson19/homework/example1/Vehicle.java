package lesson19.homework.example1;

public class Vehicle {
    public static final String POWER = "Fast";
    private String name;
    private int wheel;

    public Vehicle(String name, int wheel) {
        this.name = name;
        this.wheel = wheel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }
}