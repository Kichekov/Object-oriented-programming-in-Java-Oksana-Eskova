package Task_47;

public class VictorianChair implements Chair{
    @Override
    public String description() {//описание
        return "Кресло в викторианском стиле";
    }

    @Override
    public int getCost() {//стоимость
        return 80;
    }
}
