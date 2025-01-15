package Task_33;

public class Stack<E> {
    private E[] array; //ссылка на внутренний массив для хранения очереди
    private int tail; //индекс последнего элемента. индекс первого элемента - 0

    public Stack(int n) {
        array = (E[]) new Object[10];
        tail = -1;
    }

    public void push(E elem) throws StackException{//занести символ в вершину стека;
        if (tail == array.length - 1) throw new StackException("Стек заполнен!");
        array[++tail] = elem;
    }

    public void print(){// распечатать содержимое стека.
        if(tail==-1){
            System.out.println("Стек пуст");
            System.out.println(" ");
            return;
        }
        for (int i = tail; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
