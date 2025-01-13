package Task_30;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Dog dogA = new Dog(scanner.next(),scanner.next(),scanner.next(),scanner.nextDouble());
        Dog dogB = new Dog(scanner.next(),scanner.next(),scanner.next(),scanner.nextDouble());
        switch (dogA.compareTo(dogB)) {
            case 1 -> System.out.println("Первая собака больше");
            case -1 -> System.out.println("Вторая собака больше");
            case 0 -> System.out.println("Собаки одинакового размера");
        }
    }
}
