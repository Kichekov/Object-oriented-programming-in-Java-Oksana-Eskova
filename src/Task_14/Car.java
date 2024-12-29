package Task_14;

import java.util.Calendar;
public class Car {
    private String brand;//марка авто
    private String surname;//фамилия владельца
    private double volume;// объем двигателя
    private int manufactureYear;//год выпуска
    static private int currentYear;//текущий год

    static {
        Calendar cal = Calendar.getInstance();
        currentYear = cal.get(Calendar.YEAR);
    }

    public Car() {

    }

    public Car(String brand, String surname, double volume, int manufactureYear) {
        this.brand = brand;
        this.surname = surname;
        this.volume = volume;
        this.manufactureYear = manufactureYear;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static int getCurrentYear() {
        return currentYear;
    }

    public int getLife() { //расчет возраста автомобиля в годах.
        return currentYear - manufactureYear;

    }

    @Override
    public String toString() {
        return "Car{brand=" + "'" + brand + "', " + "owner=" + "'" + surname + "', " + "volume=" + volume + ", " + "yearOfMade=" + manufactureYear + '}';
    }
}
