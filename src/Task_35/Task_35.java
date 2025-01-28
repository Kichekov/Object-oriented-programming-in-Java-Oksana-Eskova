package Task_35;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        Purchase[] mass = new Purchase[size];
        for (int i = 0; i < mass.length; i++) {
            String str = scanner.nextLine();
            String[] parts = str.split(" ");
            mass[i] = new Purchase(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));

        }
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }



    }
}
