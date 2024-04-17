package lesson13.classwork;

import java.util.Random;
import java.util.Scanner;

public class Main02 {
/* Domino joc*/
    public static int rollDice() {
        Random random = new Random();
        return  Main04.getRandomNumber(1, 6);
        //am folosit metod random din Main04 in Main02
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            int roll = rollDice();
            System.out.println("Dice rolled " + roll);
            input = scanner.next();
//( ! ) pentru a face generarea continua pin nu scrii cifra ( 0 )
        } while (!input.equals("0"));

    }
}
