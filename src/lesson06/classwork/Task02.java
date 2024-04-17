package lesson06.classwork;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        if (age < 0){
            System.out.println("you entered incorrecte value");
        }
        if (age < 13){
            System.out.println("You are kid");
            

    } else if (age < 18) {
            System.out.println("you are teenager");
        } else if (age < 65) {
            System.out.println("you are an adult");
            
        } else  {
            System.out.println("you are an elderly person");
            
        }

    }
    }
