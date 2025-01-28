package Task_27;

import java.util.Scanner;

public class StartMain {
    public static void main(String[] args) throws notMatchTemplate {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        //Проверка соответствию шаблона
        try {
            if (!text.matches("[0-9]{1,3}[-+/*%][0-9]{1,3}")) {
                throw new notMatchTemplate("ERROR");
            }
        } catch (notMatchTemplate e) {
            System.out.println(e.getMessage());
            return;
        }
        //Определение операндов
        String[] mass = text.split("[-+/*%]");
        //Определение оператора
        String znak = "";
        String[] elemints = new String[]{"+", "-", "/", "*", "%"};
        for (String elemint : elemints) {
            if (text.indexOf(elemint) > 0) {
                znak = elemint;
                break;
            }
        }

        Integer oneNum = Integer.parseInt(mass[0]);
        Integer twoNum = Integer.parseInt(mass[1]);
        int result = 0;
        try {
            result = switch (znak) {
                case "+" -> oneNum + twoNum;
                case "-" -> oneNum - twoNum;
                case "/" -> oneNum / twoNum;
                case "*" -> oneNum * twoNum;
                case "%" -> oneNum % twoNum;
                default -> result;
            };
        }catch (ArithmeticException ex){
            System.out.println("ERROR");
            return;
        }

        System.out.println(mass[0] + znak + mass[1] + "=" + result);

    }
}

