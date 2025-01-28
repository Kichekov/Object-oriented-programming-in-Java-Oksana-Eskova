package Task_25;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class MainC {
    public static void main(String[] args) {
        boolean inputOne = false;
        Scanner scanner = new Scanner(System.in);
        int[] mass = null;
        int size = 0;
        while (!inputOne) {
            try {
                size = scanner.nextInt();
                mass = new int[size];
                inputOne = true;

            } catch (InputMismatchException ex) {
                System.out.println("Размер массива должен быть целым числом!");
                scanner.nextLine();
            } catch (NegativeArraySizeException exr) {
                System.out.println("Введите положительный размер массива!");
                scanner.nextLine();
            }
        }

        for (int i = 0; i < mass.length; i++) {
            if (scanner.hasNextInt()) {
                mass[i] = scanner.nextInt();
            } else {
                mass[i] = 0;
                scanner.next();
            }
        }
        try {
            int option = mass[scanner.nextInt()];
            System.out.println("Извлечено из массива: " + option);
            System.out.println(Arrays.toString(mass));

        } catch (ArrayIndexOutOfBoundsException exp) {
            System.out.println("Неверный индекс!");
            System.out.println(Arrays.toString(mass));
        }
    }
}
