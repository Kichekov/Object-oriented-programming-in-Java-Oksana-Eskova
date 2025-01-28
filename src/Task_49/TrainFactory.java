package Task_49;

public class TrainFactory extends TransportFactory{//фабрика поездов

    @Override
    public Transport createTransport() {
        return new Train();
    }
}
