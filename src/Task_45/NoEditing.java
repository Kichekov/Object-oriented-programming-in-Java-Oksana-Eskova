package Task_45;

public class NoEditing extends  Message implements Editing{
    /*метод edit() никак не изменяет строку*/

    @Override
    public String edit(String text) {
        return text;
    }
}
