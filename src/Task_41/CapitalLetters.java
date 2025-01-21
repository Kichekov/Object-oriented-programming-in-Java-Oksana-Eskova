package Task_41;
//сделать все буквы прописными
public class CapitalLetters extends MessageDecorator {
    Message message;

    public CapitalLetters(Message message) {
        this.message = message;
    }

    @Override
    public String getMessage() {

        return message.getMessage().toUpperCase();

    }
}
