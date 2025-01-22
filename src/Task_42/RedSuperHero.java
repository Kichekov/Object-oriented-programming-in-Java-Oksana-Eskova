package Task_42;

public class RedSuperHero extends SuperHero{

    public RedSuperHero() {
        super("Red super-hero");
    }

    @Override
    public int getChanceToSurvive() {
        return 12;
    }
}
