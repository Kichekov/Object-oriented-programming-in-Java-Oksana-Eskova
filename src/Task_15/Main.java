package Task_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        Employee[] profession = new Employee[size];
        for (int i = 0; i < profession.length; i++) {
            int indicator = scan.nextInt();
            if (indicator == 1) {
                profession[i] = new Employee(scan.next(), scan.next(), scan.nextInt(), scan.nextInt());
            }

            if (indicator == 2) {
                profession[i] = new Programmer(scan.next(), scan.next(), scan.nextInt(), scan.nextInt(), scan.next(), scan.next());
            }

            if (indicator == 3) {
                profession[i] = new Accountant(scan.next(), scan.next(), scan.nextInt(), scan.nextInt(), scan.next());
            }
        }
        int fot = 0;
        int maxSalary = 0;
        int happyWorker = 0;


        for(int i = 0; i < profession.length; i++){
            if (profession[i] instanceof Employee){
                profession[i].show(profession[i].getSurname(),profession[i].getSex(),profession[i].getAge(), profession[i].getSalary());
                fot += profession[i].getSalary();
                if (profession[i].getSalary() > maxSalary){
                    maxSalary = profession[i].getSalary();
                    happyWorker = i;
                }
            }
            else if (profession[i] instanceof Programmer){
                profession[i].show(profession[i].getSurname(),profession[i].getSex(),profession[i].getAge(), profession[i].getSalary());
                fot += profession[i].getSalary();
                if (profession[i].getSalary() > maxSalary){
                    maxSalary = profession[i].getSalary();
                    happyWorker = i;
                }
            }
            else if (profession[i] instanceof Accountant){
                profession[i].show(profession[i].getSurname(),profession[i].getSex(),profession[i].getAge(), profession[i].getSalary());
                fot += profession[i].getSalary();
                if (profession[i].getSalary() > maxSalary){
                    maxSalary = profession[i].getSalary();
                    happyWorker = i;
                }
            }
        }
        System.out.println(fot);
        profession[happyWorker].show(profession[happyWorker].getSurname(),profession[happyWorker].getSex(),profession[happyWorker].getAge(), profession[happyWorker].getSalary());
        System.out.println();


        boolean flag = false;
        for (Employee employee : profession) {
            if (employee instanceof Programmer && ((Programmer) employee).getSpecialization().equals("frontend")) {
                employee.show(employee.getSurname(), employee.getSex(), employee.getAge(), employee.getSalary());
                flag = true;
            }
        }
        if (!flag) System.out.println("NO");
    }
}
