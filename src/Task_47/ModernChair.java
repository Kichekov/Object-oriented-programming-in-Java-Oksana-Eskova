package Task_47;

public class ModernChair implements Chair{
    @Override
    public String description() {//описание
        return "Кресло в стиле Модерн";
    }

    @Override
    public int getCost() {//стоимость
        return 20;
    }
}
