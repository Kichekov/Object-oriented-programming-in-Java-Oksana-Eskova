package Task_47;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public String description() {
        return "Столик в викторианском стиле";
    }

    @Override
    public int getCost() {
        return 70;
    }
}
