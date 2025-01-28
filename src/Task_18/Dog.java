package Task_18;

public class Dog extends Pet{
    private String breed; //порода

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public Dog() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String getNoise() {
        return "Гав-гав!";
    }

    @Override
    public String toString() {
        return getName() + ";" + getAge() + ";" + getBreed();
    }
}
