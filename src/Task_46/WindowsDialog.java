package Task_46;

public class WindowsDialog extends Dialog {//фабрика кнопок Windows

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
