package lesson12.classwork;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        long start = System.nanoTime();
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(" Number is not prime");
                isPrime = false;
                break;


            }
        }

        long finish = System.nanoTime();
        System.out.println("Time took: " + (finish - start) + "ns");
        if (isPrime) {
            System.out.println("Number is Prime");
        }
    }

}
