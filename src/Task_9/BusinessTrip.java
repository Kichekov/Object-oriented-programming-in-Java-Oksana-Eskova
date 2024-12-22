package Task_9;


/*
- Сделайте все поля приватными согласно принципу инкапсуляции. А методы сделайте публичными.
- Добавьте в класс три разных конструктора, геттеры и сеттеры.
- Создайте четвертый конструктор клонирования.

Переопределите методы класса Object:
equals() и hashCode() - равными считаются командировки, у которых равны общие расходы.
toString() - данные должны выводиться в csv - формате. Также выводятся и общие расходы. Например:
Шумский;4;28;128
 */
public class BusinessTrip {
    private final int DAILY_ALLOWANCE_MONEY = 25;//суточные в рублях (константа) - присвоить значение 25;
    private String name;//ФИ работника;
    private int transportationCosts;//транспортные расходы в  рублях;
    private int days;//количество дней.

    public BusinessTrip() {

    }

    public BusinessTrip(String name) {
        this.name = name;
    }

    public BusinessTrip(String name, int transportationCosts) {
        this.name = name;
        this.transportationCosts = transportationCosts;
    }

    public BusinessTrip(String name, int days, int transportationCosts) {
        this.name = name;
        this.transportationCosts = transportationCosts;
        this.days = days;
    }

    public BusinessTrip(BusinessTrip businessTrip) { // конструктор клонирования
        this.name = businessTrip.name;
        this.transportationCosts = businessTrip.transportationCosts;
        this.days = businessTrip.days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTransportationCosts() {
        return transportationCosts;
    }

    public int getDays() {
        return days;
    }

    public int getDAILY_ALLOWANCE_MONEY() {
        return DAILY_ALLOWANCE_MONEY;
    }

    public int getTotal() {//расчёт общей величины расходов (=транспортные + кол-во дней * суточные);
        return getTransportationCosts() + (getDays() * getDAILY_ALLOWANCE_MONEY());
    }

    @Override
    public String toString() {
        return getName() + ';' + getDays() + ';' + getTransportationCosts() + ';' + getTotal();
    }

    @Override
    public boolean equals(Object o) {
        boolean result = true;
        BusinessTrip another = (BusinessTrip) o;
        return this.getTotal()==another.getTotal();
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(getTotal());
    }

}