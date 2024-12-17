package Task_2;

import java.util.Scanner;

/*
В классе Main описать метод main(), в котором:

Создать объект класса Employee
Считать значения его полей с консоли. Все данные располагаются в одной строке
 через пробел
Если сотрудник является пенсионером, то уменьшить его зарплату на 10
 процентов (умножить на коэффициент 0.9). Использовать методы isPensioner()
 и changeSalary()
Вывести данные о сотруднике в csv - формате с помощью метода show().
P.S. Напоминаю, что строки на равенство сравнивает метод equals()!!!
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee person = new Employee();
        person.surname = scan.next();
        person.sex = scan.next();
        person.age = scan.nextInt();
        person.salary = scan.nextInt();
        if (person.isPensioner(person.age, person.sex, person.salary)) {
            person.changeSalary(0.9);
        }
        person.show(person.surname, person.sex, person.age, person.salary);

    }

}
