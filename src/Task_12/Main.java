package Task_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StrongTrial strongTrial = new StrongTrial();
        Trial.setPassingGrade(scan.nextInt());//Ввести проходной балл
        StrongTrial.timeLimit = scan.nextInt();//Ввести лимит времени

        int size = scan.nextInt();
        Trial[] trail = new Trial[size];

        for (int i = 0; i < size; i++) {
            int num = scan.nextInt();
            if (num == 1) {
                trail[i] = new Trial(scan.next(), scan.nextInt(), scan.nextInt());
            }
            if (num == 2) {
                trail[i] = new LightTrial(scan.next(), scan.nextInt(), scan.nextInt());
            }
            if (num == 3) {
                trail[i] = new StrongTrial(scan.next(), scan.nextInt(), scan.nextInt(), scan.nextInt());
            }

        }

        for (int i = 0; i < trail.length; i++) {
            System.out.println(trail[i]);
        }
        System.out.println();

        for (int i = 0; i < trail.length; i++) {
            if (trail[i].isPassed()) {
                System.out.println(trail[i]);
            }
        }
    }
}
