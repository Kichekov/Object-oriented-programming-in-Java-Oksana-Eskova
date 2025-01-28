package Task_47;

public class ArtDecoCoffeeTable implements CoffeeTable{
    @Override
    public String description() {//описание
        return "Столик в стиле Арт-деко";
    }

    @Override
    public int getCost() {//стоимость
        return 65;
    }
}
