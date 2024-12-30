package Task_16;

public class Student extends Learner{
    private String university;//Вуз
    private String group;//группа
    private static int basicScholarship; //базовый размер стипендии

    public int calculateScholarship(){
        if(averageGrade() >= 9){
            return (int)(Student.basicScholarship * 1.6);
        }else if(averageGrade() >= 8){
            return (int)(Student.basicScholarship * 1.4);
        }else if(averageGrade() >= 6){
            return (int)(Student.basicScholarship * 1.2);
        }else if(averageGrade() >= 5){
            return Student.basicScholarship;
        }else{
            return 0;
        }
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public static int getBasicScholarship() {
        return basicScholarship;
    }

    public static void setBasicScholarship(int basicScholarship) {
        Student.basicScholarship = basicScholarship;
    }

    @Override
    int free() {
        return 74;
    }

    @Override
    public String toString() {
        return getSurname() + ";" + getEstimation1() + ";" + getEstimation2() + ";" + getUniversity() + ";" + getGroup();
    }

    public Student(String surname, int estimation1, int estimation2, String university, String group) {
        super(surname, estimation1, estimation2);
        this.university = university;
        this.group = group;
    }

    public Student() {

    }
}
