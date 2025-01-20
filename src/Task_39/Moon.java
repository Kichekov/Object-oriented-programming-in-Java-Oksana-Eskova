package Task_39;

public class Moon implements CelestialBody{
    private static Moon uniqueInstance;

    public Moon() {
    }

    public static Moon getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Moon();
        }
        return uniqueInstance;
    }
}

