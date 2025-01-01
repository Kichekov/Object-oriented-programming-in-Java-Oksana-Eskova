package Task_18;

public abstract class Pet {
    private String name; //кличка
    private int age; // возраст

    public Pet() {

    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return getName() + ";" + getAge();
    }

    public abstract String getNoise();
}
