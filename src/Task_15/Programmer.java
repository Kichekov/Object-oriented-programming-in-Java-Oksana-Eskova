package Task_15;

public class Programmer extends  Employee{
    private String status; //поле может принимать значения: junior, middle, senior.
    private String specialization; //поле может принимать значения: frontend, backend, fullstack, mobile.

    public Programmer(String surname, String sex, int age, int salary, String status, String specialization) {
        super(surname, sex, age, salary);
        this.status = status;
        this.specialization = specialization;
    }

    public Programmer(String status, String specialization) {
        this.status = status;
        this.specialization = specialization;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void show(String surname, String sex, int age, int salary) {
        System.out.printf("%s;%s;%d;%d;%s\n", getSurname(), getSex(), getAge(), getSalary(), getStatus());
    }
}
