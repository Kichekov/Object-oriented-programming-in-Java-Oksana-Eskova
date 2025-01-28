package Task_49;

public class ShipFactory extends TransportFactory{//фабрика морских судов

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
