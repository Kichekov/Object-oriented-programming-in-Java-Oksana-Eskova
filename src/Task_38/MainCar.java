package Task_38;

import java.util.Scanner;

public class MainCar {
    public static void main(String[] args) throws ErrorBoxException, ArrayIndexOutOfBoundsException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//считываем размер гаража (массива)
        Garage<Car> garage = new Garage<Car>(n);//создаем объект гараж
        scanner.nextLine();//очищаем буфер
        String str = scanner.nextLine();
        while (true) {
            String[] mass = str.split(" ");
            switch (mass[0]) {

                    case "1":
                        try {
                        garage.putCar((new Car(mass[1], Double.parseDouble(mass[2]))), Integer.parseInt(mass[3]));
                        }catch (ArrayIndexOutOfBoundsException ignored){scanner.nextLine();}
                        break;

                case "2":
                    int numberGarag = scanner.nextInt();
                    try {
                    System.out.println("--------------");
                    garage.getCar(numberGarag);
                    }catch (Exception ex){
                        System.out.println("ERROR");
                    }
                    System.out.println("--------------");

                    scanner.nextLine();
                    break;
                case "3":
                    garage.print();
                    break;
                default: return;
            }
            str = scanner.nextLine();

        }

    }
}
