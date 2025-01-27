package Task_44;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
public class Informator {

    private PropertyChangeSupport support;
    private String name;
    private String words;


    public Informator() {
        this.support = new PropertyChangeSupport (this);
    }

    public Informator(String name) {
        this.support = new PropertyChangeSupport (this);
        this.name = name;
    }

    public void addListener(PropertyChangeListener listener) {//добавление
        support.addPropertyChangeListener(listener);
    }

    public void removeListener(PropertyChangeListener listener) {//удаление
        support.removePropertyChangeListener(listener);
    }

    public void setText(String words){
         support.firePropertyChange(" received information from ", this.name, words);
         this.words = words;

    }

}
