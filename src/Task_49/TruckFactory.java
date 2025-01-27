package Task_49;

public class TruckFactory extends TransportFactory{//фабрика грузовиков

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
