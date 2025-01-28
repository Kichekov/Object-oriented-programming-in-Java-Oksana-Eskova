package Task_42;

public class SuperIntelligence extends SuperHeroDecorator {

    SuperHero superHero;

    public SuperIntelligence(SuperHero superHero) {
        this.superHero = superHero;
    }

    @Override
    public int getChanceToSurvive() {
        return 7 + superHero.getChanceToSurvive();
    }

    @Override
    public String getDescription() {
        return superHero.getDescription() + ", super Intelligence";
    }
}
