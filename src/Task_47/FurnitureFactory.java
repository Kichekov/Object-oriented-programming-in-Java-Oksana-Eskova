package Task_47;
//единый интерфейс для создание интерфейчсов мебели
public interface FurnitureFactory {
    Chair createChair();//создать кресло
    CoffeeTable createCoffeeTable();//создать стол
    Sofa createSofa();//создать софу
}
