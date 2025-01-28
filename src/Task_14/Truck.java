package Task_14;

public class Truck extends Car {
    private double weight;
    private double capacity;

    public double getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean ifCanCarry(double weight) {//возвращает true, если грузовик может перевести груз указанного веса.
        return capacity > weight;

    }

    public Truck(double weight, double capacity) {
        this.weight = weight;
        this.capacity = capacity;
    }

    public Truck(String brand, String surname, double volume, int manufactureYear, double capacity) {
        super(brand, surname, volume, manufactureYear);
        //this.weight = weight;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Truck{brand=" + "'" + getBrand() + "', " + "owner=" + "'" + getSurname() + "', " + "volume=" + getVolume() + ", " + "yearOfMade=" + getManufactureYear() + ", " + "capacity=" + getCapacity() + '}';
    }
}
