package Task_6;



/*
В классе Main опишите метод main(), в котором нужно:

1 Считать с консоли размер массива. Если введено отрицательное число, то вывести "ERROR"
 и закончить программу.

2 Создать массив сотрудников заданного размера;

3 Заполнить массив данными, считав их с консоли. В каждой строке указывается через пробел:
 фамилия, пол, возраст и зарплата в копейках.

4 Для всех пенсионеров задать одинаковую зарплату 90000 копеек.

5 Вывести данные о всех сотрудниках в csv - формате, используя метод show().
 Информация о каждом сотруднике выводится с новой строки.

Тестовые данные
Sample Input:

3
Сидоров male 67 78000
Петрова female 45 120000
Семенов male 36 140000
Sample Output:

Сидоров;male;67;90000
Петрова;female;45;120000
Семенов;male;36;140000
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        if (size < 0){
            System.out.print("ERROR");
            return;
        }
        Employee[] human = new Employee[size];
        for (int i = 0; i < size; i++){// цикл заполнения массива работников
            human[i] = new Employee();
            human[i].setSurname(scan.next());
            human[i].setSex(scan.next());
            human[i].setAge(scan.nextInt());
            human[i].setSalary(scan.nextInt());
        }

        for (int i = 0; i < human.length; i++) {//цикл корректировки зп пенсионерам
            if (human[i].isPensioner(human[i].getAge(), human[i].getSex(), human[i].getSalary())) {
                human[i].changeSalary();
            }
        }

        for (int i = 0; i < human.length; i++){//цикл вывода массива сотрудников
            human[i].show(human[i].getSurname(),human[i].getSex(),human[i].getAge(),human[i].getSalary());
        }

    }
}
