package lesson15.classwork;

import java.util.Random;

public class Main02 {
// Peregruzka metodov
public static int sum(int[] array) {
    return  sum(array, 0, array.length);
}

public static int sum(int[] array, int from, int to) {
    int sum = 0;
    for (int i = from; i < to; i++) {
        sum += array[i];
    }
    return sum;
}

    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt(50);

    }
}
