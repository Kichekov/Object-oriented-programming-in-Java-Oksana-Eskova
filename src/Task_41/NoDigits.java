package Task_41;
//удалить все цифры в строке
public class NoDigits extends MessageDecorator{
    Message message;

    public NoDigits(Message message) {
        this.message = message;
    }

    @Override
    public String getMessage() {

        return message.getMessage().replaceAll("\\d","");
    }

}
