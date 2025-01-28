package Task_6;
/*
Доработайте класс Employee, созданный в п.1.2:

1 Сделайте все поля приватными согласно принципу инкапсуляции;
2 Добавьте в класс конструкторы, геттеры и сеттеры.
 */
public class Employee {
    private String surname;
    private String sex;
    private int age;
    private int salary;

    public Employee(String surname, String sex, int age, int salary) {//Конструктор
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

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

    public void changeSalary() {
        salary = 90000;
    }

    public void show(String surname, String sex, int age, int salary) {
        System.out.printf("%s;%s;%d;%d \n", getSurname(), getSex(), getAge(), getSalary());
    }
}

