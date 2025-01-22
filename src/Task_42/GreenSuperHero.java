package Task_42;

public class GreenSuperHero extends SuperHero{

    public GreenSuperHero() {
        super("Green super-hero");
    }

    @Override
    public int getChanceToSurvive() {
        return 10;
    }
}
