package lesson07.homework;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String answer;
        switch (n) {
            case 0:
                answer = "Default";
                break;
            case 1:
                answer = "January";
                break;
            case 2:
                answer = "February";
                break;
            case 3:
                answer = "March";
                break;
            case 4:
                answer = "April";
                break;
            case 5:
                answer = "May";
                break;
            case 6:
                answer = "June";
                break;
            case 7:
                answer = "July";
                break;
            case 8:
                answer = "August";
                break;
            case 9:
                answer = "September";
                break;
            case 10:
                answer = "October";
                break;
            case 11:
                answer = "November";
                break;
            case 12:
                answer = "December";
                break;
            default:
                answer = "undefined";
        }

        System.out.println(answer);

    }
}
