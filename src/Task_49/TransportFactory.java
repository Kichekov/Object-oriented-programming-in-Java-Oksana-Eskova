package Task_49;

public abstract class TransportFactory {


    public abstract Transport createTransport();  //метод который возвращает транспорт

    static TransportFactory createNewTransportFactory(String value){ //метод который позволяет узнать какой вит транспорта нам необходим
        if (value.equalsIgnoreCase("Train")){//если пользователь вводит ГРУЗОВИК
            return new TrainFactory();
        } else if (value.equalsIgnoreCase("Truck")) {//если пользователь вводит ПОЕЗД
            return new TruckFactory();
        } else if (value.equalsIgnoreCase("Ship")) {//если пользователь вводит СУДНО
            return new ShipFactory();
        }else throw new RuntimeException("Нет результата");

    }
}
