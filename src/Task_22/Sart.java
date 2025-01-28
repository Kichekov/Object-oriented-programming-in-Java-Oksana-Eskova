package Task_22;

import java.util.Scanner;

public class Sart {
    public static void main(String[] args) throws BakingException {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        Cook item = new Cook();
        item.turnOvenOn();
        try {
            item.bake(product);
            System.out.println("Блюдо готово");
        }catch (Exception ex){
            System.out.println("Блюдо полностью испортилось: " + ex.getMessage());
        }
        finally {
            System.out.println("Выключаю плиту");
        }
    }
}
