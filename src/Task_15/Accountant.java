package Task_15;

public class Accountant extends Employee {
    private char gruppa; //группа профстандарта (может принимать значения от A до E).
    public Accountant(String surname, String sex, int age, int salary, String gruppa) {
        super(surname, sex, age, salary);
        this.gruppa = gruppa.charAt(0);
    }

    public Accountant() {

    }

    public char getGruppa() {
        return gruppa;
    }

    public void setGruppa(char gruppa) {
        this.gruppa = gruppa;
    }

    @Override
    public void show(String surname, String sex, int age, int salarys) {
        System.out.printf("%s;%s;%d;%d;%s\n", getSurname(), getSex(), getAge(), getSalary(), getGruppa());
    }
}
