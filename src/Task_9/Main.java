package Task_9;

import java.util.Scanner;

/*
- Считать с консоли размер массива. Если введено отрицательное число,
  то напечатать ERROR и закончить программу.
- Создать массив командировок (типа BusinessTrip) нужного размера.
- Заполнить массив данными, считав их с консоли, кроме последней командировки.
  Гарантируется корректность исходных данных в тестах, поэтому проверять их не нужно.
- Последний объект в массиве создать с помощью конструктора клонирования, сделав
  его копией элемента массива с индексом 0.
- Изменить фамилию в командировке с индексом 0, считав данные с консоли.
- Вывести список всех командировок в csv-формате. Затем вывести пустую строку.
- Ввести с консоли индекс командировки (корректность не проверяем).
  Вывести в csv - формате все командировки, которые считаются равными элементу массива с этим индексом (включая и сам этот элемент).
P.S. Очистить буфер ввода можно методом  scan.skip("\n");
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int iteration = scan.nextInt();
        if (iteration < 0){
            System.out.println("ERROR");
            return;
        }
        BusinessTrip[] trains = new BusinessTrip[iteration];
        for (int i =0; i < iteration; i++){
            if (i != iteration-1) {
                trains[i] = new BusinessTrip(scan.next(), scan.nextInt(), scan.nextInt());
                //scan.skip("\n");
            }
            if (i == iteration - 1) {
                trains[i] = new BusinessTrip(trains[0]);
            }
        }
        trains[0].setName(scan.next());
        int etalon = scan.nextInt();

        for (int i =0; i < trains.length; i++){
            System.out.println(trains[i]);
        }

        System.out.println("");

         for (int i = 0; i < trains.length; i++){
             if (trains[i].equals(trains[etalon])){
                 System.out.println(trains[i]);
             }
         }
    }

}
