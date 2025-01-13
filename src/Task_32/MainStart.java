package Task_32;

import java.util.ArrayList;
import java.util.Scanner;

public class MainStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> adultStudent = new ArrayList<>();
        ArrayList<Student> teenagersStudent = new ArrayList<>();
        String srt = scanner.nextLine();
        while (!srt.equals("end")) {
            String[] parts = srt.split(" ");
            int age = Integer.parseInt(parts[2]);
            double ball = Double.parseDouble(parts[1]);
            Student soul = new Student(parts[0], ball, age);
            if (soul.getAge() > 17) {
                adultStudent.add(soul);
            } else {
                teenagersStudent.add(soul);
            }
            srt = scanner.nextLine();
        }
        if (!teenagersStudent.isEmpty()) {
            System.out.println(teenagersStudent);
        } else {
            System.out.println("Пустой список");
        }

        if (!adultStudent.isEmpty()) {
            System.out.println(adultStudent);
        } else {
            System.out.println("Пустой список");
        }
    }
}
