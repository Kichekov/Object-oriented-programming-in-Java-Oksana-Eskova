package Task_33;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws StackException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> student = new ArrayList<>();
        Stack stack = new Stack<>(10);
        String srt = scanner.nextLine();
        while (!srt.equals("Конец")) {
            String[] parts = srt.split(" ");
            int age = Integer.parseInt(parts[2]);
            double ball = Double.parseDouble(parts[1]);
            Student soul = new Student(parts[0], ball, age);
            stack.push(soul);
            srt = scanner.nextLine();
        }
        stack.print();
    }
}

