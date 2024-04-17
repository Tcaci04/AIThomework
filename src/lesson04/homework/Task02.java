package lesson04.homework;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your weigh in kg");
        float weight = scanner.nextInt();
        System.out.println(" Enter your height in cm");
        float height = scanner.nextInt()/100f;
        float bodyIndex = weight / (height * height);
        System.out.println(" Your BMI is: " + bodyIndex);

    }
}
