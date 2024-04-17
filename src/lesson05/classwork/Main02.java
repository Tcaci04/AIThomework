package lesson05.classwork;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your age:");
        int age = scanner.nextInt();
        if (age < 13);{
            System.out.println("You are too young! Return later wenn you are over 13");
        }  {
            System.out.println("Enter your login");
            String login = scanner.next();
            System.out.println("Enter your password");
            String password = scanner.next();
            System.out.println("Succssefully registered user");
            System.out.println("Login:" + login );
            System.out.println(" Password:" + password);
        }

    }
}
