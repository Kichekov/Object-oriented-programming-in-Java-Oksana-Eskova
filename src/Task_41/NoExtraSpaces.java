package Task_41;
//удалить все лишние пробелы в начале и в конце, а также между словами оставить ровно один пробел
public class NoExtraSpaces extends MessageDecorator {
    Message message;

    public NoExtraSpaces(Message message) {
        this.message = message;;
    }

    @Override
    public String getMessage() {

        return message.getMessage().replaceAll("\\s+", " ").trim();

    }
}
