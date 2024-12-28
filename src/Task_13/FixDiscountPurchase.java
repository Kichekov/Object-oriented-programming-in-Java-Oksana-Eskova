package Task_13;

public class FixDiscountPurchase extends Purchase{
    static private double discount;//размер скидки в долях

    public static double getDiscount() {
        return discount;
    }

    public static void setDiscount(double discount) {
        FixDiscountPurchase.discount = discount;
    }

    public FixDiscountPurchase() {
    }

    public FixDiscountPurchase(Commodity commodity, int number) {
        super(commodity, number);
    }

    @Override
    public int getCost() {
        return super.getCost()-(int)(super.getCost()*discount);
    }

    @Override
    public String toString() {
        return getCommodity().getNameProduct()+ ";" + getCommodity().getPriseProduct()+ ";" + getNumber()+ ";" +discount+ ";" +getCost();
    }
}
