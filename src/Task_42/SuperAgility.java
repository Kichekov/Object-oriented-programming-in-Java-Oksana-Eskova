package Task_42;

public class SuperAgility extends SuperHeroDecorator{

    SuperHero superHero;

    public SuperAgility(SuperHero superHero) {
        this.superHero = superHero;
    }

    @Override
    public int getChanceToSurvive() {
        return 3 + superHero.getChanceToSurvive();
    }

    @Override
    public String getDescription() {
        return superHero.getDescription() + ", super Agility";
    }
}
