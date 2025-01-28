package Task_2;
/*
Поля:

фамилия
пол
возраст
зарплата в копейках (целое число)
Методы:

boolean isPensioner() – возвращает true, если сотрудник пенсионного
возраста (женщина возраст >= 58 или мужчина возраст >= 63).
void changeSalary(double koef)  - изменяет зарплату работника, умножая ее
 на некоторый коэффициент
void show() - выводит данные о работнике в csv - формате
(поля, отделенные точкой с запятой). Пример:
 Ivanov;male;48;90000
 */
public class Employee {
    String surname;
    String sex;
    int age;
    int salary;

    public boolean isPensioner(int age, String sex, int salary) {
        this.salary = salary;
        boolean result = false;
        if (sex.equals("male")) {
            if (age >= 63) {
                result = true;
            }
        }
            if (sex.equals("female")) {
                if (age >= 58) {
                    result = true;
                }
            }
        return result;
    }

    public void changeSalary(double koef) {
        salary *= koef;
    }

    public void show(String surname, String sex, int age, int salary) {
        System.out.printf("%s;%s;%d;%d", surname, sex, age, salary);
    }
}
