package Task_45;

public class NoExtraSpaces extends Message implements Editing {
    /*метод edit() удаляет все лишние пробелы в начале и в
     конце текста, оставляя между словами ровно один пробел*/

    @Override
    public String edit(String text) {
        return text.replaceAll("\\s+", " ").trim();
    }
}
