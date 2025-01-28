package Task_47;

public class ArtDecoChair implements Chair{
    @Override
    public String description() {//описание
        return "Кресло в стиле Арт-деко";
    }

    @Override
    public int getCost() {//стоимость
        return 50;
    }
}
