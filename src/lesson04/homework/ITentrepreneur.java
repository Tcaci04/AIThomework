package lesson04.homework;

import java.util.Scanner;

public class ITentrepreneur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthlyIncome = scanner.nextInt();
        int pensionTax1 = scanner.nextInt();
        int pensionTax2 = scanner.nextInt();
        int res = pensionTax1 + pensionTax2;
        double netincome = monthlyIncome - (monthlyIncome * res / 100.0);
        System.out.println(res);
        System.out.println(netincome);


    }
}
