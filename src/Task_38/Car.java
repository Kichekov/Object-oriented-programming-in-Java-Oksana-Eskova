package Task_38;

public class Car {
    private String make;//марка
    private double displacementEngine;// объем двигателя

    public Car() {
    }

    public Car(String make, double displacementEngine) {
        this.make = make;
        this.displacementEngine = displacementEngine;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getDisplacementEngine() {
        return displacementEngine;
    }

    public void setDisplacementEngine(double displacementEngine) {
        this.displacementEngine = displacementEngine;
    }

    @Override
    public String toString() {
        return make + ';' + displacementEngine;

    }
}
