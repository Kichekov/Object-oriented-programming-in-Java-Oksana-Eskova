package Task_45;

public class NoDigits extends Message implements Editing{
    /*метод edit() удаляет все цифры из текста;*/

    @Override
    public String edit(String text) {
        return text.replaceAll("\\d","");
    }
}
