package Task_7;
/*
В методе main() класса Main сделать следующе

- Создать объект Стальной_Провод из стали в объёме 0.03м3.
- Плотность стали 7850. Название материала: "steel".
- Вывести информацию о нем на консоль с использованием show().
+ Считать новый объем провода с консоли и изменить объект.
- Изменить материал провода на медь (плотность = 8500, название = "copper").
Т.е. нужно создать новый объект Material и заменить им соответствующее поле объекта Thing.
- Вывести на консоль новую информацию о проводе.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Material steel = new Material("steel",7850);
        Thing steelWire = new Thing("wire",steel,0.03);
        //вывод
        steelWire.show(steelWire.getNameItem(), steel.getNameSubstance(),
                steel.getDensity(),
                steelWire.getVolume(),
                steelWire.getMass());
         //изменение объема
        steelWire.setVolume(scan.nextDouble());
        // изменение материалла
        Material copper = new Material("copper", 8500);
        steelWire.setMaterial(copper);
        steelWire.show(steelWire.getNameItem(), copper.getNameSubstance(),
                copper.getDensity(),
                steelWire.getVolume(),
                steelWire.getMass());
    }
}
