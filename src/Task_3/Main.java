package Task_3;

import java.util.Scanner;

/*
В классе Main описать метод main(), в котором:

Создать объект класса BusinessTrip
Считать значения его полей с консоли. При этом в первой строке
 располагаются фамилия и имя, а во второй - количество дней и транспортные
  расходы через пробел.
Вывести данные о командировке методом show().

 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BusinessTrip persont = new BusinessTrip();
        persont.name = scan.nextLine();
        persont.days = scan.nextInt();
        persont.transportationCosts = scan.nextInt();
        persont.show();
    }
}
