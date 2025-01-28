package Task_47;

public class ModernCoffeeTable implements CoffeeTable{
    @Override
    public String description() {
        return "Столик в стиле Модерн";
    }

    @Override
    public int getCost() {
        return 10;
    }
}
