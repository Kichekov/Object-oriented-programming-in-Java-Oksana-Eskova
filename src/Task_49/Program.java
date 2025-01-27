package Task_49;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        TransportFactory transportFactory = TrainFactory.createNewTransportFactory("Train");//Пользователь указывает какой нужен транспорт
        Transport transport = transportFactory.createTransport();//создаем пранспорт через фабрику
        transport.transportgoods();//указываем что транспорт везет груз

    }
}
