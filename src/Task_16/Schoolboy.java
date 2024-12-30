package Task_16;

public class Schoolboy extends Learner{
    private String school;//школа
    private String classSchool;//класс

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getClassSchool() {
        return classSchool;
    }

    public void setClassSchool(String classSchool) {
        this.classSchool = classSchool;
    }

    @Override
    public String toString() {
        return getSurname() + ";" + getEstimation1() + ";" + getEstimation2() + ";" + getSchool() + ";" + getClassSchool();
    }
    @Override
    int free() {
        return 124;
    }

    public Schoolboy(String surname, int estimation1, int estimation2, String school, String classSchool) {
        super(surname, estimation1, estimation2);
        this.school = school;
        this.classSchool = classSchool;
    }

    public Schoolboy() {
    }
}
