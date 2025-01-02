package Task_19;

public class Lorry implements Transport{
    private double maxWeight; //грузоподъемность
    private double totalWeight; //вес груза

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + "maxWeight=" + maxWeight + ", " + "totalWeight=" + getTotalWeight() + "}";
    }

    @Override
    public boolean canCarry(double weight) {//проверяет, может ли объект перевезти заданный груз
        return maxWeight > weight;
    }

    @Override
    public void add(double weight) {//добавить груз
        totalWeight += weight;

    }

    @Override
    public double getTotalWeight() {//возвращает общий груз
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Lorry(double maxWeight) {
        this.maxWeight = maxWeight;
    }
}
