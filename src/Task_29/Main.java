package Task_29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String text = scanner.nextLine();
        double num = 0;
        String[] arr = text.split("#");
        for (int i = 0; i < arr.length; i++){
            try {
                num +=Double.parseDouble(arr[i]);
            }catch (Exception ex){
                num +=0;
            }
        }
        System.out.printf("%.1f",num);
    }
}
