package Task_23;

import java.util.Scanner;

public class MainA {
    public static void main(String[] args) throws TooManyCarsException {
        Scanner scanner = new Scanner(System.in);
        Parking place = new Parking((byte) 10);
        byte quantity = scanner.nextByte();
        System.out.println("Приехали на парковку");
        try {
            place.check(quantity);
            System.out.println("Припарковались");
        } catch (TooManyCarsException ex){
            System.out.println(ex.getMessage());;
            System.out.println("Припарковались в другом месте");
        }
        finally {
            System.out.println("Выходим из машин");
        }
    }
}
