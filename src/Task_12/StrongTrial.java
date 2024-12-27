package Task_12;

public class StrongTrial extends Trial {
    private int timeTest;//время прохождения теста
    static int timeLimit;

    public StrongTrial(){

    }

    public StrongTrial(String surname, int grade1, int grade2, int timeTest) {
        super(surname, grade1, grade2);
        this.timeTest = timeTest;
    }

    public int getTimeTest() {
        return timeTest;
    }

    public void setTimeTest(int timeTest) {
        this.timeTest = timeTest;
    }

    @Override
    public boolean isPassed() {
        return super.isPassed() && timeTest<timeLimit;
    }

    @Override
    public String toString() {
        return super.toString() +";"+ timeTest;
    }
}
