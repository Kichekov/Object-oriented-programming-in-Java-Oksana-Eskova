package Task_44;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Institution implements PropertyChangeListener{

    private String name;

    public Institution(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(name + evt.getPropertyName() + evt.getOldValue() + ":\n" + evt.getNewValue() );
    }
}
