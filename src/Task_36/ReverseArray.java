package Task_36;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReverseArray implements Iterable <Integer>, Iterator <Integer> {
    private int[] arry;
    private int count;


    public ReverseArray(int[] arry) {
        this.arry = arry;

    }

    @Override
    public Iterator<Integer> iterator() {
        count = arry.length-1;
        return this;

    }

    @Override
    public boolean hasNext() {
        return count >= 0;
    }

    @Override
    public Integer next() {
        if (!hasNext()) throw new NoSuchElementException();
        return arry[count--];
    }
}
