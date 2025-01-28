package Task_4;

import java.util.Stack;

/*
Описать класс Purchase, описывающий покупку товара.

Поля:
товар (поле класса Commodity)
количество единиц товара (целое)
Методы:
int getCost() - вычисляет стоимость покупки в копейках (цена * количество).
 Этот метод должен быть приватным.
void show() - выводит на консоль значения всех полей по одному в строке в
формате name: value. Этот метод публичный. Пример:
Наименование товара: сахар
Цена товара: 260
Количество: 5
Стоимость покупки: 1300
 */
public class Purchase {//Покупка
    String product = Commodity.nameProduct;//товар (поле класса Commodity)
    static int number;//количество единиц товара (целое)

    private static int getCost() {
        return Commodity.priseProduct * number;
    }

    static void show() {
        Commodity.show();
        System.out.println("Количество: " + number);
        System.out.println("Стоимость покупки: " + getCost());
    }
}
