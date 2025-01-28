package Task_24;

import java.util.Scanner;

public class MainB {
    public static void main(String[] args) throws HeavyLuggageException {
        Scanner scanner = new Scanner(System.in);
        Luggage volume = new Luggage(10);
        double weight = scanner.nextDouble();
        System.out.println("Надо пройти регистрацию на рейс");
        try {
            volume.checkLuggage(weight);
            System.out.println("Доплата за вес не нужна");
        }
        catch (HeavyLuggageException ex){
            System.out.println(ex.getMessage());
            System.out.println("Нужно оплатить превышение веса по тарифу");
        }
        finally {
            System.out.println("Регистрация пройдена");
        }
    }
}
