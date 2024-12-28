package Task_13;
/*скидка предоставляется в случае, если количество единиц товара не
меньше некоторого заданного объема*/
public class FlowDiscountPurchase extends Purchase {
    static private double discount;//размер скидки
    static private int minAmount;//заданный объем товара, с которого начинает действовать скидка

    public FlowDiscountPurchase() {
    }

    public FlowDiscountPurchase(Commodity commodity, int number) {
        super(commodity, number);
    }

    public static double getDiscount() {
        return discount;
    }

    public static void setDiscount(double discount) {
        FlowDiscountPurchase.discount = discount;
    }

    public static int getMinAmount() {
        return minAmount;
    }

    public static void setMinAmount(int minAmount) {
        FlowDiscountPurchase.minAmount = minAmount;
    }

    @Override
    public int getCost() {
        if (minAmount > getNumber()){
            return super.getCost();
        }
        return super.getCost()-(int)(super.getCost()*discount);
    }

    @Override
    public String toString() {
        return getCommodity().getNameProduct()+ ";" + getCommodity().getPriseProduct()+ ";" + getNumber()+ ";" + discount + ";" + minAmount + ";" + getCost();
    }
}

