package Task_7;
/*
Разработайте класс Material, описывающий некоторый физический материал (вещество).

Поля:
- название вещества,
- плотность.
Конструктор:
- с параметрами.
Методы:
- геттеры;
 */
public class Material {
    private String nameSubstance;//название вещества
    private int density;//плотность

    public Material(String nameSubstance, int density) {
        this.nameSubstance = nameSubstance;//название вещества
        this.density = density;//плотность
    }
    

    public String getNameSubstance() {
        return nameSubstance;
    }

    public int getDensity() {
        return density;
    }
}
