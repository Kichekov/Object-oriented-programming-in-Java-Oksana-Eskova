/*
Доработайте класс Abiturient, созданный в п.1.2:

1/ Сделайте все поля приватными согласно принципу инкапсуляции;
2/ Добавьте в класс три разных конструктора, геттеры и сеттеры.
Должен заработать код, представленный в классе Main. Этот код менять нельзя!

Тестовые данные
Sample Input:

Семенов 70 60 57
Sample Output:

Семенов : 0.0
Петров : 80.0
Алексиевич : 62.3

 */
package Task_5;

public class Abiturient {
    private String surname;
    private String name;
    private int math;
    private int physics;
    private int lang;

    public Abiturient() {
    }

    public Abiturient(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public Abiturient(String surname, String name, int math, int physics, int lang) {
        this.surname = surname;
        this.name = name;
        this.math = math;
        this.physics = physics;
        this.lang = lang;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public void setLang(int lang) {
        this.lang = lang;
    }

    public String getSurname() {
        return surname;
    }

    public double average() {
        double averageScore = (double) (math + physics + lang) / 3;
        return averageScore;
    }

    public void print() {
        System.out.printf("%s %s математика = %d физика = %d язык = %d средний балл = %.1f", surname, name, math, physics, lang, average());
    }
}
