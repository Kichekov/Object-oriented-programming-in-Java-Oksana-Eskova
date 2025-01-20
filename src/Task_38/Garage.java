package Task_38;

public class Garage<E> {
    private E[] array; //ссылка на внутренний массив для хранения очереди
    private int tail;

    public Garage(int n) {
        array = (E[]) new Object[n];
        tail = 0;
    }

    public boolean isFree(int number) { //проверяет, верный ли номер и свободен ли бокс
        boolean result = false;
        if (number >= 0 & number <= array.length) {
            if (array[number] == null) {
                result = true;
            }
        }
        return result;

    }

    public void putCar(E unit, int i) {  // поставить машину в гараж в бокс i
        if (isFree(i - 1)) {
            //if (array[i-1] == null){
            array[i - 1] = unit;
            tail++;
        } else {
            for (int j = array.length - 1; i >= 0; j--) {
                if (array[j] == null) {
                    array[j] = unit;
                    tail++;
                    break;
                }
            }
        }
    }

    public E getCar(int i) throws ErrorBoxException {//взять машину из гаража из i-го бокса
        if (!((i - 1) >= 0 && (i - 1) <= array.length)) {
            throw new ErrorBoxException();
        } else if (array[i] == null) {
            throw new ErrorBoxException();
        } else {
            E result = (E) array[i - 1];
            System.out.println(array[i - 1]);
            array[i - 1] = null;
            tail--;
            return result;
        }
    }

    public void print() {// распечатать содержимое стека.
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i] + " ");
        }
    }
}
