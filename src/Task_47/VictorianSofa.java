package Task_47;

public class VictorianSofa implements Sofa{
    @Override
    public String description() {//описание
        return "Диван в викторианском стиле";
    }

    @Override
    public int getCost() {//стоимость
        return 110;
    }
}
