package Task_43;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Hare implements PropertyChangeListener, print {

    private Data data;
    private String name;

    public Hare(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void printText() {
        System.out.println(name + " читает про зайцев в номере " + data.getNumberNomer());
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        Data newData = (Data) evt.getNewValue();
        data = newData;
        printText();

    }
}
