package Task_15;

public class Employee {
    private String surname;//фамилия
    private String sex;//пол
    private int age;//возраст
    private int salary;//зарплата в копейках (целое число)

    public Employee(String surname, String sex, int age, int salary) {
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

    public boolean isPensioner(int age, String sex, int salary) {//возвращает true, если сотрудник пенсионного возраста (женщина возраст >= 58 или мужчина возраст >= 63).
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

    public void changeSalary() {// устанавливает зп 90000 пенсионерам
        salary = 90000;
    }

    public void show(String surname, String sex, int age, int salary) {//выводит данные о работнике в csv - формате
        System.out.printf("%s;%s;%d;%d\n", getSurname(), getSex(), getAge(), getSalary());
    }
}
