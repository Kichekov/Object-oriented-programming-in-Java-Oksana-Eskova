package Task_45;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int number = scanner.nextInt();
        switch (number){
            case 1: {
                Message message = new Message(str, new NoExtraSpaces());
                message.print();
            }
            break;
            case 2: {
                Message message = new Message(str, new NoDigits());
                message.print();
            }
            break;
            case 3: {
                Message message = new Message(str, new CapsFirstLetters());
                message.print();
            }
            break;
            default:{
                Message message = new Message(str, new NoEditing());
                message.print();
            }
        }
    }
}
