package Task_16;

public abstract class Learner {
    private String surname; //Фамилия
    private int estimation1; // Оценка 1
    private int estimation2; // Оценка 2

    abstract int free(); //абстрактный метод «каникулы», который возвращает общую продолжительность каникул в году.

    public double averageGrade (){// метод вычисляющий средний бал

        return (double) (estimation1 + estimation2) / 2;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getEstimation1() {
        return estimation1;
    }

    public void setEstimation1(int estimation1) {
        this.estimation1 = estimation1;
    }

    public int getEstimation2() {
        return estimation2;
    }

    public void setEstimation2(int estimation2) {
        this.estimation2 = estimation2;
    }

    public Learner(String surname, int estimation1, int estimation2) {
        this.surname = surname;
        this.estimation1 = estimation1;
        this.estimation2 = estimation2;
    }

    public Learner() {

    }
}
