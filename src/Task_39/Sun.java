package Task_39;

public class Sun implements CelestialBody{
    private static Sun uniqueInstance;

    public Sun() {
    }

    public static Sun getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Sun();
        }
        return uniqueInstance;
    }
}
