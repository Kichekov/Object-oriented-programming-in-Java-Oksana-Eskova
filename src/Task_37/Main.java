package Task_37;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Range range = new Range(scanner.nextInt(), scanner.nextInt());

        for (Integer item : range) {
            System.out.print(item + " ");
        }
    }
}
