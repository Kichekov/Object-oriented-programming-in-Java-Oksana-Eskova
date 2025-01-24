package Task_43;

import java.beans.PropertyChangeListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        subjectNewspaper subjectNewspaper = new subjectNewspaper();
        bear bear = new bear("Потап");
        bear bearN = new bear("Настасья");
        Hare hare = new Hare("Трусишка");
        Wolf wolf = new Wolf("Алекс");
        subjectNewspaper.registerListener(bear);
        subjectNewspaper.registerListener(bearN);
        subjectNewspaper.registerListener(hare);
        subjectNewspaper.registerListener(wolf);
        subjectNewspaper.measurementsChanged();
        System.out.println();

        String remove = scanner.next();

        switch (remove){
            case "Потап": {
                subjectNewspaper.removeListener(bear);
                System.out.println(bear.getName() + " не хочет получать газету");
            }
            break;
            case "Настасья": {
                subjectNewspaper.removeListener(bearN);
                System.out.println(bearN.getName() + " не хочет получать газету");
            }
            break;
            case "Трусишка": {
                subjectNewspaper.removeListener(hare);
                System.out.println(hare.getName() + " не хочет получать газету");
            }
            break;
            case "Алекс": {
                subjectNewspaper.removeListener(wolf);
                System.out.println(wolf.getName() + " не хочет получать газету");
            }
            break;

        }

        System.out.println();

        subjectNewspaper.measurementsChanged();
    }
}
