package Task_11;

import java.util.Scanner;

/*
В методе main() класса Main выполнить следующее
(корректность вводимых данных гарантируется, можно ее не проверять):

- Ввести размер массива автомобилей.
- Создать массив из ссылок на класс Car нужного размера и заполнить его данными, считывая их с консоли.
- Данные при вводе отделяются пробелами.
- Ввести порядковый номер  автомобиля (номер считается с 1) и объем  двигателя.
- Изменить данные об этом автомобиле в массиве, задав сеттером  этот новый объем двигателя.
- Вывести массив на консоль с использованием метода toString( ).
- Вывести пустую строку.
- Найти самый новый автомобиль в массиве и распечатать его данные.
 Если таких автомобилей несколько (с максимальным годом выпуска), то вывести данные первого из них.

 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        Car[] car = new Car[size];
        for (int i = 0; i < size; i++){
            car[i] = new Car(scan.next(), scan.next(), scan.nextDouble(),scan.nextInt());
        }
        car[scan.nextInt()-1].setVolume(scan.nextDouble());

        int year = car[0].getManufactureYear();
        int youngCar = 0;

        for (int i = 0; i < car.length; i++) {
            if (car[i].getManufactureYear() > year){
                year = car[i].getManufactureYear();
                youngCar = i;
            }
            System.out.println(car[i]);
        }
        System.out.println();
        System.out.println(car[youngCar]);
    }
}
