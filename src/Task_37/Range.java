package Task_37;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterable <Integer>, Iterator <Integer> {
    private int start;
    private int end;
    private int k;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        k = start;
        return this;
    }

    @Override
    public boolean hasNext() {
        return k <= end ;
    }

    @Override
    public Integer next() {
        if (!hasNext()) throw new NoSuchElementException();
        return k++;
    }
}
