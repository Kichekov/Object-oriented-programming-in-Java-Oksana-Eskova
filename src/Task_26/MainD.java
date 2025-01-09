package Task_26;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MainD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Stack stack = new Stack(scan.nextInt());
        int choice;
        char sim;
        try {
            while (true) {
                choice = scan.nextInt();
                try {
                    switch (choice) {
                        case 1:
                            sim = scan.next().charAt(0);
                            stack.push(sim);
                            break;
                        case 2:
                            sim = stack.pop();
                            System.out.println("Извлечено: " + sim);
                            break;
                        case 3:
                            stack.print();
                            break;
                        case 4:
                            stack.clear();
                            break;
                        default:
                            return;
                    }
                } catch (QueueException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (InputMismatchException exr) {
            System.out.println("Некорректный ввод данных");
        }
    }
}


