package Task_47;

public class ModernSofa implements Sofa{
    @Override
    public String description() {//описание
        return "Диван в стиле Модерн";
    }

    @Override
    public int getCost() {//стоимость
        return 80;
    }
}
