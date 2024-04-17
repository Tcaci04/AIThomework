package consultation02;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mathMark = scanner.nextInt();
        int programingMark = scanner.nextInt();
        int physicsMark = scanner.nextInt();
        double avg = (mathMark + programingMark + physicsMark)/ 3.0;
        System.out.println(avg);



    }

}
