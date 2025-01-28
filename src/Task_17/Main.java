package Task_17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        IShape[] shape = new IShape[size];
        for (int i = 0; i < shape.length; i++) {
            int ind = scan.nextInt();
            switch (ind) {
                case (1):
                    shape[i] = new Rectangle(scan.nextDouble(), scan.nextDouble());
                    break;
                case (2):
                    shape[i] = new Cube(scan.nextDouble());
                    break;
                default:
                    break;
            }
        }
        for (IShape iShape : shape) {
            System.out.printf("%.2f ", iShape.computeSquare());
        }
        System.out.println();

       double sMaxRactangle = 0;
       int iSmax = -1;

        for (int i = 0; i < shape.length; i++) {
            if (shape[i] instanceof Rectangle){
                sMaxRactangle = shape[i].computeSquare();
                iSmax = i;
                break;
            }
        }
        if (iSmax == -1){
            System.out.println("ERROR");
            return;
        }

        for (int i = 0; i < shape.length; i++) {
            if (shape[i] instanceof Rectangle & shape[i].computeSquare() > sMaxRactangle){
                sMaxRactangle = shape[i].computeSquare();
                iSmax = i;
            }
        }

        System.out.printf("Прямоугольник сторона 1 = %.1f , сторона 2 = %.1f Площадь = %.2f", ((Rectangle) shape[iSmax]).getA(), ((Rectangle) shape[iSmax]).getB(), sMaxRactangle);
    }
}
