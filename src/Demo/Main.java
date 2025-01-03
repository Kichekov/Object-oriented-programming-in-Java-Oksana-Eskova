package Demo;

import Elements.Keyboard;
import Elements.Monitor;
import Elements.Mouse;

public class Main {
    public static void main(String[] args) {
        var keyboard = new Keyboard();
        var mouse = new Mouse();
        var monitor = new Monitor();

        Computer computer = new Computer(keyboard, mouse, monitor);
        computer.show();
    }
}
