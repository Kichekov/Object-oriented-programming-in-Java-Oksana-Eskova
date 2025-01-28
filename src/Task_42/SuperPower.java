package Task_42;

public class SuperPower extends SuperHeroDecorator{

    SuperHero superHero;

    public SuperPower(SuperHero superHero) {
        this.superHero = superHero;
    }

    @Override
    public int getChanceToSurvive() {
        return 4 + superHero.getChanceToSurvive();
    }

    @Override
    public String getDescription() {
        return superHero.getDescription() + ", super Power";
    }
}
