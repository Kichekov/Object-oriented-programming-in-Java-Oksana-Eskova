package Task_33;

public class Student {
    private String surname;//Фамилия студента
    private double averageScore;// Средний балл
    private int age ;// Возраст

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String surname, double averageScore, int age) {
        this.surname = surname;
        this.averageScore = averageScore;
        this.age = age;
    }

    @Override
    public String toString() {
        return  surname + ';' + averageScore + ';' + age;
    }
}
