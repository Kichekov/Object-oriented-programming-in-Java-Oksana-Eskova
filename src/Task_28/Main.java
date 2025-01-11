package Task_28;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] mass = scanner.nextLine().split("\\D");
        Integer[] numbers = new Integer[mass.length];
        if (numbers.length==0){
            System.out.println(0);
            return;
        }
        for (int i = 0; i< numbers.length; i++){
            try {
                numbers[i] = Integer.parseInt(mass[i]);
            } catch (NumberFormatException ex) {
                numbers[i] = 0;
            }
        }
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-1]);
    }
}
