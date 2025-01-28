package Task_13;
import java.util.Scanner;
/*
В методе main() класса Main выполнить следующее:

- Ввести количество элементов массива и создать массив ссылочных переменных типа Purchase соответствующего размера.
- Затем ввести размер скидки в долях и задать соответствующее поле  для классов FixDiscountPurchase
и FlowDiscountPurchase (одинаковые значение скидки для обоих классов). Также ввести минимальный объем
 покупки для получения скидки и задать его для класса FlowDiscountPurchase.

- Ввести данные для каждого элемента массива. Данные о каждой покупке вводятся с новой строки и отделяются пробелами:
 номер класса, название товара, цена, количество. Номер класса может быть 1, 2 или 3: ( 1 - класс Purchase;
  2 - класс FixDiscountPurchase; 3 - класс FlowDiscountPurchase). Название товара в тестах состоит из одного слова,
  поэтому можно его вводить методом сканнера next().
- Вывести исходный массив покупок на консоль, используя метод toString().
- Найти покупку с максимальной стоимостью и вывести индекс этой покупки в массиве на консоль с новой строки.
 Если покупок с такой стоимостью несколько, то выводится индекс первой их них (первый максимум).
- Определить, являются ли все покупки равными. Вывести с новой строки "YES", если это так, и "NO", если нет.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        Purchase[] basket = new Purchase[size];
        for (int i = 0; i < size; i++) {
            basket[i] = new Purchase();
        }

        double sizeSale = scan.nextDouble();
        FixDiscountPurchase.setDiscount(sizeSale);
        FlowDiscountPurchase.setDiscount(sizeSale);
        FlowDiscountPurchase.setMinAmount(scan.nextInt());

        for (int i = 0; i < basket.length; i++) {
            int numberClass = scan.nextInt();
            if (numberClass == 1) {
                basket[i] = new Purchase(new Commodity(scan.next(), scan.nextInt()), scan.nextInt());
            }
            if (numberClass == 2) {
                basket[i] = new FixDiscountPurchase(new Commodity(scan.next(), scan.nextInt()), scan.nextInt());
            }
            if (numberClass == 3) {
                basket[i] = new FlowDiscountPurchase(new Commodity(scan.next(), scan.nextInt()), scan.nextInt());
            }
        }

        int maxCost = basket[0].getCost();
        int maxIndeks = 0;

        for (int j = 0; j < basket.length; j++) {
            if (basket[j].getCost() > maxCost) {
                maxCost = basket[j].getCost();
                maxIndeks = j;
            }
            System.out.println(basket[j]);
        }

        System.out.println(maxIndeks);

        boolean result = true;
        for (int i = 0; i < basket.length; i++) {
            if (basket[i].getCommodity().equals(basket[0].getCommodity())) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        if (result == true) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
