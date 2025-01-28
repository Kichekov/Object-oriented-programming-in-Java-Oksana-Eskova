package Task_46;

public abstract class Dialog {

    Dialog dialog;

    Button button = createButton();

    public abstract Button createButton();

    public void renderWindow() {
        System.out.println("Рисуем окно диалога");
        button.render();
    }
}
