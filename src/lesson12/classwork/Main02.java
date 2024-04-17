package lesson12.classwork;

public class Main02 {
    /* scrieti toate nr de la 1 la 50, care nu se impart la 7 intreg

     */
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {

            if (i % 7 != 0) {
                System.out.print(i + " ");
            }

        }
    }
}
