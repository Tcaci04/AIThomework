package lesson13.classwork;

import java.util.Scanner;

public class Main03 {
    //program care transforma kilometri in mile

    public static double kmMile(double km) {
        return  km * 0.621371;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distance in km:");
        double dist = scanner.nextDouble();
        double distMiles = kmMile(dist);

        System.out.println("Distance in milles: " + distMiles);

    }
}
