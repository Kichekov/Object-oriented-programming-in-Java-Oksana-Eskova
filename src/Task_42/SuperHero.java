package Task_42;
//Основной класс Супер герой
public abstract class SuperHero {
    private int ChanceToSurvive;
    private String description;

    public SuperHero() {
    }

    public SuperHero(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public abstract int getChanceToSurvive();
}
