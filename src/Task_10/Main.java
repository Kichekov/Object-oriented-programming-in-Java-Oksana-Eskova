package Task_10;
/*
- Считать с консоли размер массива. Если введено отрицательное число,
  то напечатать ERROR и закончить программу.
- Создать массив покупок (типа Purchase) нужного размера.
- Заполнить массив данными, считав их с консоли. Гарантируется корректность исходных
  данных в тестах, поэтому проверять их не нужно.
- Определить максимальную стоимость покупки. Вывести все покупки с данной стоимостью в csv - формате.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        if (size < 0) {
            System.out.print("ERROR");
            return;
        }
        int maxCost = 0;
        int basketNumber = 0;

        Purchase[] basket = new Purchase[size];
        for (int i = 0; i < size; i++) {
            basket[i] = new Purchase(new Commodity(scan.next(), scan.nextInt()), scan.nextInt());
            ;
            if (basket[i].getCost() > maxCost) {
                maxCost = basket[i].getCost();
                basketNumber = i;
            }
        }

        for (int i = 0; i < basket.length; i++) {
            if (basket[i].equals(basket[basketNumber])) {
                System.out.println(basket[i]);

            }


        }
    }

}

