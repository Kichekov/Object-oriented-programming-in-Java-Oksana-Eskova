package Task_21;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(scanner.nextInt());
        int randomNumber = random.nextInt(1,11);
        int[] mas = new int[randomNumber];
            for (int i = 0; i < 3; i++) {
                try {
                    mas[scanner.nextInt()] = scanner.nextInt();
                } catch (ArrayIndexOutOfBoundsException ex) {
                    System.out.println("Индекс не попал в массив");
                }
            }
        System.out.println(Arrays.toString(mas));
    }
}
