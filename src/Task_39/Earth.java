package Task_39;

public class Earth implements CelestialBody{
    private static Earth uniqueInstance;

    private Earth() {
    }

    public static Earth getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Earth();
        }
        return uniqueInstance;
    }
}
