package lesson11.homework;

import java.util.Scanner;

public class Task02 {


    public static void main(String[] args) {
        System.out.println("Приветствуем в CurrencyConverter!");
        System.out.println("Выберите исходную валюту:");
        String[] currencyies = {"EURO", "USD", "TL"};

        for (int i = 0; i < currencyies.length; i++) {
            System.out.println((i + 1) + ". " + currencyies[i]);
        }
        System.out.println("0. Esire");


        System.out.println("1. EURO");
        System.out.println("2. USD");
        System.out.println("3. TL");

        Scanner scanner = new Scanner(System.in);
        int initialCurrency = scanner.nextInt();
        if (initialCurrency == 0) {
            return;
        }
        System.out.println("Introduceti cantitatea:");
        double amount = scanner.nextDouble();
        System.out.println("Alegeti moneda (din lista de mai sus):");
        int targetCurrency = scanner.nextInt();

        double[] coefficients = {1, 1.06, 34.42};
        amount /= coefficients[initialCurrency - 1];
        amount *= coefficients[targetCurrency - 1];

        System.out.println("Total: " + amount + " " + currencyies[targetCurrency]);


    }
}
