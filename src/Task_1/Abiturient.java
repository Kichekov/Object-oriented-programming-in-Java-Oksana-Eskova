package Task_1;

public class Abiturient {
    String surname;
    String name;
    int math;
    int physics;
    int lang;

    public double average() {
        double averageScore = (double) (math + physics + lang) / 3;
        return averageScore;
    }

    public void print() {
        System.out.printf("%s %s математика = %d физика = %d язык = %d средний балл = %.1f", surname, name, math, physics, lang, average());
    }

}
