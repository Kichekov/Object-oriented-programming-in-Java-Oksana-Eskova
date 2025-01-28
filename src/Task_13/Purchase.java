package Task_13;

public class Purchase {
    private Commodity commodity;//товар (поле класса Commodity)
    private int number;//количество единиц товара (целое)

    public Purchase() {

    }

    public Purchase(Commodity commodity, int number) {
        this.commodity = commodity;
        this.number = number;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCost() {
        return commodity.getPriseProduct() * number;
    }

    @Override
    public String toString() {
        return commodity.getNameProduct() + ";" + commodity.getPriseProduct() + ";" + number + ";" + getCost();
    }
}
