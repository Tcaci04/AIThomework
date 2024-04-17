package consultation02;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        int sale = scanner.nextInt();
        double finalprice = price - (price * sale / 100.0);
        System.out.println(finalprice);


    }
}
