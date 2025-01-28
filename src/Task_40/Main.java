package Task_40;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Logger logger = Logger.getInstance();

        String text = scan.next();
        while (!"end".equals(text)) {
            logger = Logger.getInstance();
            logger.putError(text);
            text = scan.next();
        }

        System.out.println(logger.getErrors());
    }
}

