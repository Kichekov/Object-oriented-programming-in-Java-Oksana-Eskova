package Task_7;
/*
Также разработайте класс Thing, описывающий однородный предмет, состоящий из
одного материала.

Поля:
- название предмета,
- материал (поле имеет тип класса Material),
- объём (вещественное число).
Конструкторы:
- по умолчанию;
- с параметрами.
Методы:
- геттеры и сеттеры;
- getMass( ) – вычисление массы предмета (= плотность * объём);
- show( ) –   вывод информации об объекте в csv формате (название предмета,
 название вещества, плотность, объем). Последним значением выводится масса.
  Пример:   wire;steel;7850;0.03;235.5
 */
public class Thing {
    private String nameItem; //название предмета
    private Material material;//материал (поле имеет тип класса Material),
    private double volume;//объём (вещественное число).


    public Thing(String nameItem, Material material, double volume) {
        this.nameItem = nameItem;
        this.material = material;
        this.volume = volume;
    }

    public Thing() {
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


    public double getMass(){//вычисление массы предмета (= плотность * объём);
        return getVolume() * material.getDensity();
    }

    public void show(String getNameItem, String getNameSubstance,int getDensity, double getVolume, double getMass){
        System.out.printf("%s;%s;%d;%.2f;%.1f\n",
                getNameItem,
                getNameSubstance,
                getDensity,
                getVolume,
                getMass);
    }
}
