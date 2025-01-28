/*
Описать класс BusinessTrip, хранящий информацию о командировочных расходах работников. Учтите, что денежные средства нужно хранить в целых переменных!

Поля:

суточные в рублях (константа) - присвоить значение 25;
ФИ работника;
транспортные расходы в  рублях;
 количество дней.
Методы:

 getTotal( ) – расчёт общей величины расходов (=транспортные + кол-во дней * суточные);
 show( ) – вывод всех полей на консоль по одному в строке в формате name=value. Пример:
Суточные = 25
Фамилия Имя = Борисов Андрей
Транспортные расходы = 80
Количество дней = 3
Итого расходы = 155
 */

package Task_3;

public class BusinessTrip {
    final int DAILY_ALLOWANCE_MONEY = 25;
    String name;
    int transportationCosts;
    int days;

    void show() {
        System.out.println("Суточные = "+DAILY_ALLOWANCE_MONEY);
        System.out.println("Фамилия Имя = "+name);
        System.out.println("Транспортные расходы = "+transportationCosts);
        System.out.println("Количество дней = "+days);
        System.out.print("Итого расходы = "+getTotal());

    }

    int getTotal() {
        return transportationCosts + days * DAILY_ALLOWANCE_MONEY;
    }
}
