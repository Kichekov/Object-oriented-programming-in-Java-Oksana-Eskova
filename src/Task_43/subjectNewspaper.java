package Task_43;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class subjectNewspaper {
    private PropertyChangeSupport support;
    private int data;
    private int number;

    public subjectNewspaper(int data) {
        this.support = new PropertyChangeSupport (this);
        this.data = data;
    }

    public subjectNewspaper() {
        this.support = new PropertyChangeSupport (this);
    }

    public void registerListener(PropertyChangeListener listener) {//добавление
        support.addPropertyChangeListener(listener);
    }

    public void removeListener(PropertyChangeListener listener) {//удаление
        support.removePropertyChangeListener(listener);
    }

    public void measurementsChanged(){//оповещение
        number++;
        Data newNumber = new Data(number);
        support.firePropertyChange("New:",this.data,newNumber);
        this.data = newNumber.getNumberNomer();

    }
}
