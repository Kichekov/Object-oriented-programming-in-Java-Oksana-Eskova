package Task_14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        Car[] car = new Car[size];
        for (int i = 0; i < size; i++) {
            int numberClass = scan.nextInt();
            if (numberClass == 1) {
                car[i] = new Car(scan.next(), scan.next(), scan.nextDouble(), scan.nextInt());
            }
            if (numberClass == 2) {
                car[i] = new Truck(scan.next(), scan.next(), scan.nextDouble(), scan.nextInt(), scan.nextDouble());
            }
        }

        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }
        System.out.println();

        double weight = scan.nextDouble();
        boolean flag = false;
        for (int i = 0; i < car.length; i++) {
            if (car[i] instanceof Truck && (((Truck) car[i]).ifCanCarry(weight)) & car[i].getLife() <= 6) {
                flag = true;
                System.out.println(car[i]);
            }
        }
        if (!flag){
            System.out.println("NO");
        }
    }
}
