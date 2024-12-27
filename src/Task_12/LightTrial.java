package Task_12;

public class LightTrial extends Trial {
    public LightTrial(String surname, int grade1, int grade2) {
        super(surname, grade1, grade2);
    }

    public LightTrial() {
    }

    public LightTrial(String surname) {
        super(surname);
    }
    @Override
    public boolean isPassed() {
        if (getGrade1() + getGrade2() > getPassingGrade()) {
            return true;
        }
        return false;
    }
}
