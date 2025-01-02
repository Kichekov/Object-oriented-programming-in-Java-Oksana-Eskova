package Task_19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Transport[] transport = new Transport[size];
        for (int i = 0; i < transport.length; i++){
            switch (scanner.nextInt()) {
                case (1):
                    transport[i] = new Lorry(scanner.nextDouble());
                    break;
                case (2):
                    transport[i] = new Ship(scanner.nextDouble());
                    break;
                default:
                    break;
            }
        }

        double weight = scanner.nextDouble();

        for (int i = 0; i < transport.length; i++){

            if (transport[i].canCarry(weight)){
                transport[i].add(weight);
            }
            System.out.println(transport[i]);
        }

    }
}
