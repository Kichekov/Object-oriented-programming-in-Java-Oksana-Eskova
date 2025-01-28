package Task_17;

public class Cube implements IShape{
    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Cube(double a) {
        this.a = a;
    }

    public Cube() {

    }

    @Override
    public double computeSquare() {
        return 6*Math.pow(a,2);
    }
}
