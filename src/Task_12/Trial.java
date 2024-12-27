package Task_12;

public class Trial {
    private static int passingGrade;// проходной балл
    private String surname;//фамилия
    private int grade1;//бал 1
    private int grade2;//бал 2

    public Trial() {
        this.grade1 = 0;
        this.grade2 = 0;

    }

    public Trial(String surname, int grade1, int grade2) {
        this.surname = surname;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public Trial(String surname) {
        this.surname = surname;
        this.grade1 = 0;
        this.grade2 = 0;
    }

    public static int getPassingGrade() {
        return passingGrade;
    }

    public static void setPassingGrade(int passingGrade) {
        Trial.passingGrade = passingGrade;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGrade1() {
        return grade1;
    }

    public void setGrade1(int grade1) {
        this.grade1 = grade1;
    }

    public int getGrade2() {
        return grade2;
    }

    public void setGrade2(int grade2) {
        this.grade2 = grade2;
    }

    public boolean isPassed() {
        if (grade1 > passingGrade && grade2 > passingGrade) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return surname + ";" + grade1 + ";" + grade2;

    }
}
