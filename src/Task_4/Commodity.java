package Task_4;
/*
Описать класс Commodity, описывающий товар.
Поля:
название товара;
цена в копейках.
Метод:
void show() - выводит на консоль значения всех полей по одному
 в строке в формате name: value. Пример:
Наименование товара: сахар
Цена товара: 260

 */
public class Commodity {//Товар
    static String nameProduct;//название товара
    static int priseProduct;//цена в копейках.
   static void show(){
        System.out.println("Наименование товара: "+ nameProduct);
        System.out.println("Цена товара: "+ priseProduct);
    }
}
