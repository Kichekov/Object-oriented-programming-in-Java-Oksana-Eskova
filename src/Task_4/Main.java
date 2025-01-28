package Task_4;

import java.util.Scanner;

/*
В классе Main описать метод main(), в котором:

Создать объект класса Commodity
Считать значения его полей с консоли. При этом в первой строке располагается
 название товара, а во второй - цена в копейках.
Создать объект класса Purchase. В качестве товара задать ранее созданный объект
класса Commodity, а количество считать из следующей строки консоли.
Вывести информацию о покупке, используя метод show().
Считать новую цену товара с консоли. Изменить цену товара в созданном объекте
класса Commоdity.
Вывести пустую строку на консоль.
Вновь вывести информацию о покупке, используя метод show().
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Commodity primaryData = new Commodity();
        primaryData.nameProduct = scan.nextLine();
        primaryData.priseProduct = scan.nextInt();
        Purchase result = new Purchase();
        result.product = Commodity.nameProduct;
        result.number = scan.nextInt();
        System.out.println();
        Purchase.show();
        primaryData.priseProduct = scan.nextInt();

        Purchase.show();
    }
}
