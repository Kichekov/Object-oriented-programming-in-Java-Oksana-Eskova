package Task_28;

import java.util.Scanner;

/*
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

 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int cout = 0;
        String num = "";
        Integer max = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num += str.charAt(i);
            } else {
                if (!num.isEmpty()){
                    if (Integer.parseInt(num) > max) {
                        max = Integer.parseInt(num);
                        num = "";
                    }
            }
        }
        }
        System.out.println(max);
    }
}
