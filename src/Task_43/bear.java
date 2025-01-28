package Task_43;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class bear implements PropertyChangeListener, print {

    private Data data;
    private String name;

    public bear(String name, subjectNewspaper subjectNewspaper) {
        this.name = name;
        subjectNewspaper.registerListener(this);
    }

    public String getName() {
        return name;
    }

    @Override
    public void printText() {
        System.out.println (name + " читает про медведей в номере " + data.getNumberNomer());

    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        Data newData = (Data) evt.getNewValue();
        data = newData;
        printText();


    }
}
