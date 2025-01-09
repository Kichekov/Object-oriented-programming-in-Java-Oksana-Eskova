package Task_26;
public class Stack {
    private char[] array; //ссылка на внутренний массив для хранения очереди
    private int tail; //индекс последнего элемента. индекс первого элемента - 0

    public Stack(int n) {
        array = new char[n];
        tail = -1;
    }

    public void push(char c) throws QueueException {//занести символ в вершину стека;
        if (tail == array.length - 1) throw new QueueException("Стек заполнен!");
        array[++tail] = c;
    }

    public char pop() throws QueueException {//извлечь символ из вершины стека;
        if (tail == -1) throw new QueueException("Попытка извлечь из пустого стека!");

        char tmp = array[tail];
        array[tail] = '\u0000';
        tail--;
        return tmp;

    }

    public void print() {// распечатать содержимое стека.
        if(tail==-1){
            System.out.println("Стек пуст ");
            return;
        }
            for (int i = tail; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }

           // System.out.print(" ");
            System.out.println();


    }

    void clear() {//очистка стека (стек становится пустым)
        tail = -1;
    }
}



