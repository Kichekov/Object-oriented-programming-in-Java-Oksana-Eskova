package Task_34;

public class MySet<E> {
    private E[] list;
    private int k;//индекс свободной ячейки

    public MySet() {
        list = (E[]) new Object[10];
        k = 0;
    }

    public MySet(int n) {
        list = (E[]) new Object[n];
        k = 0;
    }

    public void add(E elem) {

        if (k == list.length) {
            E[] tmp = (E[]) new Object[list.length / 2 + list.length + 1];
            for (int i = 0; i < list.length; i++) {
                tmp[i] = list[i];
            }
            list = tmp;
        }

            boolean flag = false;
            for (int i = 0; i < k; i++) {
                if (elem.equals(list[i])) {
                    flag = true;
                }
            }
            if (!flag) {
                list[k++] = elem;
            }
    }



    public void print() {// распечатать содержимое стека.
        if (k == 0) {
            System.out.println("Стек пуст");
            System.out.println(" ");
            return;
        }
        for (int i = 0; i < k; i++) {
            System.out.println(list[i]);
        }
        System.out.println();
    }
}
