package Task_47;

public class ArtDecoSofa implements Sofa{
    @Override
    public String description() {//описание
        return "Диван в стиле Арт-деко";
    }

    @Override
    public int getCost() {//стоимость
        return 90;
    }
}
