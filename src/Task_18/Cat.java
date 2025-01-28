package Task_18;

public class Cat extends Pet{
    String color; // окрас

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public Cat() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getNoise() {
        return "Мяу-мяу!";
    }

    @Override
    public String toString() {
        return  getName() + ";" + getAge() + ";" + getColor();
    }
}
