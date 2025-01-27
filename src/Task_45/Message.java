package Task_45;

public class Message {
    protected String text;
    protected Editing editWay;

    public Message() {
    }

    public Message(String text, Editing editWay) {
        this.text = text;
        this.editWay = editWay;
    }

    public void print(){
        this.text = editWay.edit(text);
        System.out.println(text);
    }
}
